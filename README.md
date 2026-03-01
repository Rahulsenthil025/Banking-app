# 🏦 Bank Management System

A RESTful Banking Application built using Spring Boot that supports core banking operations such as account creation, deposit, withdrawal, and fund transfer.

This project follows a layered architecture (Controller → Service → Repository → Entity) and demonstrates clean backend development practices.

---

## 🚀 Features

- Create Bank Account
- Deposit Money
- Withdraw Money
- Transfer Funds Between Accounts
- Global Exception Handling
- Custom Exception (Insufficient Balance)
- REST API Design
- Maven Project Structure

---

## 🛠️ Tech Stack

- Java 17
- Spring Boot
- Spring Data JPA
- Hibernate
- MySQL / H2 Database
- Maven
- Postman (API Testing)

---

## 📂 Project Structure

```
com.example.demo
│
├── controller
│   ├── AccountController.java
│   └── UserController.java
│
├── service
│   └── AccountService.java
│
├── repository
│   ├── AccountRepository.java
│   └── UserRepository.java
│
├── entity
│   ├── Account.java
│   └── User.java
│
├── exception
│   ├── GlobalExceptionHandler.java
│   └── InsufficientBalanceException.java
```

---

## 📌 API Endpoints

### 🔹 Create Account
POST `/create`

Parameters:
- accountNumber
- userId

---

### 🔹 Deposit Money
PUT `/deposit`

Parameters:
- accountId
- amount

---

### 🔹 Withdraw Money
POST `/withdraw`

Parameters:
- accountNumber
- amount

---

### 🔹 Transfer Money
POST `/transfer`

Parameters:
- fromAcc
- toAcc
- amount

---

## ⚠️ Exception Handling

- InsufficientBalanceException
- Global Exception Handling using @ControllerAdvice

---

## ▶️ How to Run

1. Clone the repository
2. Open in IDE (IntelliJ / Eclipse)
3. Configure database in `application.properties`
4. Run `BankApplication.java`
5. Test APIs using Postman

---

## 🎯 Learning Outcomes

- REST API development
- Layered architecture
- Exception handling
- Database integration using JPA
- Transaction management basics



