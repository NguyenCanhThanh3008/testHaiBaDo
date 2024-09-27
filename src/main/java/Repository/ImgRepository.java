package Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import Entity.Img;

public interface ImgRepository extends JpaRepository<Img, Long> {
	// Tìm tất cả các ảnh theo ProductID
	List<Img> findByProduct_ProductID(Long productID);

	// Tìm tất cả các ảnh theo đường dẫn link
	List<Img> findByLink(String link);
}
