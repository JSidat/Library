package library;

public class Map extends Items {

	private String region;

	public Map(String itemType, String title, int numOfPages, boolean isAvailable, String region) {
		super(itemType, title, numOfPages, isAvailable);
		this.region = region;
	}

	public String findLocation() {
		return "checking map to find location";
	}

	public String getRegion() {
		return region;
	}

	public void setRegion(String region) {
		this.region = region;
	}

}
