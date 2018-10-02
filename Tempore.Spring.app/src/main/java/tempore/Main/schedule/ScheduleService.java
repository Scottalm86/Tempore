package tempore.Main.schedule;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ScheduleService {
	
	@Autowired
	private ScheduleRepository scheduleRepository;
	
//Get all persons in DB 
	public List<Schedule> getAllSchedule(Long personId){
		List<Schedule> schedule = new ArrayList<>();	
		scheduleRepository.findByPersonId(personId)
		.forEach(schedule::add);
		return schedule;
		}
	
//Find the Person with ID in DB
	public List<Schedule> getSchedule(Long scheduleId) {
		return scheduleRepository.findByPersonId(scheduleId);
		
	}
//Add a Person to DB
	public void addSchedule(Schedule schedule) {
		scheduleRepository.save(schedule);
	}
//Update a Person in DB
	public void updateSchedule(Schedule schedule) {
		scheduleRepository.save(schedule);
	}
//Delete a Person from DB
	public void deleteSchedule(Long scheduleId) {
		scheduleRepository.deleteById(scheduleId);
	}


}
