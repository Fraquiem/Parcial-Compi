#Copiado textual de la clase del 21 de agosto
#build
FROM maven:3.9.6-eclipse-temurin-21 AS build
WORKDIR /app

COPY pom.xml .

RUN mvn dependency:go-offline       #Copiar las dependencias de maven

COPY src ./src

RUN mvn clean package -DskipTests

#Exportar

FROM eclipse-temurin:21-jdk-alpine

WORKDIR /app

COPY --from=build /app/target/*.jar app.jar

EXPOSE 8069

ENTRYPOINT ["java","-jar","app.jar"]