import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.method.annotation.ResponseBodyEmitter;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.concurrent.CountDownLatch;


@Slf4j
@SpringBootApplication
@Configurable
@RestController("mysql")
@RequestMapping("/api/hystrix/")
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class);
    }

    /**
     * curl http://localhost:8091/api/hystrix/query_order_info
     */
    @HystrixCommand(commandProperties = {
            @HystrixProperty(name = "execution.isolation.thread.timeoutInMilliseconds", value = "550")
    }, fallbackMethod = "queryOrderInfo_error"
    )
    @RequestMapping(value = "query_order_info", method = RequestMethod.GET)
    public String queryOrderInfo() throws InterruptedException {
        new CountDownLatch(1).await();
        return "您的订单信息查询完毕";
    }

    private String queryOrderInfo_error() throws InterruptedException {
        return "Fallback Hello";
    }

    /**
     * curl http://localhost:8091/api/hystrix/stream
     */
    @HystrixCommand(commandProperties = {
            @HystrixProperty(name = "execution.isolation.thread.timeoutInMilliseconds", value = "150")
    }, fallbackMethod = "stream_error"
    )
    @RequestMapping(value = "/stream", method = RequestMethod.GET)
    public ResponseBodyEmitter stream(HttpServletResponse response) throws Exception {
        response.setContentType("text/event-stream");
        response.setCharacterEncoding("UTF-8");
        response.setHeader("Cache-Control", "no-cache");

        ResponseBodyEmitter emitter = new ResponseBodyEmitter();

        emitter.send("异步响应");

        new Thread(() -> {
            for (int i = 0; i < 200; i++) {
                try {
                    emitter.send("hi xfg-dev-tech-grafana\r\n" + i);
                    Thread.sleep(250);
                } catch (Exception e) {
                    throw new RuntimeException(e);
                }
            }
            emitter.complete();
        }).start();

        return emitter;
    }

    public ResponseBodyEmitter stream_error(HttpServletResponse response) throws IOException {
        response.setContentType("text/event-stream");
        response.setCharacterEncoding("UTF-8");
        response.setHeader("Cache-Control", "no-cache");

        ResponseBodyEmitter emitter = new ResponseBodyEmitter();
        emitter.send("Err");
        emitter.complete();
        return emitter;
    }

}
