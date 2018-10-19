package tempore.Main.timeHandler;


//Not done. Need Help.
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class TimeService {
	
	private final static Object SL_URL = 
			"https://api.sl.se/api2/TravelplannerV3/trip.json?key=aa704a5c893c433f9c0a38c00371a300";
	private final static String SL_LANG = "&sv";
	public String Orgin_ID_Latitude ="&originId=3814"/*+ longitude and latitude class */;
	//public String Orgin_ID_Longitud ="&originCoordLong="/*+ longitude and latitude class */;
	public String Destination_ID_Parmeter ="&destId=1319"/*Set destination */;
	//public String Time_Parmeter ="&";
	RestTemplate restTemplate = new RestTemplate();
	
	
	public Object  getResponse() {
		ResponseEntity<Object> response = restTemplate.
				getForEntity(SL_URL+SL_LANG+Orgin_ID_Latitude+Destination_ID_Parmeter/*Time_Parmeter*/,
				Object.class);
		return response;
	}
	
}
