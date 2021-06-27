package kz.hackeevo.spring.repository;

import kz.hackeevo.spring.entity.Account;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AccountRepository extends JpaRepository<Account, Long> {

}
