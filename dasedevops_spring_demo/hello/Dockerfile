FROM java:8

MAINTAINER ningzhicheng

VOLUME /tmp

ADD ./target/*.jar /hello.jar

ENTRYPOINT ["java","-jar","/hello.jar"]

EXPOSE 8001