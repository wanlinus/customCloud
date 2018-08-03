FROM java
MAINTAINER wanlinus wanlinus@qq.com
WORKDIR /custom
COPY ./target/eureka-server-1.0.0-SNAPSHOT.jar eureka-server.jar
ENTRYPOINT ["java", "-Xmx128m", "-Xms128m", "-jar", "eureka-server.jar"]
EXPOSE 8000