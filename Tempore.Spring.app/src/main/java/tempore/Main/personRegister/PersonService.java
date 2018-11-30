package tempore.Main.personRegister;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonService {
	
	@Autowired
	private PersonRepository personRepository;
	
//Get all persons in DB 
	public List<Person> getAllPerson(){
		List<Person> persons = new ArrayList<>();	
		personRepository.findAll()
		.forEach(persons::add);
		return persons;
		}
	
//Find the Person with ID in DB
	public Optional<Person> getPerson(Long id) {
		return personRepository.findById(id);
		
	}
	
//Add a Person to DB
	public void addPerson(Person person) {
		personRepository.save(person);
	}
//Update a Person in DB
	public void updatePerson(Long id, Person person) {
		personRepository.save(person);
	}
//Delete a Person from DB
	public void deletePerson(Long id) {
		personRepository.deleteById(id);
	}

}
