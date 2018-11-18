package tempore.Main.timeHandler.model;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Getter;
import lombok.Setter;
@JsonIgnoreProperties(ignoreUnknown=true)
@Getter
@Setter
public class Leg implements Serializable {
	public Location Orgin;
	public Location Destination;

}
