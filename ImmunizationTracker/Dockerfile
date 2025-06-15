FROM eclipse-temurin:21-jdk-jammy

WORKDIR /app

COPY .mvn .mvn
COPY mvnw pom.xml ./

RUN apt-get update && \
    apt-get install -y dos2unix && \
    dos2unix mvnw && \
    chmod +x mvnw

RUN ./mvnw dependency:go-offline -B

COPY src src

RUN ./mvnw clean package -DskipTests

EXPOSE 8081

RUN addgroup --system spring && adduser --system --ingroup spring spring
USER spring:spring

ENTRYPOINT ["java", "-jar", "target/VaccineManagementSystem-0.0.1-SNAPSHOT.jar"]
