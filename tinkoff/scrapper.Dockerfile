FROM openjdk:19

COPY scrapper/target/scrapper-1.0.jar app.jar

ENTRYPOINT exec java -jar /app.jar

