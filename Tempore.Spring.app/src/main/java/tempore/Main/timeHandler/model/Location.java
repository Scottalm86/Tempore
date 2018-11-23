package tempore.Main.timeHandler.model;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.*;
@JsonIgnoreProperties(ignoreUnknown=true)
@NoArgsConstructor
@Getter
@Setter
public class Location implements Serializable{
	
	public int start;
	public int end;
	public String name;
	public String time;
	public String date;
	public String track;
	public String BussNum;
	
}
