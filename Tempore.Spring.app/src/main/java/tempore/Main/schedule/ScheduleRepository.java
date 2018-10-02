package tempore.Main.schedule;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface ScheduleRepository extends CrudRepository <Schedule, Long>{
	
	public List<Schedule> findByPersonId(Long personId);

}
