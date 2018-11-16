package tempore.Main.timeHandler;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;


import lombok.Getter;
import lombok.Setter;
import tempore.Main.timeHandler.model.Trip;


@JsonIgnoreProperties(ignoreUnknown=true)
@Getter
@Setter
public class SlResponse {
	/*
	om det är så här json ser ut. 
	{
	"trip": {
		"key": "value"
		}
	}	
	*/
	public String trip;
	/*
	For testing
	public Trip trip;
	*/
	/*
	Not needed I think.
	public Trip setTrip(SlResponse body) {
		return trip;
		
	}
	*/
}
