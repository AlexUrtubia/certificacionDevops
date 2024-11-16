FROM openjdk:17-jdk-alpine
WORKDIR /app
COPY target/hola-mundo-0.0.1-SNAPSHOT.jar myapp.jar
ENTRYPOINT ["java", "-jar", "myapp.jar"]
EXPOSE 8081
