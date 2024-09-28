package com.mains.Repository;

import com.mains.Entity.Img;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ImgRepository extends JpaRepository<Img, Integer> { // Thay Long thành Integer
    // Tìm tất cả các ảnh theo ProductID
    List<Img> findByProduct_ProductID(Integer productID);

    // Tìm tất cả các ảnh theo đường dẫn link
    List<Img> findByLink(String link);
}
