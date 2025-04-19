FROM maven:3.8.3-openjdk-17 as mavenBuild

WORKDIR /app
COPY pom.xml .
# To resolve dependencies in a safe way (no re-download when the source code changes)
RUN mvn dependency:go-offline -B
# Copy all other project files and build project
COPY src src
RUN mvn clean install -Dmaven.test.skip -B

FROM eclipse-temurin:17.0.14_7-jre
ENV JAVA_OPTS ""
WORKDIR /app
COPY --from=mavenBuild ./app/target/*.jar ./

EXPOSE 8080

CMD ["sleep", "infinity"]
