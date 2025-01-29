FROM eclipse-temurin:17
COPY target/check.jar check.jar
CMD ["java","-jar","check.jar"]