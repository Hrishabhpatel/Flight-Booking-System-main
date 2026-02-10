#stable Java 17 Base image
FROM amazoncorretto:17-alpine

#Set working directory
WORKDIR /app

#COPY Spring Boot fat JAR
COPY target/Search-0.0.1-SNAPSHOT.jar app.jar

#Expose Search service port
EXPOSE 8083

#Run Search service
ENTRYPOINT ["java","-jar","app.jar","--spring.profiles.active=docker"]