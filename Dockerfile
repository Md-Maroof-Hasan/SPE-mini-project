FROM eclipse-temurin:17-jre

WORKDIR /app

COPY target/spe-mini-project-1.0.jar app.jar

CMD ["java","-jar","app.jar"]