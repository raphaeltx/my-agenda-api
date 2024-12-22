FROM eclipse-temurin:21-jre

WORKDIR /app

COPY target/my-agenda-api-1.0.0.jar app.jar

EXPOSE 3000

ENTRYPOINT ["java", "-jar", "app.jar"]
