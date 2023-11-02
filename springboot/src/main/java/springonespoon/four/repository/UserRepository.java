package springonespoon.four.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import springonespoon.four.entity.User;

public interface UserRepository extends JpaRepository<User,Long> {
    User findOneByUsername(String username);
    boolean existsByUsername(String username);
}
