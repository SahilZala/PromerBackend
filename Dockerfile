FROM openjdk:11
EXPOSE 8081
ADD /target/promer-backend.jar promer-backend.jar
ENTRYPOINT ["java","-jar","/promer-backend.jar"]