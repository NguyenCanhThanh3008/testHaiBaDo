# HaiBaDO Test

## Overview
Đây là một ứng dụng Todo App đơn giản cho phép người dùng quản lý các công việc hàng ngày. Ứng dụng này chỉ bao gồm phần **Backend** (Spring Boot).

### Mục tiêu của bài thực hành:
- **Backend**:
  - Thiết kế cơ sở dữ liệu và tạo ERD (Entity Relationship Diagram).
  - Xây dựng ứng dụng backend sử dụng Spring Boot với chức năng lấy dữ liệu.
  - Tạo collection Postman chứa tất cả các endpoint API để lấy dữ liệu.
  - Chèn dữ liệu mẫu vào cơ sở dữ liệu và xuất tệp dữ liệu.

### Technical Stack

#### Backend:
- **Spring Boot**: Framework để xây dựng ứng dụng backend trên nền Java.
- **Spring Data JPA**: Thư viện hỗ trợ truy cập cơ sở dữ liệu.
- **H2 Database**: Cơ sở dữ liệu nhúng sử dụng trong môi trường phát triển.
- **Microsoft SQL Server**: Cơ sở dữ liệu sử dụng trong môi trường sản xuất.
- **Maven**: Công cụ quản lý dự án và phụ thuộc cho Java.
- **Postman**: Công cụ kiểm thử API.

### Database Design

Cơ sở dữ liệu được thiết kế theo mô hình quan hệ. Dưới đây là mô tả về các bảng trong cơ sở dữ liệu:

- **Product**: Lưu thông tin về sản phẩm.
  - `ProductID`: Khóa chính, định danh duy nhất cho mỗi sản phẩm.
  - `Name`: Tên sản phẩm.
  - `Category`: Danh mục sản phẩm.
  - `Star`: Đánh giá sản phẩm (theo sao).
  - `Price`: Giá của sản phẩm.
  - `Discount`: Giảm giá (nếu có).
  - `Color`: Màu sắc.
  - `Size`: Kích thước.
  - `Style`: Phong cách.
  - `Quantity`: Số lượng sản phẩm còn trong kho.
  - `Description`: Mô tả chi tiết về sản phẩm.

- **IMG**: Lưu thông tin hình ảnh liên quan đến sản phẩm.
  - `ImgID`: Khóa chính, định danh duy nhất cho mỗi hình ảnh.
  - `ProductID`: Khóa ngoại liên kết đến bảng Product.
  - `Link`: Đường dẫn URL của hình ảnh.

- **User**: Lưu thông tin người dùng.
  - `UserID`: Khóa chính, định danh duy nhất cho mỗi người dùng.
  - `UserName`: Tên đăng nhập của người dùng.
  - `Email`: Địa chỉ email của người dùng.

- **Review**: Lưu các đánh giá của người dùng về sản phẩm.
  - `ReviewID`: Khóa chính, định danh duy nhất cho mỗi đánh giá.
  - `ProductID`: Khóa ngoại liên kết đến bảng Product.
  - `UserID`: Khóa ngoại liên kết đến bảng User.
  - `Comment`: Nội dung đánh giá của người dùng.

### Project Requirements

#### Required:
1. **Thiết kế cơ sở dữ liệu**: Dựa theo sơ đồ ERD đã cung cấp.
2. **Phát triển Backend**: 
   - Sử dụng Spring Boot để xây dựng API cho ứng dụng.
   - Tạo các API để lấy dữ liệu cho Product, Review, User.
3. **Tạo Postman Collection**:
   - Bao gồm tất cả các API endpoints cho việc lấy dữ liệu.
4. **Chèn dữ liệu mẫu**: Tạo và xuất tệp cơ sở dữ liệu mẫu (SQL, JSON,...).

### Installation Guide

#### Backend Setup (Spring Boot)

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
