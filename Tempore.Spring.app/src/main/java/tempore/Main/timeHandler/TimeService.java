package tempore.Main.timeHandler;


import java.util.Date;

//Not done. Need Help.
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import tempore.Main.timeHandler.model.Location;

@Service
public class TimeService implements TimeInterface {
	
	private final static Object SL_URL = 
			"https://api.sl.se/api2/TravelplannerV3/trip.json?key=aa704a5c893c433f9c0a38c00371a300";
	private final static String SL_LANG = "&sv";
	public String Orgin_ID_Latitude ="&originId=";
	public String Orgin_ID_Num;
	public String Destination_ID_Parmeter ="&destId=1319";
	public String Dest_Num;
	RestTemplate restTemplate = new RestTemplate();
	public SlResponse findTravel(Date starTime, Location startLocation, Location endLocation) 
		throws TimeoutExceptions{
		ResponseEntity<SlResponse> slResp = getResponse();
		return slResp.getBody();		
	}
	protected ResponseEntity<SlResponse> getResponse() {
		ResponseEntity<SlResponse> response = restTemplate.
				getForEntity(SL_URL+SL_LANG+Orgin_ID_Latitude+Destination_ID_Parmeter/*Time_Parmeter*/,
				SlResponse.class);
		return response;
	}
	public TimeService() {
		
	}
	protected void setup() {
		
	}
	
	
}
