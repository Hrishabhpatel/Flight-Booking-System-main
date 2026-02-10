#Stable Java 17 base image
FROM amazoncorretto:17-alpine

#Set working directory
WORKDIR /app

#COPY Spring Boot fat JAR
COPY target/Security-0.0.1-SNAPSHOT.jar app.jar

#Expose Security service port
EXPOSE 8081

#Run Security service
ENTRYPOINT ["java","-jar","app.jar"]