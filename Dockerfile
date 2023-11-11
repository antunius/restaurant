# Use the official OpenJDK 19 image as a base image
FROM openjdk:21-slim

# Set the working directory
WORKDIR /app

# Copy the necessary files to the container
COPY /build/libs/restaurant-v1.jar /app/restaurant-v1.jar

# Command to run the application
CMD ["java", "-jar", "restaurant-v1.jar"]
