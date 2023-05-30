FROM openjdk:17
VOLUME /tmp
EXPOSE 8080
ARG JAR_FILE=target/jendemo.jar
ADD ${JAR_FILE} jendemo.jar
ENTRYPOINT ["java","-jar","/jendemo.jar"]