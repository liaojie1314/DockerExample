### 下载默认配置文件

```shell
wget https://raw.githubusercontent.com/grafana/loki/main/examples/getting-started/loki-config.yaml -O loki-config.yaml
wget https://raw.githubusercontent.com/grafana/loki/main/examples/getting-started/alloy-local-config.yaml -O alloy-local-config.yaml
wget https://raw.githubusercontent.com/grafana/loki/main/examples/getting-started/docker-compose.yaml -O docker-compose.yaml
```

### 启动

```shell
docker compose up -d
```

### 验证

Read组件： http://localhost:3101/ready

Write组件：http://localhost:3102/ready

Grafana Alloy UI：http://localhost:12345