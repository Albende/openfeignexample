# openfeignexample
2 Spring Boot Microservices which interacts with each other through Open Feign Client. Lombok, Feign Client, JPA/Hibernate, PostgreSQL, Spring Web

IMPORTANT!!! Before starting both of the Microservices make sure that add your database url, name and password in application.properties.

I have created 2 microservices: one is department-service and other is user-service.

We are calling department-service from user-service by using Feign Client API call.
