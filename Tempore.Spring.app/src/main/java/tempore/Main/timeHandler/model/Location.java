package tempore.Main.timeHandler.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.*;
@JsonIgnoreProperties(ignoreUnknown=true)

@NoArgsConstructor
@Getter
@Setter
public class Location {
	
	public int start;
	public int end;
	public String name;
	public String time;
	public String date;
	public String track;
	
}
