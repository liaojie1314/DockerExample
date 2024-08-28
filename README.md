<br />
<p align="center">
  <h2 align="center" style="font-weight: 600">Docker Example</h2>

</p>



## Dockerfile

+ centos-jdk17
  + SpringBoot3 docker 部署基础环境
+ cuda-cudnn
  + TensorRT8.2 docker环境

## Docker Compose

+ canal
  + canal主要用途是基于 MySQL 数据库增量日志解析，提供增量数据订阅和消费。
  + 工作原理:canal 模拟 MySQL slave 的交互协议，伪装自己为 MySQL slave ，向 MySQL master  发送dump 协议。在 MySQL master 收到 dump 请求，开始推送 binary log 给 slave (即 canal )  这样 canal 再解析 binary log （binlog）进行配置分发，同步到 Elasticsearch 等系统中进行使用。
+ elk
  + Elastic Stack 技术栈，别是 `Elasticsearch`、`Logstash`、`Kibana` 组成，简称 ELK 是一套针对日志数据做解决方案的框架。它使您能够聚合来自所有系统和应用程序的日志，分析这些日志，并创建可视化来进行应用程序和基础设施监控、更快的故障排除、安全分析等。
    + E = Elasticsearch：Elasticsearch 是在 Apache Lucene 上构建的分布式搜索和分析引擎。对各种语言、高性能和无架构 JSON 文档的支持使 Elasticsearch 成为各种日志分析和搜索使用案例的理想选择。
    + L = Logstash：Logstash 是一个开源数据摄取工具，允许您从各种来源收集数据，转换数据，并将数据发送到您希望的目标。通过预构建的筛选器和对 200 多种插件的支持，Logstash 使用户能够轻松摄取数据，无论数据源或类型如何。
    + K = Kibana：Kibana  是一种数据可视化和挖掘工具，可以用于日志和时间序列分析、应用程序监控和运营智能使用案例。它提供了强大且易用的功能，例如直方图、线形图、饼图、热图和内置的地理空间支持。此外，付费的 Kibana 还有 x-pack-jdbc 可以使用，让你就像使用 MyBatis 操作 MySQL 数据库一样操作  Elasticsearch 数据。
+ grafana
  + 使用 Prometheus + Grafana 部署监控



## 相关阅读

1. [docker](https://www.yuanyuan.blog/posts/f255ffad.html)

2. [dockerfile例子](https://www.yuanyuan.blog/posts/36423b00.html)
3. [docker-compose例子](https://www.yuanyuan.blog/posts/bad9d448.html)