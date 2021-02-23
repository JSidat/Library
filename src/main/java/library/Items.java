package library;

public abstract class Items {

	private int id;
	private String itemType;
	private String title;
	private int numOfPages;
	private boolean isAvailable;

	public Items(String itemType, String title, int numOfPages, boolean isAvailable) {
		this.setAvailable(true);
		this.itemType = itemType;
		this.numOfPages = numOfPages;
		this.title = title;

	}

	public String openItem() {
		return "";
	}

	public String closeItem() {
		return "";
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getItemType() {
		return itemType;
	}

	public void setItemType(String itemType) {
		this.itemType = itemType;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getNumOfPages() {
		return numOfPages;
	}

	public void setNumOfPages(int numOfPages) {
		this.numOfPages = numOfPages;
	}

	public boolean getIsAvailable() {
		return isAvailable;
	}

	public void setAvailable(boolean isAvailable) {
		this.isAvailable = isAvailable;
	}

	@Override
	public String toString() {
		return "Items [itemType=" + itemType + ", title=" + title + ", numOfPages=" + numOfPages + "]";
	}

}
