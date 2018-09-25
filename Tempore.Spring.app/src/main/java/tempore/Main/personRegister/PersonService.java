package tempore.Main.personRegister;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public class PersonService {
	
	private List<Person> person = new ArrayList<>(Arrays.asList(
			new Person("1", "Scott", "test"),
			new Person("3", "jocke", "test3")
			
			));
	public List<Person> getAllPerson(){
		return person;
	}
	
	public Person getPerson(String Id) {
		return person.stream().filter(p -> p.getId().equals(Id)).findFirst().get();
		
	}

	public static void addPerson(Person person) {
		PersonService.addPerson(person);
		
		
	}
}
