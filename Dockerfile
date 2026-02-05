FROM eclipse-temurin:17-jdk-alpine
EXPOSE 9999
COPY target/static-0.0.1-SNAPSHOT.jar static.jar
ENTRYPOINT [ "java","-jar","/static.jar" ]