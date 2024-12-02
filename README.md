# Angular Spring Boot Starter

A full-stack starter project showcasing Spring Boot and Angular integration with automated TypeScript client generation.

## Key Features

- Spring Boot 3.4.0 backend
- Angular 16 frontend
- Automated TypeScript client generation from OpenAPI specs
- Maven-based build process
- Example REST endpoint with welcome messages

## Prerequisites

- Java 21
- Maven (or use included wrapper)

## Quick Start

1. Clone the repository
2. Run the application:
```bash
./mvnw clean install
./mvnw spring-boot:run
```

The application will be available at:
- Frontend: http://localhost:8080
- Swagger UI: http://localhost:8080/swagger-ui.html
- OpenAPI Spec: http://localhost:8080/api-docs


## How it Works

The project uses OpenAPI Generator Maven plugin to:
1. Generate OpenAPI specification from Spring Boot controllers
2. Create TypeScript/Angular client code from the OpenAPI spec
3. Build the Angular frontend with the generated client


