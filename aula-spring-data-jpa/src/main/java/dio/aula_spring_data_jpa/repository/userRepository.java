package dio.aula_spring_data_jpa.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import dio.aula_spring_data_jpa.model.User;

public interface userRepository extends JpaRepository<User, Integer> {

}
