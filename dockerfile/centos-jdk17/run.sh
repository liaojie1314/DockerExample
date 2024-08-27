#!/bin/bash

# 下载 JDK 17 安装包
DOWNLOAD_URL="https://download.oracle.com/java/17/latest/jdk-17_linux-x64_bin.tar.gz"
DOWNLOAD_FILE="jdk-17_linux-x64_bin.tar.gz"

echo "正在下载 JDK 17 安装包..."
if wget "$DOWNLOAD_URL" -O "$DOWNLOAD_FILE"; then
    echo "JDK 17 下载成功。"
else
    echo "JDK 17 下载失败，请检查网络连接或 URL。"
    exit 1
fi

# 询问用户输入镜像名称和版本号
read -p "请输入镜像名称:版本号（默认 jdk17:1.0）: " CONTAINER_NAME
CONTAINER_NAME=${CONTAINER_NAME:-'jdk17:1.0'}

# 检查 Dockerfile 是否存在
if [[ ! -f Dockerfile && ! -f dockerfile ]]; then
    echo "Dockerfile 不存在，请确保当前目录包含 Dockerfile。"
    exit 1
fi

# 构建 Docker 镜像
echo "正在构建 Docker 镜像..."
if docker build -t "$CONTAINER_NAME" .; then
    echo "Docker 镜像构建成功，镜像名称: $CONTAINER_NAME"
else
    echo "Docker 镜像构建失败，请检查 Dockerfile 和构建过程中的错误信息。"
    exit 1
fi

echo "删除下载的安装包..."
rm -f "$DOWNLOAD_FILE"
