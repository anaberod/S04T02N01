# 🧪 S04T02N01 - CRUD REST API with Spring Boot

## 📄 Description - Exercise Statement

This project is part of the IT Academy curriculum. The task consists of creating a basic CRUD (Create, Read, Update, Delete) REST API using Spring Boot and H2 in-memory database.

The goal is to build an application that manages a list of fruits, allowing users to add, update, retrieve, and delete fruit entries. The project uses the MVC architecture and implements a `GlobalExceptionHandler` for proper error handling.

## 💻 Technologies Used

- Java 24
- Spring Boot (latest stable version)
- Spring Web
- Spring Data JPA
- H2 Database
- Maven
- Postman (for API testing)
- Git & GitHub

## 📋 Requirements

Before running the project, make sure you have the following installed:

- Java JDK 17+
- Maven 3.8+
- Git
- IntelliJ IDEA or any Java IDE

## 🛠️ Installation

Follow these steps to set up the project locally:

1. Clone the repository:
   ```bash
   git clone https://github.com/anaberod/S04T02N01.git
   ```

2. Navigate into the project folder:
   ```bash
   cd S04T02N01
   ```

3. Open the project in your IDE.

4. Let Maven download the required dependencies (this happens automatically when you open the project).

## ▶️ Execution

To run the application:

1. Locate the main class:
   ```
   cat.itacademy.s04.t02.n01.S04T02N01Application
   ```

2. Run the class as a Java application.

3. Once started, the server will be running at:
   ```
   http://localhost:8080
   ```

4. You can test the API using Postman with the following endpoints:

| Method | Endpoint                  | Description              |
|--------|---------------------------|--------------------------|
| POST   | `/fruit/add`              | Add a new fruit          |
| PUT    | `/fruit/update`           | Update an existing fruit |
| GET    | `/fruit/getOne/{id}`      | Get one fruit by ID      |
| GET    | `/fruit/getAll`           | List all fruits          |
| DELETE | `/fruit/delete/{id}`      | Delete a fruit by ID     |

## 🌐 Deployment

This project is designed to run locally using an in-memory H2 database. However, it can be easily deployed to any Spring Boot-compatible environment or cloud service (Heroku, AWS, etc.) by configuring:

- `application.properties`
- A production-ready database (e.g., MySQL, PostgreSQL)

## 🤝 Contributions

Contributions are welcome! To contribute:

1. Fork the repository
2. Create a new branch (`git checkout -b feature-name`)
3. Commit your changes (`git commit -m 'Add new feature'`)
4. Push to the branch (`git push origin feature-name`)
5. Create a Pull Request
