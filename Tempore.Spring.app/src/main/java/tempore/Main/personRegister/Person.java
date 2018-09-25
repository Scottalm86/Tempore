package tempore.Main.personRegister;
import javax.persistence.*;

@Entity
public class Person {
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE)
	public Long Id;
	public String personName;
	public String personAdress;
	
	protected Person() {}
	public Person(String personName, String personAdress) {
		this.personName = personName;
		this.personAdress = personAdress;
	}
	public String getPersonName() {
		return personName;
	}
	public void setPersonName(String personName) {
		this.personName = personName;
	}
	public String getPersonAdress() {
		return personAdress;
	}
	public void setPersonAdress(String personAdress) {
		this.personAdress = personAdress;
	}
	
}
