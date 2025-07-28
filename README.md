# 🧪 S04T02N01 - CRUD REST API with Spring Boot

## 📄 Description - Exercise Statement

This project is part of the IT Academy curriculum. The task consists of creating a basic CRUD (Create, Read, Update, Delete) REST API using Spring Boot and H2 in-memory database.

The application manages a list of fruits, allowing users to add, update, retrieve, and delete fruit entries. It follows MVC architecture, uses a DTO layer for communication, and implements centralized error handling with a `GlobalExceptionHandler` and a custom `FruitNotFoundException`.

## 💻 Technologies Used

- Java 24
- Spring Boot
- Spring Web
- Spring Data JPA
- H2 Database
- Maven
- Postman (for testing)
- Git & GitHub

## 📋 Requirements

Make sure you have the following installed:

- Java JDK 17 or higher
- Maven 3.8 or higher
- Git
- IntelliJ IDEA or similar Java IDE

## 📦 DTO Layer

This project uses a **Data Transfer Object (DTO)** to decouple the internal `Fruit` model from the API layer. This ensures a cleaner, safer design and allows future changes to the internal model without affecting external clients.

### 🔹 FruitDTO Fields

```json
{
  "name": "Banana",
  "amountKilos": 20
}
```

The `id` is auto-generated and handled internally by the application. Clients never send it in POST/PUT requests.

## 🛠️ Installation

1. Clone the repository:
   ```bash
   git clone https://github.com/anaberod/S04T02N01.git
   ```

2. Navigate into the project directory:
   ```bash
   cd S04T02N01
   ```

3. Open the project in your IDE.

4. Let Maven download dependencies (happens automatically).

## ▶️ Execution

1. Locate the main class:
   ```
   cat.itacademy.s04.t02.n01.S04T02N01Application
   ```

2. Run it as a Java application.

3. Once started, the server runs at:
   ```
   http://localhost:8080
   ```

## 📬 API Endpoints

| Method | Endpoint          | Description             | Request Body            |
|--------|-------------------|-------------------------|-------------------------|
| POST   | `/fruit`          | Add a new fruit         | `FruitDTO`              |
| PUT    | `/fruit/{id}`     | Update a fruit by ID    | `FruitDTO`              |
| GET    | `/fruit`          | Get all fruits          |                         |
| GET    | `/fruit/{id}`     | Get a fruit by ID       |                         |
| DELETE | `/fruit/{id}`     | Delete a fruit by ID    |                         |

### ✅ Example of `POST /fruit` or `PUT /fruit/{id}`

```json
{
  "name": "Strawberry",
  "amountKilos": 10
}
```

### 🔄 Example Response for `GET /fruit/1`

```json
{
  "name": "Strawberry",
  "amountKilos": 10
}
```



## 🌐 Deployment

The project runs locally using an H2 in-memory database. To deploy in production:

- Switch to a persistent database like MySQL/PostgreSQL.
- Update `application.properties` accordingly.
- Deploy to Heroku, AWS, or other Spring Boot-compatible platforms.

## ❗ Error Handling

Handled with:
- Custom exception: `FruitNotFoundException`
- Global handler: `GlobalExceptionHandler`  
  Returns:
- `404 Not Found` if fruit ID doesn't exist
- `500 Internal Server Error` for unexpected issues

## 🤝 Contributions

You're welcome to contribute!

1. Fork the repo
2. Create a branch (`git checkout -b feature-name`)
3. Commit (`git commit -m "Add feature"`)
4. Push (`git push origin feature-name`)
5. Open a Pull Request
