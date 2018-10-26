package tempore.Main.timeHandler;
import java.util.Date;
import tempore.Main.timeHandler.model.Location;


public interface TimeInterface   {
	
	SlResponse findTravel(Date startTime, Location start, Location End) throws TimeoutExceptions;
}
