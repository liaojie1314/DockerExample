# 基础镜像
FROM openjdk:8-jre-slim
# 作者
MAINTAINER liaojie1314
# 配置
ENV PARAMS=""
# 时区
ENV TZ=PRC
RUN ln -snf /usr/share/zoneinfo/$TZ /etc/localtime && echo $TZ > /etc/timezone
# 添加应用
ADD /target/skywalking-app.jar /skywalking-app.jar
## 在镜像运行为容器后执行的命令
ENTRYPOINT ["java", "-Xmx512m", "-javaagent:../skywalking-agent/skywalking-agent.jar", "-Dskywalking.agent.service_name=skywalking-app", "-Dskywalking.collector.backend_service=ip:11800", "-jar", "/skywalking-app.jar"]
