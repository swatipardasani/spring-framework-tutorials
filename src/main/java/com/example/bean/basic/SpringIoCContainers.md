What is Dependency Injection?

Dependency Injection is the ability of an object to supply dependencies of another object.

Dependency in programming is an approach where a class uses specific functionalities of another class. So, for example, If you consider two classes A and B, and say that class A uses functionalities of class B, then its implied that class A has a dependency of class B. Now, if you are coding in Java then you must know that, you have to create an instance of class B before the objects are being used by class A.

So, if I have to now define Dependency Injection for you, then the process of creating an object for some other class and let the class directly using the dependency is called Dependency Injection. It mainly has three classes involved:

1.	Client Class: This is the dependent class and is dependent on the Service class.

2.	Service Class: This class provides a service to the client class.

3.	Injector Class: This class is responsible for injecting the service class object into the client class


![Types-of-Classes-What-is-Dependency-Injection-Edureka-330x180](https://user-images.githubusercontent.com/31573162/81400107-06728f80-914a-11ea-9bd6-8c01491a73c9.png)

Inversion of Conversion :-

Spring Framework, loose coupling is achieved using Inversion of Control.
The objects give their own dependencies instead of creating or looking for dependent objects.
It is the heart of the Spring Framework. 
Inversion of Control is basically used to invert different kinds of additional responsibilities of a class rather than the main responsibility.

Consider an example, wherein you have the ability to cook. According to the IoC principle,  you can invert the control, so instead of you cooking food, you can just directly order from outside, wherein you receive food at your doorstep. Thus the process of food delivered to you at your doorstep is called the Inversion of Control.

You do not have to cook yourself, instead, you can order the food and let a delivery executive, deliver the food for you. In this way, you do not have to take care of the additional responsibilities and just focus on the main work.

The important tasks performed by the IoC container are:

•	Instantiating the bean

•	Wiring the beans together

•	Configuring the beans

•	Managing the bean’s entire life-cycle

Here is a diagrammatic representation of how beans are wired together by IoC container.

![ioc-335x300](https://user-images.githubusercontent.com/31573162/81397187-79790780-9144-11ea-92bb-a726c39e46ac.png)

The IoC container receives metadata from either an XML file, Java annotations, or Java code and works accordingly. IoC adds the flexibility and control of application, and provides a central place of configuration management for Plain Old Java Objects (POJO) of our application.
This diagram represents an abstract view of the working of Spring Framework. It shows how Spring makes use of Java POJO classes and configuration metadata to produce a fully configured and executable system or application.

![ioc-1-357x300](https://user-images.githubusercontent.com/31573162/81397625-5864e680-9145-11ea-87e8-0d119fe3e02f.png)

There are two types of IoC containers:

•	BeanFactory

•	ApplicationContext

1.	BeanFactory :

•	It is an interface defined in org.springframework.beans.factory.BeanFactory.

•	Bean Factory provides the basic support for Dependency Injection.

•	It is based on factory design pattern which creates the beans of any type.

•	BeanFactory follows lazy-initialization technique which means beans are loaded as soon as bean factory instance is created but the beans are created only when getBean() method is called.

•	The XmlBeanFactory is the implementation class for the BeanFactory interface. To use the BeanFactory, you need to create the instance of XmlBeanFactory class as shown below: 

		BeanFactory beanFactory = new XmlBeanFactory(new ClassPathResource("beans.xml"));
		
2.	ApplicationContext :

•	It is an interface defined in org.springframework.context.ApplicationContext.

•	It is the advanced Spring container and is built on top of the BeanFactory interface.

•	ApplicationContext supports the features supported by Bean Factory but also provides some additional functionalities.

•	ApplicationContext follows eager-initialization technique which means instance of beans are created as soon as you create the instance of Application context.

•	The ClassPathXmlApplicationContext class is the implementation class of ApplicationContext interface. You need to instantiate the ClassPathXmlApplicationContext class to use the ApplicationContext as shown below:

		ApplicationContext context=new ClassPathXmlApplicationContext("beans.xml");
		



