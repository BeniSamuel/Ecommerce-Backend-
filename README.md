# 🛒 Java eCommerce System

Welcome to the Java-based eCommerce System! This project is a fully functional eCommerce backend that enables users to manage products, handle shopping carts, and process orders. It is designed with efficiency and scalability in mind. 

> **Made with ❤️ by Beni Samuel**

---

## 📑 Table of Contents

- [Features](#features)
- [Installation](#installation)
- [Usage](#usage)
- [Components](#components)
- [Contributing](#contributing)
- [License](#license)

---

## ✨ Features

- **User Management** 🧑‍💻: Register, log in, and delete users with seamless session handling.
- **Product Management** 📦: Add, update, delete, and view products in a user-friendly way.
- **Shopping Cart** 🛍️: Add and remove products from the cart, with a viewable summary of items.
- **Order Processing** 📄: Place orders and handle payments with ease.
- **Data Storage** 🗄️: Utilizes ArrayLists for storing and managing user and product data.
- **MVC Structure** 🏗️: Organized with controllers, models, and routers for maintainability and clarity.

---

## ⚙️ Installation

To get started with the eCommerce System, follow these steps:

1. **Clone the repository:**
    ```bash
    git clone https://github.com/BeniSamuel/ecommerce-system.git
    ```

2. **Navigate into the directory:**
    ```bash
    cd ecommerce-system
    ```

3. **Compile and Run:**
    Use your preferred Java IDE or command-line tools to compile and run the project.

---

## 🚀 Usage

1. **User Registration**:
   - Run the `UserController` to register new users.
   - Enter required details (e.g., email, password) to create a user profile.

2. **Product Management**:
   - Use the `ProductController` to add, update, view, or delete products.
   - Each product can be customized with a name, price, and description.

3. **Shopping Cart**:
   - Access the `CartController` to add or remove items from the cart.
   - View the current cart items with total cost before placing an order.

4. **Order Processing**:
   - Place an order using the `OrderController` to finalize purchases.
   - Complete payment details (simulated for now).

---

## 📦 Components

| Component            |            Description                                                                                         |
|----------------------|-----------------------------------------------------------------------------------------------------|
| `UserController`     | Manages user-related functionalities like registration, login, and deletion                         |
| `ProductController`  | Handles all product-related operations: addition, updates, deletion, and retrieval                  |
| `CartController`     | Allows adding, removing, and viewing items in the shopping cart                                     |
| `OrderController`    | Manages the order lifecycle, from cart checkout to payment processing                              |
| `ItemAbstract`       | Abstract class with required methods for managing items, implemented by `ProductController`         |
| `ArrayLists`         | Used for storing users, products, and orders during runtime                                        |

---

## 🤝 Contributing

Contributions are welcome! Please follow these steps:

1. Fork the repository.
2. Create a new branch (`feature-branch-name`).
3. Commit your changes.
4. Push to the branch.
5. Create a pull request.

---

## 📄 License

This project is open-source and available under the MIT License.

---

Enjoy managing your eCommerce project! 

> Made with ❤️ Beni Samuel in Java.
