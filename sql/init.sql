CREATE TABLE products (
    product_id SERIAL PRIMARY KEY,
    name VARCHAR(100) NOT NULL,
    description TEXT,
    price DECIMAL(10, 2) NOT NULL,
    stock_quantity INT NOT NULL,
    category VARCHAR(300) NOT NULL,
    brand VARCHAR(300),
    date_added TIMESTAMP DEFAULT CURRENT_TIMESTAMP
);