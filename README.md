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

## 相关阅读

1. [docker](https://www.yuanyuan.blog/posts/f255ffad.html)

2. [dockerfile例子](https://www.yuanyuan.blog/posts/36423b00.html)
3. [docker-compose例子](https://www.yuanyuan.blog/posts/bad9d448.html)