FROM openjdk:17-jdk-alpine
EXPOSE 8090

# Copy the JAR file into the image and ensure the name matches in ENTRYPOINT
ADD target/tp-foyer-5.0.0.jar /app/tp-foyer-5.0.0.jar

# Run the JAR file with the correct name
ENTRYPOINT ["java","-jar","/app/tp-foyer-5.0.0.jar"]