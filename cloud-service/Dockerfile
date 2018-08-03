FROM java
WORKDIR /custom
COPY target/cloud-service-1.0.0-SNAPSHOT.jar cloud-server.jar
ENTRYPOINT ["java", "-Xmx128m", "-Xms128m", "-jar", "cloud-server.jar","-Dspring.profiles.active=in1"]
EXPOSE 8101
