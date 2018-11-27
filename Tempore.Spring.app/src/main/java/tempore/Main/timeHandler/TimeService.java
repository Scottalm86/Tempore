package tempore.Main.timeHandler;


import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.jar.Attributes.Name;

import org.hibernate.dialect.pagination.LegacyFirstLimitHandler;
import org.hibernate.loader.plan.build.spi.LoadPlanBuildingAssociationVisitationStrategy;
import org.springframework.data.jpa.repository.query.PartTreeJpaQuery;
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
import com.fasterxml.jackson.databind.node.ArrayNode;

import tempore.Main.personRegister.PersonRepository;
import tempore.Main.timeHandler.model.Leg;
import tempore.Main.timeHandler.model.Leglist;
import tempore.Main.timeHandler.model.Location;
import tempore.Main.timeHandler.model.Trip;
@JsonDeserialize (as = SlResponse.class)
@Service
public class TimeService implements TimeInterface {
	private final static String SL_URL = 
			"https://api.sl.se/api2/TravelplannerV3/trip.json?key=aa704a5c893c433f9c0a38c00371a300";
	private final static String SL_LANG = "&lang=sv";
	public String Orgin_ID_Latitude ="&originId=";
	public String Orgin_ID_Num;
	public String Destination_ID_Parmeter ="&destId=";
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
		return null ;		
	}
	protected Location getResponse(Location start, Location end) {
		
		String requestURL = SL_URL+SL_LANG+Orgin_ID_Latitude+start+Destination_ID_Parmeter+end;
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
		SlResponse slResponse = new SlResponse();
		Trip trip = new Trip(); 
//		Leglist  legsArray= new Leglist();
		List<Leg> legsArray = new ArrayList<>();
		Location Orgin = new Location();
		Location Destination = new Location();
		if(names.isArray()) {
			System.out.println("Started if statement");
			for(JsonNode node: names) {
				JsonNode leglist = node.path("LegList");
				System.out.println(leglist.toString());
				trip.setLegList(leglist);
				if(leglist.isObject()) {
					JsonNode legs = leglist.path("Leg");
						for(JsonNode leg : legs) {
							JsonNode product = leg.get("Product");
							//System.out.println(leg.toString());
							JsonNode orginNode = leg.get("Origin");
							JsonNode destinNode = leg.get("Destination");
							Orgin.setName(orginNode.get("name").textValue());
							Orgin.setTime(orginNode.get("time").textValue());
							Orgin.setDate(orginNode.get("date").textValue());
							Orgin.setBussNum(product.get("line").textValue());
							Orgin.setTrack(leg.get("direction").textValue());
							System.out.println(Orgin.getName()+"\n Tid: "+Orgin.getTime() +"\n Datum:"+ Orgin.getDate()
							+"\n Buss:"+ Orgin.getBussNum()+"\n Mot:"+ Orgin.getTrack());
						}
					
				}
			}
		}
		
		
		slResponse.setTrip(trip);
//		System.out.println(names.toString());
//		System.out.println(names.asText());
//		ResponseEntity<SlResponse> test = restTemplate.getForEntity(requestURL, SlResponse.class);
//		System.out.println("Test" + test.getBody().getTrip());
//		SlResponse sl = restTemplate.
//				getForObject(requestURL,
//				SlResponse.class);
//		System.out.println(sl);
//		System.out.println(sl.getTrip());
//		System.out.println(response);
//		System.out.println(response.hasBody());
//		System.out.println(response.getBody());
		//SlResponse slResponse = response.getBody();
		//System.out.println(slResponse.getTrip());
		return getResponse(Orgin, Destination);
	}
	public TimeService() {
		
	}
	protected void setup() {
		
	}
	
	
	
	
}
