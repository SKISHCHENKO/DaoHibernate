-- Создание таблицы CUSTOMERS
CREATE TABLE IF NOT EXISTS CUSTOMERS (
    id SERIAL PRIMARY KEY,
    name VARCHAR(100),
    surname VARCHAR(100),
    age INT,
    phone_number VARCHAR(15)
);

-- Создание таблицы ORDERS
CREATE TABLE IF NOT EXISTS ORDERS (
    id SERIAL PRIMARY KEY,
    date TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    customer_id INT,
    product_name VARCHAR(255),
    amount INT,
    FOREIGN KEY (customer_id) REFERENCES CUSTOMERS(id)
);