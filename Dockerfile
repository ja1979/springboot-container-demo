FROM openjdk:8-jre-alpine

ENV JAVA_OPTS=""

ADD target/*.jar /app.jar

EXPOSE 8080

CMD java ${JAVA_OPTS} -jar /app.jar




