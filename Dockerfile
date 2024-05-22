FROM eclipse-temurin:21-jdk-alpine
COPY target/*.jar app.jar
ENTRYPOINT ["sh", "-c", "java ${JAVA_OPTS} -jar /app.jar ${0} ${@}"]