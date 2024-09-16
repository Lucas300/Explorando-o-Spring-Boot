package dio.aula_spring_data_jpa;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import dio.aula_spring_data_jpa.model.User;
import dio.aula_spring_data_jpa.repository.userRepository;

@Component
public class StartApp implements CommandLineRunner {
	@Autowired
	private userRepository repository;
	@Override
	public void run(String... args) throws Exception{
		User user = new User();
		user.setName("Lucas");
		user.setUsername("Mazza");
		user.setPassword("dio123");
		
		repository.save(user);
		
		for (User u : repository.findAll()) {
			System.out.println(u);
		}
		
	}
	
}
