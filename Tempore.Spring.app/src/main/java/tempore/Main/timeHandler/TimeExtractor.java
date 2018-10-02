package tempore.Main.timeHandler;

import javax.persistence.Entity;

@Entity
public class TimeExtractor {

	public String Format = ".json";
	public int SiteId;
	public int TimeWindow;
	public String Apikey;
	public boolean Bus, Metro, Train, Tram, Ship;
	
	
	public TimeExtractor(String format, int siteId, int timeWindow, String apikey, boolean bus, boolean metro,
			boolean train, boolean tram, boolean ship) {
		super();
		Format = format;
		SiteId = siteId;
		TimeWindow = timeWindow;
		Apikey = apikey;
		Bus = bus;
		Metro = metro;
		Train = train;
		Tram = tram;
		Ship = ship;
	}


	public int getSiteId() {
		return SiteId;
	}


	public void setSiteId(int siteId) {
		SiteId = siteId;
	}


	public int getTimeWindow() {
		return TimeWindow;
	}


	public void setTimeWindow(int timeWindow) {
		TimeWindow = timeWindow;
	}


	public String getApikey() {
		return Apikey;
	}


	public void setApikey(String apikey) {
		Apikey = apikey;
	}


	public boolean isBus() {
		return Bus;
	}


	public void setBus(boolean bus) {
		Bus = bus;
	}


	public boolean isMetro() {
		return Metro;
	}


	public void setMetro(boolean metro) {
		Metro = metro;
	}


	public boolean isTrain() {
		return Train;
	}


	public void setTrain(boolean train) {
		Train = train;
	}


	public boolean isTram() {
		return Tram;
	}


	public void setTram(boolean tram) {
		Tram = tram;
	}


	public boolean isShip() {
		return false;
	}


	public void setShip(boolean ship) {
		Ship = ship;
	}
	
	
	
}
