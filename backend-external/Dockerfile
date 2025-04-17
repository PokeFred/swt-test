FROM gradle:8-jdk21-alpine AS build
WORKDIR /app
COPY . .
RUN gradle build --no-daemon

FROM amazoncorretto:24-alpine-jdk
WORKDIR /app
COPY --from=build /app/build/libs/*.jar /app
EXPOSE 3001
CMD ["java", "-jar", "backend-external-0.0.0.jar"]
