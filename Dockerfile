FROM maven:3.6.3-jdk-8 AS build-env
WORKDIR /usr/src/app
COPY / ./
RUN mvn install && mv /usr/src/app/target/*.jar /usr/src/app/app.jar
FROM alpine
COPY --from=build-env /usr/src/app/app.jar .
RUN apk update && apk add openjdk8-jre
EXPOSE 8080
ENTRYPOINT [ "java", "-jar", "app.jar"]