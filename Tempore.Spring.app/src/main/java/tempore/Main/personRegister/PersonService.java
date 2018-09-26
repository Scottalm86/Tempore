package tempore.Main.personRegister;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public class PersonService {
	
	private List<Person> persons = new ArrayList<>(Arrays.asList(
			new Person("Person", "Scott", "test"),
			new Person("Person2", "jocke", "test3")
			
			));
	public List<Person> getAllPerson(){
		return persons;
	}
	
	public Person getPerson(String Id) {
		return persons.stream().filter(p -> p.getId().equals(Id)).findFirst().get();
		
	}

	public void addPerson(Person person) {
		persons.add(person);
	}
	public void updatePerson(String id, Person person) {
		for(int i=0; i<persons.size(); i++) {
			Person p = persons.get(i);
			if(p.getId().equals(id)) {
				persons.set(i, person);
				return;
			}
		}
	}

	public void deletePerson(String Id) {
		persons.removeIf(p-> p.getId().equals(Id));
	}

}
