application.yml

```yml
server:
  port: 8080

spring:
  datasource:
    username: ${SPRING_DATASOURCE_USERNAME}
    password: ${SPRING_DATASOURCE_PASSWORD}
    url: ${SPRING_DATASOURCE_URL}
    CORS_ALLOWED_ORIGIN: ${CORS_ALLOWED_ORIGIN}
  jpa:
    hibernate:
      ddl-auto: update
    show-sql: true
```

.env
```properties
SPRING_DATASOURCE_URL=url
SPRING_DATASOURCE_USERNAME=username
SPRING_DATASOURCE_PASSWORD=password
CORS_ALLOWED_ORIGIN=url
```