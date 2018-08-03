FROM java
MAINTAINER wanlinus wanlinus@qq.com
WORKDIR /custom
COPY ./target/config-server-1.0.0-SNAPSHOT.jar config-server.jar
ENTRYPOINT ["java", "-Xmx128m", "-Xms128m", "-jar", "config-server.jar"]
EXPOSE 8000