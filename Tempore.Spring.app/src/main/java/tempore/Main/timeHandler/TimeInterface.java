package tempore.Main.timeHandler;
import java.io.IOException;
import java.util.Date;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;

import tempore.Main.timeHandler.model.Location;


public interface TimeInterface   {
	
	SlResponse findTravel(Date startTime, Location start, Location End) throws TimeoutExceptions, JsonParseException, JsonMappingException, IOException;

}
