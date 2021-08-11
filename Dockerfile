FROM openjdk:8-jdk-alpine
LABEL maintainence="swlee9087"
VOLUME /main-app
ADD build/libs/mongoJAVA-0.0.1-SNAPSHOT.jar app.jar
EXPOSE 8080
ENTRYPOINT ["java","-jar","app.jar"]