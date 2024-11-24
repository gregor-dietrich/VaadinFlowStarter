# Use an official Tomcat runtime as a parent image
FROM tomcat:10-jdk17-temurin

# Set the working directory in the container
WORKDIR /usr/local/tomcat/webapps

# Copy the WAR file to the webapps directory of Tomcat
COPY target/my-project.war ./ROOT.war

# Expose the port the app runs on
EXPOSE 8080

# Define the command to run the application
CMD ["catalina.sh", "run"]