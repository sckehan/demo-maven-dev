FROM openjdk:8-jdk-alpine
VOLUME /tmp
MAINTAINER Guan Chao Li <lgclish@cn.ibm.com>
COPY target/*.jar app.jar

ENV JAVA_OPTS="-Dspring.config.location=file:/deployments/config/application.properties"
ENTRYPOINT exec java $JAVA_OPTS -jar app.jar