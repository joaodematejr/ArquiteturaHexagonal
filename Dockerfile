# Use a base image with Java (you can choose a specific Java version)
FROM openjdk:17

# Set the working directory in the container
WORKDIR /app

# Copy the JAR file into the container
COPY target/your-spring-boot-app.jar /app/app.jar

# Expose the port your Spring Boot app is running on
EXPOSE 8080

# Define the command to run your application
CMD ["java", "-jar", "app.jar"]
