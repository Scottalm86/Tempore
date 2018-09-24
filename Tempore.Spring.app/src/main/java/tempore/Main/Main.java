package tempore.Main;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Controller;

import tempore.personRegister.Person;
import tempore.personRegister.PersonRepository;


@SpringBootApplication
@Controller
public class Main {
	
private static final Logger log = LoggerFactory.getLogger(Main.class);
	public static void main(String[] args) {
		
		SpringApplication.run(Main.class, args);
		
	}
	
	@Bean
	public CommandLineRunner demo(PersonRepository repository) {
		return(args) -> {
			repository.save(new Person("Scott","Klara", "hässelby"));
			repository.save(new Person("lousie","Klara", "hässelby"));
			repository.save(new Person("tobias","Klara", "hässelby"));
			log.info("Person hittade med findAll()");
			log.info("-------------------------");
			for (Person person: repository.findAll()) {
				log.info(person.toString());
			}
			log.info("");
			
			repository.findById(1L).
				ifPresent(person -> {
					log.info("Person Hittat med Id 1L");
					log.info("---------------------------");
					log.info(person.toString());
					log.info("");
				});
		};
		
	}

}
