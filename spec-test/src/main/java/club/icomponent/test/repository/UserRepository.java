package club.icomponent.test.repository;

import club.icomponent.test.entity.User;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Long>, JpaSpecificationExecutor<User> {
}
