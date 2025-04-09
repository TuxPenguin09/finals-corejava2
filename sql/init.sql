CREATE TABLE products (
    product_id INTEGER UNIQUE PRIMARY KEY,
    name VARCHAR(100) NOT NULL,
    description TEXT,
    price DECIMAL(10, 2) NOT NULL,
    stock_quantity INT NOT NULL,
    category VARCHAR(300) NOT NULL,
    brand VARCHAR(300),
    date_added TIMESTAMP DEFAULT CURRENT_TIMESTAMP
);

INSERT INTO products (product_id, name, description, price, stock_quantity, category, brand)
VALUES
(1, 'Wireless Mouse', 'Wireless mouse with USB receiver', 19.99, 50, 'electronics', 'LaserPoints'),
(3, 'Smartphone', 'Best smartphone, can also play Blue Archive in it', 499.99, 25, 'electronics > Mobile Phones', 'Cinart'),
(4, 'Running Shoes', 'Lightweight and breathable running shoes', 79.99, 40, 'fashion', 'Nikken'),
(5, 'Water Bottle', '1L insulated stainless steel water bottle', 14.95, 100, 'kitchen', 'Niger Flask'),
(6, 'Laptop', '14-inch laptop with Intel i5 and 8GB RAM', 699.00, 15, 'electronics', 'Cinart'),
(7, 'Bluetooth Speaker', 'Portable waterproof Bluetooth speaker', 39.99, 60, 'electronics', 'BIGASPEAK'),
(8, 'Coffee Maker', '12-cup programmable coffee maker with timer', 89.99, 20, 'kitchen', 'Cuisinart'),
(9, 'Backpack', 'Durable water-resistant travel backpack', 45.00, 35, 'fashion', 'North Face'),
(10, 'Yoga Mat', 'Non-slip exercise yoga mat 6mm thick', 24.99, 80, 'outdoors', 'Gaiam');