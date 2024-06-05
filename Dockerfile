FROM openjdk:17-jdk-alpine
MAINTAINER vamsi.com
COPY build/lib/spring-demo1-0.0.1.jar spring-demo1-0.0.1.jar
ENTRYPOINT ["java","-jar","/spring-demo1-0.0.1.jar"]