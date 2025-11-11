# 🍔 Online Food Ordering System (Java Swing + MySQL)

This is a desktop-based **Online Food Delivery System** built using **Java Swing** for the front-end and **MySQL** for the back-end.  
The system allows users to browse food items, place orders, and manage delivery details in a simple and user-friendly interface.

---

## 🚀 Features

✅ **User-Friendly GUI**
- Built using **Java Swing** with an attractive and responsive layout.

✅ **Food Ordering**
- Select food items, enter quantity, and view total price dynamically.

✅ **Order Confirmation**
- Display of customer details and selected items before confirming the order.

✅ **Delivery Details**
- Stores delivery address, contact details, and order information in **MySQL**.

✅ **Database Integration**
- Uses **JDBC** for seamless connection between Java Swing and MySQL.

✅ **Admin Access (Optional)**
- Admins can view, edit, or delete orders from the database.

---

## 🧩 Technologies Used

| Category | Technology |
|-----------|-------------|
| Frontend  | Java Swing |
| Backend   | MySQL |
| Database Connector | JDBC |
| Language  | Java |
| IDE Used  | NetBeans |

---

## 🗃️ Database Structure

### Database Name: `fooddeliverydb`

**Tables:**

#### 1️⃣ `orderdetail`
| Column Name  | Data Type | Description |
|---------------|------------|-------------|
| `id` | INT (Primary Key, Auto Increment) | Order ID |
| `Name` | VARCHAR(100) | Customer Name |
| `Number` | VARCHAR(15) | Customer Phone Number |
| `Mail` | VARCHAR(100) | Customer Email |
| `Address` | VARCHAR(255) | Delivery Address |
| `Item` | VARCHAR(100) | Selected Food Item |
| `Quentity` | INT | Quantity Ordered |
| `Actualprice` | DECIMAL(10,2) | Total Price |

---

## ⚙️ How to Run the Project

### 1️⃣ Prerequisites
- Install **Java JDK 8+**
- Install **MySQL Server**
- Install an IDE (NetBeans)
- Add the **MySQL JDBC Driver (Connector/J)** to your project classpath

### 2️⃣ Database Setup
1. Open MySQL Workbench or CLI.
2. Create a new database:
   ```sql
   CREATE DATABASE fooddeliverydb;

   USE fooddeliverydb;

CREATE TABLE orderdetail (
  id INT AUTO_INCREMENT PRIMARY KEY,
  Name VARCHAR(100),
  Number VARCHAR(15),
  Mail VARCHAR(100),
  Address VARCHAR(255),
  Item VARCHAR(100),
  Quentity INT,
  Actualprice DECIMAL(10,2)
);

### 3️⃣ Configure Database Connection

Edit your Java database connection file:

String url = "jdbc:mysql://localhost:3306/fooddeliverydb";

String user = "root";

String password = "your_password";

Connection con = DriverManager.getConnection(url, user, password);

### 4️⃣ Run the Project

Open your IDE
  
Compile and run the Main.java file

The application window will appear with food ordering options
