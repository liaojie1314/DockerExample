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
+ ignite
  + 基于内存的分布式SQL数据库Apache Ignite的部署
  + Apache  Ignite是一个兼容ANSI-99、水平可扩展以及容错的分布式SQL数据库，作为一个SQL数据库，Ignite支持所有的DML指令，包括SELECT、UPDATE、INSERT和DELETE，它还实现了一个与分布式系统有关的DDL指令的子集。Ignite的一个突出特性是完全支持分布式的SQL关联，Ignite支持并置和非并置的数据关联。并置时，关联是在每个节点的可用数据集上执行的，而不需要在网络中移动大量的数据，这种方式在分布式数据库中提供了最好的扩展性和性能。
+ jenkins
  + 主要作用:把需要在本地机器完成的 Maven 构建、Docker  镜像发布、云服务器部署等系列动作全部集成在一个服务下。简化构建部署操作过程，因为 Jenkins 也被称为  CI&CD(持续集成&持续部署) 工具。提供超过 1000 个插件(Maven、Git、NodeJs)来支持构建、部署、自动化， 满足任何项目的需要。
+ mysql
  + MySQL一主二从同步高可用集群
  + [详细搭建过程](https://www.yuanyuan.blog/posts/bad9d448.html#mysql%E4%B8%80%E4%B8%BB%E4%BA%8C%E4%BB%8E%E5%90%8C%E6%AD%A5%E9%AB%98%E5%8F%AF%E7%94%A8%E9%9B%86%E7%BE%A4)

+ redis-sentinel
  + redis高可用一主二从三哨兵集群
  + [详细搭建过程](https://www.yuanyuan.blog/posts/bad9d448.html#redis%E9%AB%98%E5%8F%AF%E7%94%A8%E4%B8%80%E4%B8%BB%E4%BA%8C%E4%BB%8E%E4%B8%89%E5%93%A8%E5%85%B5%E9%9B%86%E7%BE%A4)
+ skywalking
  + 通过 Docker 方式部署一套 skywalking 非入侵的全链路监控系统,，并在对应的测试工程中通过 skywalking-agent 字节码增强组件，采集系统运行时的各项信息到 skywalking-ui 监控平台观察数据。




## 相关阅读

1. [docker](https://www.yuanyuan.blog/posts/f255ffad.html)

2. [dockerfile例子](https://www.yuanyuan.blog/posts/36423b00.html)
3. [docker-compose例子](https://www.yuanyuan.blog/posts/bad9d448.html)