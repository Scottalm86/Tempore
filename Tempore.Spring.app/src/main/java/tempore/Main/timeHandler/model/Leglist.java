package tempore.Main.timeHandler.model;

import java.io.Serializable;
import java.util.ArrayList;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.JsonNode;

import lombok.Getter;
import lombok.Setter;
@JsonIgnoreProperties(ignoreUnknown=true)
@Getter 
public class Leglist implements Serializable {
	public ArrayList<JsonNode> leg;

	public void setLeg(ArrayList<JsonNode> legs) {
		this.leg = legs;
	}
}
