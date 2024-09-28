CREATE TABLE Product (
    ProductID INT PRIMARY KEY,
    Name VARCHAR(255),
    Category VARCHAR(255),
    Star INT,
    Price DECIMAL(10, 2),
    Discount DECIMAL(5, 2),
    Color VARCHAR(50),
    Size VARCHAR(50),
    Style VARCHAR(50),
    Quantity INT,
    Description TEXT
);

CREATE TABLE IMG (
    ImgID INT PRIMARY KEY,
    ProductID INT,
    Link VARCHAR(255),
    FOREIGN KEY (ProductID) REFERENCES Product(ProductID)
);

-- Đổi tên bảng User thành Users
CREATE TABLE Users (
    UserID INT PRIMARY KEY,
    UserName VARCHAR(255),
    Email VARCHAR(255)
);

CREATE TABLE Review (
    ReviewID INT PRIMARY KEY,
    ProductID INT,
    Comment TEXT,
    UserID INT,
    FOREIGN KEY (ProductID) REFERENCES Product(ProductID),
    FOREIGN KEY (UserID) REFERENCES Users(UserID)
);


INSERT INTO Product (ProductID, Name, Category, Star, Price, Discount, Color, Size, Style, Quantity, Description)
VALUES
(1, 'T-Shirt', 'Clothing', 4, 20.00, 10.00, 'Red', 'M', 'Casual', 50, 'Red cotton T-shirt'),
(2, 'Jeans', 'Clothing', 5, 40.00, 5.00, 'Blue', 'L', 'Denim', 30, 'Blue denim jeans'),
(3, 'Sneakers', 'Footwear', 4, 60.00, 15.00, 'White', '42', 'Sport', 20, 'Comfortable white sneakers'),
(4, 'Jacket', 'Clothing', 5, 100.00, 20.00, 'Black', 'XL', 'Winter', 10, 'Warm black jacket'),
(5, 'Backpack', 'Accessories', 4, 35.00, 7.00, 'Gray', 'One Size', 'Travel', 100, 'Durable gray backpack'),
(6, 'Sunglasses', 'Accessories', 3, 15.00, 3.00, 'Black', 'One Size', 'Casual', 75, 'Stylish black sunglasses'),
(7, 'Watch', 'Accessories', 5, 120.00, 25.00, 'Silver', 'One Size', 'Formal', 25, 'Elegant silver watch'),
(8, 'Sandals', 'Footwear', 4, 25.00, 5.00, 'Brown', '43', 'Casual', 60, 'Comfortable brown sandals'),
(9, 'Cap', 'Accessories', 4, 10.00, 2.00, 'Blue', 'One Size', 'Casual', 80, 'Blue cotton cap'),
(10, 'Sweater', 'Clothing', 5, 50.00, 10.00, 'Green', 'M', 'Winter', 40, 'Green woolen sweater');


INSERT INTO IMG (ImgID, ProductID, Link)
VALUES
(1, 1, 'link_to_image_1.jpg'),
(2, 2, 'link_to_image_2.jpg'),
(3, 3, 'link_to_image_3.jpg'),
(4, 4, 'link_to_image_4.jpg'),
(5, 5, 'link_to_image_5.jpg'),
(6, 6, 'link_to_image_6.jpg'),
(7, 7, 'link_to_image_7.jpg'),
(8, 8, 'link_to_image_8.jpg'),
(9, 9, 'link_to_image_9.jpg'),
(10, 10, 'link_to_image_10.jpg');


INSERT INTO Users (UserID, UserName, Email)
VALUES
(1, 'john_doe', 'john@example.com'),
(2, 'jane_smith', 'jane@example.com'),
(3, 'peter_parker', 'peter@example.com'),
(4, 'bruce_wayne', 'bruce@example.com'),
(5, 'clark_kent', 'clark@example.com'),
(6, 'tony_stark', 'tony@example.com'),
(7, 'natasha_romanoff', 'natasha@example.com'),
(8, 'steve_rogers', 'steve@example.com'),
(9, 'diana_prince', 'diana@example.com'),
(10, 'barry_allen', 'barry@example.com');


INSERT INTO Review (ReviewID, ProductID, Comment, UserID)
VALUES
(1, 1, 'Good quality, very comfortable!', 1),
(2, 2, 'Perfect fit, love it!', 2),
(3, 3, 'Great shoes for running.', 3),
(4, 4, 'Warm and stylish, worth the price.', 4),
(5, 5, 'Very spacious and durable.', 5),
(6, 6, 'Looks cool but feels a bit cheap.', 6),
(7, 7, 'Excellent craftsmanship!', 7),
(8, 8, 'Comfortable and lightweight.', 8),
(9, 9, 'Nice design, but the color fades.', 9),
(10, 10, 'Cozy and warm, perfect for winter.', 10);
