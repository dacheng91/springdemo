# 添加 Java 8 镜像来源
FROM java:8
VOLUME /tmp
ARG JAR_FILE
RUN echo $JAR_FILE

# 添加 Spring Boot 包
ADD target/${JAR_FILE} /app.jar
EXPOSE 8080
# 执行启动命令
ENTRYPOINT ["java","-Xms100m -Xmx100m","-jar","app.jar"]