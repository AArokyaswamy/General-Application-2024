FROM openjdk:21-slim
ADD target/*.jar demo3-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java", "-jar",  "/demo3-0.0.1-SNAPSHOT.jar"]