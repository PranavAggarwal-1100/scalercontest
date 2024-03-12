# Contest
This project is a Spring Boot application that interacts with the Fake Store API. It provides a set of endpoints to manage carts.

## Technologies Used
- Java
- Spring Boot
- Maven

## API Endpoints

### Cart API
- `GET /carts`: Get all carts
- `GET /carts/{id}`: Get a cart by id
- `GET /carts/user/{id}`: get a cart for a user
- 'DELETE /carts/{id}': Delete a cart by id
- 'POST /carts': Create a new cart
- 'PUT /carts/{id}': Update a cart by id

## Setup and Installation

1. Clone the repository.
2. Navigate to the project directory.
3. Run `mvn clean install` to build the project.
4. Run `mvn spring-boot:run` to start the application.
