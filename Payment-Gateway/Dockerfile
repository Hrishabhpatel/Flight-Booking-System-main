#Stable Java 17Base image
FROM amazoncorretto:17-alpine

#Set WORKING directory
WORKDIR /app

#COPY Spring Boot fat jar
COPY target/Payment-Gateway-0.0.1-SNAPSHOT.jar app.jar

#Expose Payment-gateway port
EXPOSE 8085

#RUN Payment-gataway service
ENTRYPOINT ["java","-jar","app.jar","--spring.profiles.active=docker"]