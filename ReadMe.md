# Spring-Camel ReadMe
This is a simple WAR based project built using Maven.

The project is a Groovy/Java project and has a single source folder in main/test.
All source java and groovy are intermixed in the src/*/java directory. No groovy folder.

The application is supports Spring MVC and Apache Camel.

Spring controllers are accessed using the Spring dispacther servlet (named in web.xml dispatcher-servlet). The base path for them is /spring

Camel is accessed using the camel servlet and the base path to access it is /services.

The project is currently configured to use Spring 4.2.5.RELEASE and Apache Camel 2.15.5.

Other support libraries are used, please review the project object model (pom.xml) for further detail.
