# Use base image
FROM openjdk:8-jdk-alpine

# Set work directory
WORKDIR /opt

# Copy the jar
COPY target/springdemo-0.0.1-SNAPSHOT.jar /opt/app.jar

# Execute
ENTRYPOINT exec java -jar /opt/app.jar
