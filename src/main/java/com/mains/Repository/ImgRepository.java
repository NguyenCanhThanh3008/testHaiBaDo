package com.mains.Repository;

import com.mains.Entity.Img;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ImgRepository extends JpaRepository<Img, Integer> { // Change Long to Integer
    // Find all images by ProductID
    List<Img> findByProduct_ProductID(Integer productID);

    // Find all images by link path
    List<Img> findByLink(String link);
}
