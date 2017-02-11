# Spring-Camel ReadMe
This is a simple WAR based project built using Maven.

The project is a Groovy/Java project and has a single source folder in main/test.
All source java and groovy are intermixed in the src/*/java directory. No groovy folder.

The application supports Spring MVC and Apache Camel.

Spring controllers are accessed using the Spring dispacther servlet (named in web.xml dispatcher-servlet). The base path for them is /spring

Camel is accessed using the camel servlet and the base path to access it is /services.

The project is currently configured to use Spring 4.2.5.RELEASE and Apache Camel 2.15.5.

Other support libraries are used, please review the project object model (pom.xml) for further detail.

The project has been developed using Eclipse Neon and should be easily imported into Eclipse provided you have the necessary plug-ins.
* Eclipse Neon J2EE Distribution 
* Apache Groovy Compiler Plugin (http://dist.springsource.org/snapshot/GRECLIPSE/e4.6/)
* Spring Tool Suite (http://dist.springsource.com/release/TOOLS/update/e4.6/)
* Gradle (Buildship http://download.eclipse.org/buildship/updates/e46/releases/2.x)