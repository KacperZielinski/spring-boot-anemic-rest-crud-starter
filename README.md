# What is that?
Simple anemic model for typical REST CRUD applications.

### Stack
* OpenJDK 11
* Spring Boot 2.4.2
* Spring Data JPA
* H2
* Lombok
* Mapstruct
* Mockito

### Build
```mvn clean package -DskipTests```

### Test
```mvn test```

### Run
```mvn spring-boot:run``` 

or

```java -jar target/spring-boot-anemic-rest-crud-starter-0.0.1-SNAPSHOT.jar```

### Future
* Liquibase/Flyway
* Dockerize
* Tests
    * Spock
    * TestNG
    * Testcontainers
