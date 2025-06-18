# 📚 Spring Boot CRUD REST API

A Spring Boot-based REST API for managing **Student** entities. It provides full CRUD operations and stores data in a **MySQL** database. This project follows a clean layered architecture: Controller → Service → Repository.

---

## 🚀 Features

- Create a new student
- Retrieve all students
- Retrieve a student by ID
- Update student details
- Delete a student

---

## 🛠️ Technologies Used

- **Java 17**
- **Spring Boot 3.0.1**
- **Spring Data JPA**
- **MySQL**
- **Maven**

---

## ⚙️ Getting Started

1. Clone the Repository
git clone https://github.com/ahmedabdelsamie14/Spring-Boot-CRUD-API.git
cd Spring-Boot-CRUD-API

2. Configure MySQL Database
# Update the application.properties file:
- spring.datasource.url=jdbc:mysql://localhost:3306/student_db
- spring.datasource.username=your_mysql_username
- spring.datasource.password=your_mysql_password
- spring.jpa.hibernate.ddl-auto=update
- spring.jpa.show-sql=true
Make sure the student_db database exists in your MySQL server.

3. Build and Run the Application
mvn clean install
mvn spring-boot:run
The application will start at:
🔗 http://localhost:8080

