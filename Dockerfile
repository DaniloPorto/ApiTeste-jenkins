FROM openjdk:11
WORKDIR /app
COPY ./target/ApiTeste-0.0.1-SNAPSHOT.jar ./ApiTeste.jar
CMD [ "java", "-jar",  "ApiTeste.jar"]