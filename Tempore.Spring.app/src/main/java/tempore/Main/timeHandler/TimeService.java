package tempore.Main.timeHandler;


//Not done. Need Help.
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class TimeService {
	RestTemplate restTemplate = new RestTemplate();
	
	
	public Object getResponse() {
		ResponseEntity<Object> response = restTemplate.getForEntity("https://api.sl.se/api2/TravelplannerV3/trip.json?key=aa704a5c893c433f9c0a38c00371a300&parametrar",
				Object.class);
		return response;
	}
	
}
