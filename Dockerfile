# Giai đoạn 1: Build ứng dụng bằng Maven và Java 17
FROM maven:3.9-eclipse-temurin-17 AS build
WORKDIR /app
COPY . .
RUN mvn clean package -DskipTests

# Giai đoạn 2: Chạy ứng dụng bằng Java 17 (Bản Alpine siêu nhẹ)
FROM eclipse-temurin:17-jdk-alpine
WORKDIR /app
# Copy file .jar từ giai đoạn build sang
COPY --from=build /app/target/*.jar app.jar
EXPOSE 8080
ENTRYPOINT ["java","-jar","app.jar"]