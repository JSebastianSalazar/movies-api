FROM openjdk:17-jdk-slim

WORKDIR /app

COPY target/movies-0.0.1-SNAPSHOT.jar /app/app.jar

EXPOSE 8080

CMD ["java", "-Djava.security.egd=file:/dev/./urandom", "-jar", "app.jar"]