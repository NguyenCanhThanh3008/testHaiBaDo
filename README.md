# HAIBADO TEST PRACTICE

## OVERVIEW
This is a product management application that allows users to perform operations such as viewing, adding, editing, and deleting products. The application is developed as a **Backend** using **Spring Boot** and utilizes **SQL Server** for data storage. The provided APIs allow users to filter products based on various criteria such as category, price, rating, discount, quantity, color, size, and style.

### REQUIREMENT:
1. **Database Design**: Based on the provided ERD diagram.
2. **Backend Development**: 
   - Use Spring Boot to build APIs for the application.
   - Create APIs to retrieve data for `Product`, `Review`, and `User`.
3. **Create Postman Collection**:
   - Include all API endpoints for data retrieval.
4. **Insert Sample Data**: Create and export a sample database file (SQL, JSON, etc.).
5. **Deploy on Docker**: Package and deploy the application using Docker.

### TECHNICAL STACK
- **Spring Boot Framework**: To build the backend application on the Java platform.
- **JPA**: Library for database access.
- **H2 Database**: Embedded database used in the development environment.
- **Microsoft SQL Server**: Database used in the production environment.
- **Maven**: Project management and dependency management tool for Java.
- **Docker**: Containerize the application for deployment.
- **Postman**: API testing tool.

### DATABASE DESIGN

![image](https://github.com/user-attachments/assets/5a714c9d-8545-4381-9bab-536e12fe8e44)

#### STEP BY STEP SETUP AND RUN PROJECT
1. **Clone the project from the repository**:
    ```bash
    git clone https://github.com/NguyenCanhThanh3008/testHaiBaDo
    ```

2. **Configure the database**:
   - By default, the application uses **H2 Database** for the development environment. To use **SQL Server** for the production environment, modify the `application.properties` file as follows:
  ```properties
   spring.datasource.url=jdbc:sqlserver://<yourIpAddress>:1433;databaseName=  
   <yourDatabase>;encrypt=true;trustServerCertificate=true
   spring.datasource.username=yourUsername
   spring.datasource.password=yourPassword
  ```
3. **Run the application**:

To run the application with Maven, use the following command:
```bash
mvn spring-boot:run
```
The application will run on http://localhost:8080.

#### TO RUN THE APPLICATION WITH DOCKER, FOLLOW THESE STEPS:
1. Create JAR file:
```bash
./mvnw clean package
```
2. Build Docker Image:
```bash
docker build -t hai-ba-do-app .
```
3. Run Container:
```bash
docker run -p 8080:8080 hai-ba-do-app
```
