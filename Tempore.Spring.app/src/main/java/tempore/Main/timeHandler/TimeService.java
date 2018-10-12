package tempore.Main.timeHandler;


//Not done. Need Help.
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class TimeService {
	private final static Object SL_URL = "https://api.sl.se/api2/TravelplannerV3/trip.json?key=aa704a5c893c433f9c0a38c00371a300";
	public String Orgin_ID_Parmeter ="&parametrar";
	public String Destination_ID_Parmeter ="&parametrar";
	public String Time_Parmeter ="&parametrar";
	RestTemplate restTemplate = new RestTemplate();
	
	
	public Object getResponse() {
		ResponseEntity<Object> response = restTemplate.getForEntity(SL_URL+Orgin_ID_Parmeter+Destination_ID_Parmeter+Time_Parmeter,
				Object.class);
		return response;
	}
	public Object getLocation() {
		
		return null;
		
	}
}
