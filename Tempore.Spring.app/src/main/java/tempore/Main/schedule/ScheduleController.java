package tempore.Main.schedule;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import tempore.Main.personRegister.Person;
@RestController
public class ScheduleController {
	
	
	@Autowired
	private ScheduleService scheduleService;
	
	
	@RequestMapping("/tja/{id}/schedule")
	public List<Schedule> getAllPerson(Long scheduleId) {
		return scheduleService.getAllSchedule(scheduleId);
	}
	
	@RequestMapping("/tja/{id}/schedule/{scheduleId}")
	public Optional<Schedule> getPerson(@PathVariable Long scheduleId) {
		return scheduleService.getSchedule(scheduleId);
	}
	@RequestMapping(method=RequestMethod.DELETE, value="/tja/{id}/schedule/{scheduleId}")
	public void deletePerson(@PathVariable Long scheduleId) {
		scheduleService.deleteSchedule(scheduleId);
	}
	
	@RequestMapping(method=RequestMethod.POST, value="/tja/{id}/schedule/")
	public void addSchedule(@RequestBody Schedule schedule,@PathVariable Long personId) {
		schedule.setPerson(new Person(personId, "", ""));
		scheduleService.addSchedule(schedule);
	}
	@RequestMapping(method=RequestMethod.PUT, value="/tja/{id}/schedule/{scheduleId}")
	public void updateSchedule(@RequestBody Schedule schedule,@PathVariable Long id, @PathVariable Long scheduleId) {
		schedule.setPerson(new Person(id, "", ""));
		scheduleService.updateSchedule(schedule);
	}
}
