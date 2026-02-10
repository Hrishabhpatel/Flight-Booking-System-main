#Stable java 17 Base image
FROM amazoncorretto:17-alpine

#Set WORKING directory
WORKDIR /app

#COPY Spring Boot app
COPY target/Messaging-Service-0.0.1-SNAPSHOT.jar app.jar

#Expose the Messaging Service port
EXPOSE 8086

#Run Messageing Service
ENTRYPOINT ["java","-jar","app.jar"]