package tempore.Main.timeHandler;


import java.awt.List;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.jar.Attributes.Name;

//Not done. Need Help.
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

import sun.awt.SunHints.LCDContrastKey;
import tempore.Main.timeHandler.model.Location;
import tempore.Main.timeHandler.model.Trip;
@JsonDeserialize (as = SlResponse.class)
@Service
public class TimeService implements TimeInterface {
	
	private final static String SL_URL = 
			"https://api.sl.se/api2/TravelplannerV3/trip.json?key=aa704a5c893c433f9c0a38c00371a300";
	private final static String SL_LANG = "&lang=sv";
	public String Orgin_ID_Latitude ="&originId=3814";
	public String Orgin_ID_Num;
	public String Destination_ID_Parmeter ="&destId=1319";
	public String Dest_Num;
	RestTemplate restTemplate = new RestTemplate();
	@Override
	public SlResponse findTravel(Date starTime, Location startLocation, Location endLocation) 
		throws TimeoutExceptions{
		//ObjectMapper objectMapper = new ObjectMapper();
		//ResponseEntity<SlResponse> slResp = getResponse(startLocation,endLocation);
		//SlResponse retrunResp = new SlResponse();
		//retrunResp.setTrip(slResp.getBody());//Problem
		//retrunResp.getTrip();
		getResponse(startLocation,endLocation);
		return null;		
	}
	protected ResponseEntity<String> getResponse(Location start, Location end) {
		String requestURL = SL_URL+SL_LANG+Orgin_ID_Latitude+Destination_ID_Parmeter;
		System.out.println(requestURL);
		ResponseEntity<String> response = restTemplate.getForEntity(requestURL, String.class);
		ObjectMapper mapper = new ObjectMapper();
		JsonNode root = null;
		
		try {
			root = mapper.readTree(response.getBody());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		JsonNode names = root.path("Trip");
		
		if(names.isArray()) {
			System.out.println("Started if statement");
			for(JsonNode node: names) {
				JsonNode leglist = node.path("LegList");
				System.out.println(leglist.toString());
//				if(leglist.isArray()) {
//					for(JsonNode LegNode : leglist) {
//						JsonNode leg = LegNode.path("Leg");
//						System.out.println(leg.toString());
//					}
//				}
			}
		}
		System.out.println(names.toString());
		System.out.println(names.asText());
		ResponseEntity<SlResponse> test = restTemplate.getForEntity(requestURL, SlResponse.class);
		System.out.println("Test" + test.getBody().getTrip());
		SlResponse sl = restTemplate.
				getForObject(requestURL,
				SlResponse.class);
		System.out.println(sl);
		System.out.println(sl.getTrip());
		System.out.println(response);
		System.out.println(response.hasBody());
		System.out.println(response.getBody());
		//SlResponse slResponse = response.getBody();
		//System.out.println(slResponse.getTrip());
		return response;
	}
	public TimeService() {
		
	}
	protected void setup() {
		
	}
	
	
	
	
}
