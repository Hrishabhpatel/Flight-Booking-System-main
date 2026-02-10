#Base Image with Java 17
FROM amazoncorretto:17-alpine


# Set working directory inside container
WORKDIR /app

#COPY Spring Boot  fat JAR
COPY target/API-Gateway-0.0.1-SNAPSHOT.jar app.jar

#Expose Gateway port
EXPOSE 8091

#Run API Gateway
ENTRYPOINT ["java","-jar","app.jar"]