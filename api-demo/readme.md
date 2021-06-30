### How to use this spring-boot project

- Install packages with `mvn package`
- Run `mvn spring-boot:run` for starting the application (or use your IDE)

Application (with the embedded H2 database) is ready to be used ! You can access the url below for testing it :

- Swagger UI : http://localhost:8080/swagger-ui.html
- H2 UI : http://localhost:8080/h2-console

- Added Spring Caching on "/employees/{employeeId" API.
- Added Data validator for validating of data for post API using Spring validation framework..
- Added Spring Basic Authentication Security using Spring Security.
- Added Error DTO for giving error or NoTFound response
- Added Pagination for get of all employess to increase the performance
- Added Test cases for EmployeeController methods.
- Changed the Getters & Setter from Field level to Class level.
