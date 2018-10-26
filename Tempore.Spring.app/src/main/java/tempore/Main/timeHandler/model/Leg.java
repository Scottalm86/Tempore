package tempore.Main.timeHandler.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Getter;
import lombok.Setter;
@JsonIgnoreProperties(ignoreUnknown=true)
@Getter
@Setter
public class Leg {
	public Location Orgin;
	public Location Destination;

}
