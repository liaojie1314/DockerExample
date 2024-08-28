import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@SpringBootApplication
@Configurable
@RestController()
@RequestMapping("/api/ratelimiter/")
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class);
    }

    /**
     * curl http://localhost:8091/api/ratelimiter/login?fingerprint=uljpplllll01009&uId=1000&token=8790
     */
    @RequestMapping(value = "login", method = RequestMethod.GET)
    public String login(String fingerprint, String uId, String token) {
        log.info("模拟登录 login fingerprint:{}", fingerprint);
        return "模拟登录：登录成功 " + uId;
    }

}
