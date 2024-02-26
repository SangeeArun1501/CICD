# Use a base image with Java installed
FROM openjdk:11-jre-slim

# Set the working directory in the container
WORKDIR /app

# Copy the compiled Java application JAR file into the container
COPY target/SimpleWebApp-4.0-SNAPSHOT.jar /app/SimpleWebApp-4.0-SNAPSHOT.jar

# Expose the port on which your Java application listens (if any)
EXPOSE 8080

# Command to run the Java application when the container starts
CMD ["java", "-jar", "SimpleWebApp-4.0-SNAPSHOT.jar"]
