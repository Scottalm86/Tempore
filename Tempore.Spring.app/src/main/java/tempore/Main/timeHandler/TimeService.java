package tempore.Main.timeHandler;


//Not done. Need Help.

import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class TimeService {
	private final RestTemplate restTemplate;
	public TimeService(RestTemplateBuilder restTemplateBuilder) {
		this.restTemplate = restTemplateBuilder.build();
	}
	public TimeExtractor SlRestCall(String name) {
		return this.restTemplate.getForObject("api.sl.se/api2/TravelplannerV3/trip.json?key=aa704a5c893c433f9c0a38c00371a300&parametrar", TimeExtractor.class,name);
	}

}
