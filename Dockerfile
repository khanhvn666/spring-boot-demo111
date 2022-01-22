FROM adoptopenjdk/openjdk11-openj9:alpine-slim
ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} app.jar
#COPY event-checkin-postgres.json event-checkin-postgres.json
#COPY templates /templates
ENTRYPOINT ["java","-jar","app.jar"]