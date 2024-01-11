FROM openjdk:17.0.1

WORKDIR /app

COPY target/FullStackProject3-0.0.1-SNAPSHOT.jar  /app

EXPOSE 8080

CMD ["java" , "-jar", "FullStackProject3-0.0.1-SNAPSHOT.jar"]