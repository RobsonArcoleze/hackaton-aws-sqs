# Stage 1: Build the application
FROM maven:3.9.6-eclipse-temurin-21-alpine AS build
  ##3.9.6-eclipse-temurin-22-alpine

  # Set the working directory inside the container
WORKDIR /app

  # Copy the Maven project files to the container
COPY ../ .

  # Build the project and create an executable JAR file
RUN ./gradlew clean build -x test

  # Stage 2: Run the application
FROM openjdk:21-jdk

  # Set the working directory inside the container
WORKDIR /app

  # Copy the JAR file from the previous stage
COPY --from=build /app/build/libs/*.jar app.jar

  # Expose the application port (adjust if necessary)
EXPOSE 8787

  # Set the entry point to run the Spring Boot application
ENTRYPOINT ["java", "-jar", "app.jar"]



##Instructions:
## From project root:
##docker build -f Docker/Dockerfile -t upload-frame-flow  .
##docker-compose -f Docker/docker-compose.yml up
