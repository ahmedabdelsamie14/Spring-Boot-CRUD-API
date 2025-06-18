A Spring Boot-based RESTful API for managing Student entities in a MySQL database. Built using Java 17 and Spring Boot 3.0.1, this app follows standard architecture:

Controller Layer (StudentController) — handles HTTP requests/responses

Service Layer (StudentServiceImpl) — contains business logic

Repository Layer (StudentRepository) — interacts with MySQL via Spring Data JPA

🎯 Features
Create Student: POST /api/students

Retrieve All Students: GET /api/students

Retrieve One Student: GET /api/students/{id}

Update Student: PUT /api/students/{id}

Delete Student: DELETE /api/students/{id}

🛠️ Technologies
Java 17

Spring Boot 3.0.1

Spring Data JPA

MySQL

Maven

🔧 Setup & Run
Clone the repo

bash
Copy
Edit
git clone https://github.com/ahmedabdelsamie14/Spring-Boot-CRUD-API.git
cd Spring-Boot-CRUD-API
Configure MySQL

Edit src/main/resources/application.properties:

properties
Copy
Edit
spring.datasource.url=jdbc:mysql://localhost:3306/student_db
spring.datasource.username=YOUR_DB_USER
spring.datasource.password=YOUR_DB_PASS

spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
Make sure you have a database named student_db.

Build and Run

bash
Copy
Edit
mvn clean install
mvn spring-boot:run
Access the API at http://localhost:8080.

