package hung.practice.app.IOBANK.repository;

import hung.practice.app.IOBANK.entity.Card;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CardRepository extends JpaRepository<Card, String> {
}
