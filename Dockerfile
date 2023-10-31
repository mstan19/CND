FROM openjdk:17
COPY target/CND-0.0.1-SNAPSHOT.jar /CND-0.0.1-SNAPSHOT.jar
# Starting the application
ENTRYPOINT ["java","-jar","/CND-0.0.1-SNAPSHOT.jar"]