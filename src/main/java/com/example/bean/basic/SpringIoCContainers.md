Inversion of Conversion :-

n Spring Framework, loose coupling is achieved using Inversion of Control.
The objects give their own dependencies instead of creating or looking for dependent objects.
It is the heart of the Spring Framework. The important tasks performed by the IoC container are:

•	Instantiating the bean

•	Wiring the beans together

•	Configuring the beans

•	Managing the bean’s entire life-cycle

The IoC container receives metadata from either an XML file, Java annotations, or Java code and works accordingly. IoC adds the flexibility and control of application, and provides a central place of configuration management for Plain Old Java Objects (POJO) of our application.
This diagram represents an abstract view of the working of Spring Framework. It shows how Spring makes use of Java POJO classes and configuration metadata to produce a fully configured and executable system or application.

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
		
		
