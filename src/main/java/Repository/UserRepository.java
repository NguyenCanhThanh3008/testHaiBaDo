package Repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import Entity.User;

public interface UserRepository extends JpaRepository<User, Long> {
	// Tìm người dùng theo tên người dùng (case-insensitive)
	Optional<User> findByUserNameIgnoreCase(String userName);

	// Tìm người dùng theo email (email phải duy nhất)
	Optional<User> findByEmail(String email);
}
