FROM tomcat:10-jre17-temurin

WORKDIR /usr/local/tomcat/webapps

COPY target/my-project.war ./ROOT.war

EXPOSE 8080

CMD ["catalina.sh", "run"]