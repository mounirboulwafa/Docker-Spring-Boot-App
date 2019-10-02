FROM openjdk:8-jdk-alpine
VOLUME /tmp
ADD target/demo*.jar /spring-demo.jar
CMD ["java", "-jar", "/spring-demo.jar", "--spring.profiles.active=prod"]
EXPOSE 8080