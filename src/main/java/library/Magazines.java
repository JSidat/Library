package library;

public class Magazines extends Items {

	private String publisher;

	public Magazines(String itemType, String title, int numOfPages, boolean isAvailable, String publisher) {
		super(itemType, title, numOfPages, isAvailable);
		this.publisher = publisher;
	}

	public String doCrossword() {
		return "See how fast you can do the crossword!";
	}

	public String getPublisher() {
		return publisher;
	}

	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}

}
