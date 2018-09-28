package tempore.Main.schedule;

import javax.persistence.*;

import tempore.Main.personRegister.Person;

@Entity
public class Schedule {
	

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long scheduleId;
	private String personName;
	@GeneratedValue(strategy=GenerationType.AUTO)
	private double scheduleStart;
	@GeneratedValue(strategy=GenerationType.AUTO)
	private double scheduleEnd;
	@ManyToOne
	private Person person;
	
	public Schedule() {}
	
	
	public Schedule(Long scheduleId,String personName, double scheduleStart, Long personId) {
		super();
		this.scheduleId = scheduleId;
		this.personName = personName;
		this.scheduleStart = scheduleStart;
		this.person= new Person(personId, "", "");
	}
	public String getPersonName() {
		return personName;
	}
	public void setPersonName(String personName) {
		this.personName = personName;
	}
	public double getScheduleStart() {
		return scheduleStart;
	}
	public void setScheduleStart(double scheduleStart) {
		this.scheduleStart = scheduleStart;
	}
	public double getScheduleEnd() {
		return scheduleEnd;
	}
	public void setScheduleEnd(double scheduleEnd) {
		this.scheduleEnd = scheduleEnd;
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
