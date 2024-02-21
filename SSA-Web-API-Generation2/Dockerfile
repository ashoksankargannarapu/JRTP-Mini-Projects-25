FROM openjdk:11

COPY target/SSA-Web-API-Generation-0.0.1-SNAPSHOT.jar /usr/app/

WORKDIR /usr/app

EXPOSE 9898

ENTRYPOINT ["java", "-jar", "SSA-Web-API-Generation-0.0.1-SNAPSHOT.jar"]
