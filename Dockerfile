FROM openjdk:8
EXPOSE 8080
ADD target/springboot-jpa-image.jar springboot-jpa-image.jar
ENTRYPOINT ["java","-jar","/springboot-jpa-image.jar"]