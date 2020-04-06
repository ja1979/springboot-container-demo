FROM openjdk:8-jre-alpine

ENV SLEEP_SECONDS=0 \
    JAVA_OPTS=""

ADD target/*.jar /app.jar

EXPOSE 8080

CMD echo "The application will start in ${SLEEP_SECONDS}s..." && \
    sleep ${SLEEP_SECONDS} && \
    java ${JAVA_OPTS} -jar /app.jar




