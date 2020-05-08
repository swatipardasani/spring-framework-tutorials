Introduction : 


•	Spring framework is an open source Java platform that provides comprehensive infrastructure support for developing robust Java applications very easily and very rapidly.
•	Spring framework was initially written by Rod Johnson and was first released under the Apache 2.0 license in June 2003.

Applications of Spring :


Following is the list of few of the great benefits of using Spring Framework −

•	POJO Based - Spring enables developers to develop enterprise-class applications using POJOs. The benefit of using only POJOs is that you do not need an EJB container product such as an application server but you have the option of using only a robust servlet container such as Tomcat or some commercial product.

•	Modular - Spring is organized in a modular fashion. Even though the number of packages and classes are substantial, you have to worry only about the ones you need and ignore the rest.

•	Integration with existing frameworks - Spring does not reinvent the wheel, instead it truly makes use of some of the existing technologies like several ORM frameworks, logging frameworks, JEE, Quartz and JDK timers, and other view technologies.

•	Testablity - Testing an application written with Spring is simple because environment-dependent code is moved into this framework. Furthermore, by using JavaBeanstyle POJOs, it becomes easier to use dependency injection for injecting test data.

•	Web MVC - Spring's web framework is a well-designed web MVC framework, which provides a great alternative to web frameworks such as Struts or other over-engineered or less popular web frameworks.

•	Central Exception Handling - Spring provides a convenient API to translate technology-specific exceptions (thrown by JDBC, Hibernate, or JDO, for example) into consistent, unchecked exceptions.

•	Lightweight - Lightweight IoC containers tend to be lightweight, especially when compared to EJB containers, for example. This is beneficial for developing and deploying applications on computers with limited memory and CPU resources.

•	Transaction management - Spring provides a consistent transaction management interface that can scale down to a local transaction (using a single database, for example) and scale up to global transactions (using JTA, for example).

Spring Architecture


![spring_architecture](https://user-images.githubusercontent.com/31573162/81290521-d9f53f80-9085-11ea-88fc-098f23497635.png)

1.	CORE CONTAINER

The Core Container consists of the Core, Beans, Context, and Expression Language modules the details of which are as follows −

•	The Core module provides the fundamental parts of the framework, including the IoC and Dependency Injection features.

•	The Bean module provides BeanFactory, which is a sophisticated implementation of the factory pattern.

•	The Context module builds on the solid base provided by the Core and Beans modules and it is a medium to access any objects defined and configured. The ApplicationContext interface is the focal point of the Context module.

•	The SpEL module provides a powerful expression language for querying and manipulating an object graph at runtime.

2.	DATA ACCESS/INTEGRATION

The Data Access/Integration layer consists of the JDBC, ORM, OXM, JMS and Transaction modules whose detail is as follows −

•	The JDBC module provides a JDBC-abstraction layer that removes the need for tedious JDBC related coding.

•	The ORM module provides integration layers for popular object-relational mapping APIs, including JPA, JDO, Hibernate, and iBatis.

•	The OXM module provides an abstraction layer that supports Object/XML mapping implementations for JAXB, Castor, XMLBeans, JiBX and XStream.

•	The Java Messaging Service JMS module contains features for producing and consuming messages.

•	The Transaction module supports programmatic and declarative transaction management for classes that implement special interfaces and for all your POJOs.

3.	WEB	

The Web layer consists of the Web, Web-MVC, Web-Socket, and Web-Portlet modules the details of which are as follows −

•	The Web module provides basic web-oriented integration features such as multipart file-upload functionality and the initialization of the IoC container using servlet listeners and a web-oriented application context.

•	The Web-MVC module contains Spring's Model-View-Controller (MVC) implementation for web applications.

•	The Web-Socket module provides support for WebSocket-based, two-way communication between the client and the server in web applications.

•	The Web-Portlet module provides the MVC implementation to be used in a portlet environment and mirrors the functionality of Web-Servlet module.

4.	OTHERS/MISCELLANEOUS

There are few other important modules like AOP, Aspects, Instrumentation, Web and Test modules the details of which are as follows −

•	The AOP module provides an aspect-oriented programming implementation allowing you to define method-interceptors and pointcuts to cleanly decouple code that implements functionality that should be separated.

•	The Aspects module provides integration with AspectJ, which is again a powerful and mature AOP framework.

•	The Instrumentation module provides class instrumentation support and class loader implementations to be used in certain application servers.

•	The Messaging module provides support for STOMP as the WebSocket sub-protocol to use in applications. It also supports an annotation programming model for routing and processing STOMP messages from WebSocket clients.

•	The Test module supports the testing of Spring components with JUnit or TestNG frameworks.

SPRING LIBRARIES NEEDED :

Include this in pom.xml

		<dependencies>
			<dependency>
				<groupId>org.springframework</groupId>
				<artifactId>spring</artifactId>
				<version>2.5.6</version>
			</dependency>
		</dependencies>
		
Libraries : commons-logging-1.1.1.jar , spring-2.5.6.jar

Other Libraries(for specific purpose) : spring-aop-4.1.6.RELEASE, spring-aspects-4.1.6.RELEASE
spring-beans-4.1.6.RELEASE,spring-context-4.1.6.RELEASE
spring-context-support-4.1.6.RELEASE, spring-core-4.1.6.RELEASE, spring-expression-4.1.6.RELEASE
spring-instrument-4.1.6.RELEASE, spring-instrument-tomcat-4.1.6.RELEASE
spring-jdbc-4.1.6.RELEASE, spring-jms-4.1.6.RELEASE, spring-messaging-4.1.6.RELEASE
spring-orm-4.1.6.RELEASE, spring-oxm-4.1.6.RELEASE
spring-test-4.1.6.RELEASE, spring-tx-4.1.6.RELEASE
spring-web-4.1.6.RELEASE, spring-webmvc-4.1.6.RELEASE
spring-webmvc-portlet-4.1.6.RELEASE, spring-websocket-4.1.6.RELEASE


