FROM eclipse-temurin:17-jdk-alpine as build
WORKDIR /app
COPY target/*.jar app.jar

FROM eclipse-temurin:17-jre-alpine
COPY --from=build /app/app.jar app.jar

ENTRYPOINT ["java","-jar","app.jar"]
