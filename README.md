# Spring Boot CRUD Employee Management Application

This is a simple Spring Boot application for managing employees. It provides basic CRUD (Create, Read, Update, Delete) operations using Entity Manager.

## Features
- Add a new employee
- View all employees
- Update employee details
- Delete an employee

## Technologies Used
- Java
- Spring Boot
- Spring Data JPA
- MySQL (or any other database of your choice)

## How to Run
1. Clone this repository to your local machine
2. Configure your database settings in application.properties
3. Run the application using Maven: mvn spring-boot:run
4. Access the application at http://localhost:8080

## API Endpoints
- GET /employees: Get all employees
- GET /employees/{id}: Get employee by ID
- POST /employees: Create a new employee
- PUT /employees/{id}: Update an existing employee
- DELETE /employees/{id}: Delete an employee

## Sample Request Body for Creating/Updating an Employee
```json
{
  "name": "John Doe",
  "email": "johndoe@example.com",
  "designation": "Software Engineer"
}
