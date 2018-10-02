package tempore.Main.schedule;
import javax.persistence.*;

import tempore.Main.personRegister.Person;

@Entity
public class Schedule {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long scheduleId;
	private String personName;
	@ManyToOne
	private Person person;
	
	public Schedule() {}
	
	
	public Schedule(Long scheduleId,String personName, double scheduleStart, Long Id) {
		super();
		this.scheduleId = scheduleId;
		this.personName = personName;
		this.person= new Person(Id, "", "");
	}
	public String getPersonName() {
		return personName;
	}
	public void setPersonName(String personName) {
		this.personName = personName;
	}
	public Long getScheduleId() {
		return scheduleId;
	}
	public void setScheduleId(Long scheduleId) {
		this.scheduleId = scheduleId;
	}
	public Person getPerson() {
		return person;
	}
	public void setPerson(Person person) {
		this.person = person;
	}

	
}
