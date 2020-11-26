FROM openjdk:8
ADD /target/spring-app.jar spring-app.jar
EXPOSE 8085
ENTRYPOINT ["java", "-jar", "spring-app.jar"]