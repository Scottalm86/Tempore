package tempore.Main.personRegister;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import jdk.nashorn.internal.ir.IfNode;
@RestController
public class PersonController {
	
	
	@Autowired
	private PersonService personService;
	
	
	@RequestMapping("/tja")
	public List<Person> getAllPerson() {
		return personService.getAllPerson();
	}
	
	@RequestMapping("/tja/{id}")
	public Optional<Person> getPerson(@PathVariable Long id) {
		return personService.getPerson(id);
	}
	@RequestMapping(method=RequestMethod.DELETE, value="/tja/{id}")
	public void deletePerson(@PathVariable Long id) {
		personService.deletePerson(id);
	}
	
	@RequestMapping(method=RequestMethod.POST, value="/tja")
	public void addPerson(@RequestBody Person person) {
		personService.addPerson(person);
	}
	@RequestMapping(method=RequestMethod.PUT, value="/tja/{id}")
	public void updatePerson(@RequestBody Person person,@PathVariable Long id) {
		personService.updatePerson(id, person);
	}
}
