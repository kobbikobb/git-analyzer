FROM gradle:6.7.0-jdk11 AS build
COPY --chown=gradle:gradle . /home/gradle/src
WORKDIR /home/gradle/src
RUN gradle build --no-daemon

#/home/gradle/src/build/libs

FROM openjdk:11
COPY --from=build /home/gradle/src/build/libs/restapi-0.0.1-SNAPSHOT.jar restapi.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "restapi.jar"]
