### How to use this spring-boot project

- Install packages with `mvn package`
- Run `mvn spring-boot:run` for starting the application (or use your IDE)

Application (with the embedded H2 database) is ready to be used ! You can access the url below for testing it :

- Swagger UI : http://localhost:8080/swagger-ui.html
- H2 UI : http://localhost:8080/h2-console

> Don't forget to set the `JDBC URL` value as `jdbc:h2:mem:testdb` for H2 UI.



### Instructions

- download the zip file of this project
- create a repository in your own github named 'java-challenge'
- clone your repository in a folder on your machine
- extract the zip file in this folder
- commit and push

- Enhance the code in any ways you can see, you are free! Some possibilities:
  - Add tests
  - Change syntax
  - Protect controller end points
  - Add caching logic for database calls
  - Improve doc and comments
  - Fix any bug you might find
- Edit readme.md and add any comments. It can be about what you did, what you would have done if you had more time, etc.
- Send us the link of your repository.

#### Restrictions
- use java 8

#### What we will look for
- Readability of your code
- Documentation
- Comments in your code 
- Appropriate usage of spring boot
- Appropriate usage of packages
- Is the application running as expected
- No performance issues

#### Your experience in Java

Please let us know more about your Java experience in a few sentences. For example:

- I have around 8 years of Development experience in Java and its related technologies like Spring, Boot, Spring JPA, Spring MVC, Spring Rest,Spring Security, Struts 2, JSP, Servlets, Hibernate.
- I also have good knowledge on AWS and its Components(EC2 Container, SNS, SQS, Lambda, Cloudwatch,S3, IAM Role).
- Deployed Rest services on AWS cloud using Docker and AWS CLI commands with use of Jenkins Pipeline
- I have developed self sustainable Tool which learns the screen elements and put the user provided value in the screen using JSoup, Selenium. 

#### Changes Made in Code
- Added Spring Caching on "/employees/{employeeId" API.
- Added Data validator for validating of data for post API using Spring validation framework..
- Added Spring Basic Authentication Security using Spring Security.
- Added Error DTO for giving error or NoTFound response
- Added Pagination for get of all employess to increase the performance
- Added Test cases for EmployeeController methods.
- Changed the Getters & Setter from Field level to Class level.
