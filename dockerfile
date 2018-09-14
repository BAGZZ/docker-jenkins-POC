FROM tomcat:8.5-jre8

COPY target/demo.war /usr/local/tomcat/webapps/hola.war

EXPOSE 8080

RUN apt-get install -y net-tools
