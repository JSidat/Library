package library;

public class Maps extends Items {

	private String region;

	public Maps(String itemType, String title, int numOfPages, boolean isAvailable, String region) {
		super(itemType, title, numOfPages, isAvailable);
		this.region = region;
	}

	public String getRegion() {
		return region;
	}

	public void setRegion(String region) {
		this.region = region;
	}

}
