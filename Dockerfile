# Importing JDK and copying required files
FROM openjdk:17-jdk-slim
WORKDIR /app
COPY pom.xml .
COPY src src
ARG JAR_FILE=target/abc-0.0.1-SNAPSHOT.jar
COPY ${JAR_FILE} app.jar

# Copy Maven wrapper
COPY mvnw .
COPY .mvn .mvn

# Set execution permission for the Maven wrapper
RUN chmod +x ./mvnw
RUN ./mvnw clean package -DskipTests

# Copy the JAR from the build stage
COPY --from=build /app/target/*.jar app.jar
ENTRYPOINT ["java","-jar","/app.jar"]
EXPOSE 8080
