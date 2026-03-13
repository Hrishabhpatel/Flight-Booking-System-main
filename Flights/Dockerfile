# Stable Java 17 image
FROM amazoncorretto:17-alpine

# Set working directory
WORKDIR /app

# Copy Spring Boot fat JAR
COPY target/flight-service-0.0.1-SNAPSHOT.jar app.jar

# Expose Flight service port
EXPOSE 8082

# Run Flight service
ENTRYPOINT ["java","-jar","app.jar"]
