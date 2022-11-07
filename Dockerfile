FROM tomcat

EXPOSE 8080

COPY ./target/JSF1-1.0.war /usr/local/tomcat/webapps/JSF1-1.0.war