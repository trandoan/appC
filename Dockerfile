FROM java:7u79-jdk

WORKDIR /opt

ADD ./target/*.jar ./
ADD ./bin/appC ./

RUN ls -la
