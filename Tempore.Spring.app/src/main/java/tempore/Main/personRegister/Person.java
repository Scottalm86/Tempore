package tempore.Main.personRegister;


public class Person {
	
	public String Id;
	public String personName;
	public String personAdress;
	
	protected Person() {}
	public Person(String Id,String personName, String personAdress) {
		this.Id=Id;
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
	public String getId() {
		return Id;
	}
	public void setId(String id) {
		Id = id;
	}
	
}
