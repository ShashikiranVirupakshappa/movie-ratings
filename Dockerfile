#first line is base image which openjdk:21 which jdk version 21 is used
FROM openjdk:21

#second line tells which port to use for your app
EXPOSE 8083
ADD target/movie-ratings.jar.jar movie-ratings.jar
ENTRYPOINT ["java", "-jar", "/movie-ratings.jar"]