FROM openjdk:8-jdk-alpine
EXPOSE 8090
ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} springboot-docker-jenkins.jar
ENTRYPOINT ["java","-jar","/springboot-docker-jenkins.jar"]