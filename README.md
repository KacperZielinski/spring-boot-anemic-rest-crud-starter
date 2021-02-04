# What is that?
Simple anemic model for typical REST CRUD applications.

### Stack
* OpenJDK 11
* Spring Boot 2.4.2
* Spring Data JPA
* Docker
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

### Docker
##### Build image
```mvn spring-boot:build-image```
##### Run
```docker run -it -p 8080:8080 --name spring-anemic-rest spring-boot-anemic-rest-crud-starter:0.0.1-SNAPSHOT```

### Future
* Liquibase/Flyway
* Tests
    * Spock
    * TestNG
    * Testcontainers
