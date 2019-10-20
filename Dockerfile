FROM openjdk:8
ADD target/spring-vue-1.0.jar spring-vue.1.0.jar
EXPOSE 9000
ENTRYPOINT ["java", "-jar", "spring-vue.1.0.jar"]