package tempore.Main.timeHandler.model;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Getter;
import lombok.Setter;
@JsonIgnoreProperties(ignoreUnknown=true)
@Getter
@Setter
public class Trip {
	
	public List<Leg> legList;

}
