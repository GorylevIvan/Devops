FROM openjdk:18
WORKDIR target
COPY /*.jar DevOps-1.0-SNAPSHOT.jar
EXPOSE 8080
CMD ["java", "-jar", "DevOps-1.0-SNAPSHOT.jar"]
