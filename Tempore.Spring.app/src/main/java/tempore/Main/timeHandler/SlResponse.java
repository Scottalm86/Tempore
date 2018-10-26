package tempore.Main.timeHandler;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.Getter;
import lombok.Setter;
import tempore.Main.timeHandler.model.Trip;


@JsonIgnoreProperties(ignoreUnknown=true)
@Getter
@Setter
public class SlResponse {
	public Trip trip;
	
	
}
