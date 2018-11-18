package tempore.Main.timeHandler;


import java.io.IOException;
import java.util.Date;

//Not done. Need Help.
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import sun.awt.SunHints.LCDContrastKey;
import tempore.Main.timeHandler.model.Location;

@Service
public class TimeService implements TimeInterface {
	
	private final static Object SL_URL = 
			"https://api.sl.se/api2/TravelplannerV3/trip.json?key=aa704a5c893c433f9c0a38c00371a300";
	private final static String SL_LANG = "&sv";
	public String Orgin_ID_Latitude ="&originId=3814";
	public String Orgin_ID_Num;
	public String Destination_ID_Parmeter ="&destId=1319";
	public String Dest_Num;
	RestTemplate restTemplate = new RestTemplate();
	@Override
	public SlResponse findTravel(Date starTime, Location startLocation, Location endLocation) 
		throws TimeoutExceptions{
		//ObjectMapper objectMapper = new ObjectMapper();
		ResponseEntity<SlResponse> slResp = getResponse(startLocation,endLocation);
		SlResponse retrunResp = new SlResponse();
		retrunResp.setTrip(slResp.getBody());//Problem
		retrunResp.getTrip();
		return retrunResp;		
	}
	protected ResponseEntity<SlResponse> getResponse(Location start, Location end) {
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
