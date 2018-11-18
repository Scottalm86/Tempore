package tempore.Main.timeHandler.model;

import java.io.Serializable;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Getter;
import lombok.Setter;
@JsonIgnoreProperties(ignoreUnknown=false)
@Getter
@Setter
public class Trip implements Serializable {
	
	public List<String> legList;

}
