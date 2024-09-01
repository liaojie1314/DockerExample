CONTAINER_NAME=skywalking-app
IMAGE_NAME=liaojie1314/skywalking-app:1.0
PORT=9091

echo "容器部署开始 ${CONTAINER_NAME}"

# 停止容器
docker stop ${CONTAINER_NAME}

# 删除容器
docker rm ${CONTAINER_NAME}

# 启动容器 skywalking-agent 下载：https://archive.apache.org/dist/skywalking/java-agent/8.9.0/apache-skywalking-java-agent-8.9.0.tgz
docker run --name ${CONTAINER_NAME} \
-p ${PORT}:${PORT} \
-v /docs/skywalking-agent/:/docs/skywalking-agent/ \
-d ${IMAGE_NAME}

echo "容器部署成功 ${CONTAINER_NAME}"

docker logs -f ${CONTAINER_NAME}
