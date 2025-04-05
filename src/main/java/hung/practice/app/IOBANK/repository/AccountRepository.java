package hung.practice.app.IOBANK.repository;

import hung.practice.app.IOBANK.entity.Account;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AccountRepository extends JpaRepository<Account, String> {
}
