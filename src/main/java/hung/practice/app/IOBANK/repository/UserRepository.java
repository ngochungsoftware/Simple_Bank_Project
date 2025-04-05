package hung.practice.app.IOBANK.repository;

import hung.practice.app.IOBANK.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, String> {

    User findByUsernameIgnoreCase(String username);
}
