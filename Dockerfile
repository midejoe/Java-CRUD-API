# Use the official OpenJDK base image with Java 17
FROM openjdk:17-jdk-alpine

# Copy the JAR file into the container
COPY target/crud-v1.jar crud-v1.jar

EXPOSE 8080

# Define the entry point to run your application
ENTRYPOINT ["java", "-jar", "crud-v1.jar"]

