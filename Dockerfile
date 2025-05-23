FROM eclipse-temurin:23.0.2_7-jre
EXPOSE 8007
ADD target/warehouse-management-0.0.1-SNAPSHOT.jar warehouse-management-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java", "-jar", "/warehouse-management-0.0.1-SNAPSHOT.jar"]