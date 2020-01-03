FROM openjdk:8
COPY /target/outreach_observer_service-0.0.1-SNAPSHOT.jar /
EXPOSE 8082
CMD ["java","-jar","-Deureka.datacenter=cloud","-Dspring.profiles.active=aws","outreach_observer_service-0.0.1-SNAPSHOT.jar"]