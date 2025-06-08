# Use official OpenJDK 21 base image to match your local Java version
FROM eclipse-temurin:21-jdk-jammy

# Set working directory
WORKDIR /app

# Copy Maven wrapper files
COPY mvnw .
COPY .mvn .mvn

# Copy pom.xml
COPY pom.xml .

# Download dependencies first (this layer will be cached unless pom.xml changes)
RUN ./mvnw dependency:go-offline -B

# Copy source code
COPY src src

# Build the application (skip tests for faster build, run them in CI separately)
RUN ./mvnw clean package -DskipTests

# The application runs on port 8081 (as shown in your logs)
EXPOSE 8081

# Run as non-root user for security
RUN addgroup --system spring && adduser --system --ingroup spring spring
USER spring:spring

# Command to run the application (adjust JAR name if different)
ENTRYPOINT ["java", "-jar", "target/ImmunizationTracker-0.0.1-SNAPSHOT.jar"]