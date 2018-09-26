package tempore.Main.personRegister;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class PersonController {
	
	
	@Autowired
	private PersonService personService;
	
	
	@RequestMapping("/tja")
	public List<Person> getAllPerson() {
		return personService.getAllPerson();
	}
	
	@RequestMapping("/tja/{Id}")
	public Person getPerson(@PathVariable String Id) {
		return personService.getPerson(Id);
	}
	@RequestMapping(method=RequestMethod.DELETE, value="/tja/{Id}")
	public void deletePerson(@PathVariable String Id) {
		personService.deletePerson(Id);
	}
	
	@RequestMapping(method=RequestMethod.POST, value="/tja")
	public void addPerson(@RequestBody Person person) {
		personService.addPerson(person);
	}
	@RequestMapping(method=RequestMethod.PUT, value="/tja/{Id}")
	public void updatePerson(@RequestBody Person person,@PathVariable String Id) {
		personService.updatePerson(Id, person);
	}
}
