package hung.practice.app.IOBANK.repository;

import hung.practice.app.IOBANK.entity.Transaction;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TransactionRepository extends JpaRepository<Transaction, String> {
}
