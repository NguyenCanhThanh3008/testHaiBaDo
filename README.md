# HaiBaDO Test practice

## Overview
Đây là một ứng dụng Todo App đơn giản cho phép người dùng quản lý các công việc hàng ngày. Ứng dụng này chỉ bao gồm phần **Backend** (Spring Boot).

### REQUIREMENT:
1. **Thiết kế cơ sở dữ liệu**: Dựa theo sơ đồ ERD đã cung cấp.
2. **Phát triển Backend**: 
   - Sử dụng Spring Boot để xây dựng API cho ứng dụng.
   - Tạo các API để lấy dữ liệu cho Product, Review, User.
3. **Tạo Postman Collection**:
   - Bao gồm tất cả các API endpoints cho việc lấy dữ liệu.
4. **Chèn dữ liệu mẫu**: Tạo và xuất tệp cơ sở dữ liệu mẫu (SQL, JSON,...).

### Technical Stack
- **Spring Boot Framework**: để xây dựng ứng dụng backend trên nền Java.
- **JPA**: Thư viện hỗ trợ truy cập cơ sở dữ liệu.
- **H2 Database**: Cơ sở dữ liệu nhúng sử dụng trong môi trường phát triển.
- **Microsoft SQL Server**: Cơ sở dữ liệu sử dụng trong môi trường sản xuất.
- **Maven**: Công cụ quản lý dự án và phụ thuộc cho Java.
- **Postman**: Công cụ kiểm thử API.

### Database Design

![image](https://github.com/user-attachments/assets/5a714c9d-8545-4381-9bab-536e12fe8e44)

#### STEP BY STEP SETUP AND RUN PROJECT
1. **Clone dự án từ repository**:
    ```bash
    git clone https://github.com/NguyenCanhThanh3008/testHaiBaDo
    ```

2. **Cấu hình cơ sở dữ liệu**:
   - Mặc định ứng dụng sử dụng H2 Database cho môi trường phát triển. Để sử dụng SQL Server cho môi trường sản xuất, sửa đổi file `application.properties` như sau:
   ```properties
   spring.datasource.url=jdbc:sqlserver://localhost:1433;databaseName=yourDatabase
   spring.datasource.username=yourUsername
   spring.datasource.password=yourPassword
