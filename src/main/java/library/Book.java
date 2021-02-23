package library;

public class Book extends Items {

	private String author;

	public Book(String itemType, String title, int numOfPages, boolean isAvailable, String author) {
		super(itemType, title, numOfPages, isAvailable);
		this.author = author;
	}

	@Override
	public String openItem() {
		return "Book opened";
	}

	@Override
	public String closeItem() {
		return "Dont forget to bookmark before closing!";
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

}
