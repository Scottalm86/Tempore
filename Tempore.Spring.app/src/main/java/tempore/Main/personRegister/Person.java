package tempore.Main.personRegister;

import javax.persistence.*;

@Entity
public class Person {
	

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	private String personName;
	private String personAdress;
	private String startTime;
	
	
	


	public Person() {}
	
	
	public Person(Long id,String personName, String personAdress,String startTime) {
		super();
		this.id = id;
		this.personName = personName;
		this.personAdress = personAdress;
		this.startTime = startTime;
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
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getStartTime() {
		return startTime;
	}
	public void setStartTime(String startTime) {
		this.startTime = startTime;
	}

	
}
