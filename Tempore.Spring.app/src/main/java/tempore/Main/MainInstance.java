package tempore.Main;

import java.util.Date;

import org.springframework.stereotype.Service;

import tempore.Main.timeHandler.SlResponse;
import tempore.Main.timeHandler.TimeInterface;
import tempore.Main.timeHandler.TimeService;
import tempore.Main.timeHandler.TimeoutExceptions;

import tempore.Main.timeHandler.model.Location;

@Service
public class MainInstance {
	TimeInterface timeService = new TimeService();
	
	public void printResponse() {
		Location start = new Location();
		Location End = new Location();
		Date startTime = new Date();
		try {
			SlResponse response = timeService.findTravel(startTime, start, End);
			
		} catch (TimeoutExceptions e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
	}
}
