# Usa una imagen base de OpenJDK para Java 11
FROM openjdk:11-jre-slim

# Directorio de trabajo en el contenedor
WORKDIR /app

# Copia el JAR construido al contenedor
COPY target/movies-0.0.1-SNAPSHOT.jar /app/app.jar

# Puerto en el que tu aplicación Spring Boot escucha
EXPOSE 8080

# Comando para iniciar la aplicación
CMD ["java", "-jar", "app.jar"]