FROM openjdk:11
ADD build/libs/restapi-0.0.1-SNAPSHOT.jar restapi.jar
EXPOSE 8088
ENTRYPOINT ["java", "-jar", "restapi.jar"]
