package tempore.Main.personRegister;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class PersonController {
	@RequestMapping("/tja")
	public List<Person> getAllPerson() {
		return Arrays.asList(
				new Person("scott", "test"),
				new Person("jocke", "klara")
				
				);
	}
}
