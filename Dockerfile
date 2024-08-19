FROM eclipse-temurin:21-jammy

WORKDIR /app/

COPY /build/libs/naavi-0.0.1-SNAPSHOT.jar /app/naavi.jar

EXPOSE 8080

ENTRYPOINT ["java","-jar","/app/naavi.jar"]