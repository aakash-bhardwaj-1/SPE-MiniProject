FROM ubuntu:latest 
RUN apt-get update && apt-get install -y openjdk-11-jdk
COPY ./target/calculator_project-1.0-SNAPSHOT.jar ./
WORKDIR ./
CMD ["java","-cp","calculator_project-1.0-SNAPSHOT.jar","com.swasthsahayak.Main"]
