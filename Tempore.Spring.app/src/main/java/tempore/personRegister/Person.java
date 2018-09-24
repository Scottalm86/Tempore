package tempore.personRegister;
import java.io.FilePermission;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.*;


@Getter @Setter @Entity
public class Person {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long PersonId;
	@Column(unique = true)
	private String PersonName;
	private String PersonSchool;
	private String PersonAdress;
	
	protected Person() {}
	public Person(String personName, String personSchool, String personAdress) {
	
		this.PersonName = personName;
		this.PersonSchool = personSchool;
		this.PersonAdress = personAdress;
	}
	
	@Override
	public String toString() {
		return String.format("Person [id=%d, personName='%s']" , PersonId, PersonName);
	}

	public String getPersonName() {
		return PersonName;
	}
	public void setPersonName(String personName) {
		PersonName = personName;
	}
	public String getPersonSchool() {
		return PersonSchool;
	}
	public void setPersonSchool(String personSchool) {
		PersonSchool = personSchool;
	}
	public String getPersonAdress() {
		return PersonAdress;
	}
	public void setPersonAdress(String personAdress) {
		PersonAdress = personAdress;
	}
	public Long getPersonId() {
		return PersonId;
	}
	public void setPersonId(Long personId) {
		PersonId = personId;
	}
	

}
