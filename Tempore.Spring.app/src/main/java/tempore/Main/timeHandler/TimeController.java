package tempore.Main.timeHandler;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import tempore.Main.timeHandler.model.Location;

@RestController
public class TimeController {

		@Autowired
		private TimeService timeService;
		
		@RequestMapping("/tja/time")
		public SlResponse getResponse() throws TimeoutExceptions {
				return timeService.findTravel(null, null, null);
			
		}
	
}