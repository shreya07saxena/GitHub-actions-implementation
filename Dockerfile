FROM openjdk:11

WORKDIR /CodeInsides

EXPOSE 8080

COPY target/github-actions-implementation-docker-image.jar .

CMD [ "java","-jar","github-actions-implementation-docker-image.jar" ]