package library;

import java.util.ArrayList;

public class Library {

	private ArrayList<Items> items = new ArrayList<>();
	private ArrayList<Person> people = new ArrayList<>();

	private int itemID = 1;
	private int personID = 1;

	public void addPerson(Person person) {
		person.setId(personID++);
		people.add(person);
	}

	public void removePerson(Person person) {
		people.remove(person);
	}

	public void addItem(Items item) {
		item.setId(itemID++);
		items.add(item);
	}

	public void removeItem(int id) {
		for (Items item : items) {
			if (item.getId() == id) {
				items.remove(item);
				break;
			}
		}
	}

	public String checkInItem(int id) {
		for (Items item : items) {
			if (item.getId() == id && item.getIsAvailable() == false && items.contains(item)) {
				item.setAvailable(true);
			}
		}
		return "Thank you for returning this item";
	}

	public Boolean checkOutItem(int id) {
		for (Items item : items) {
			if (item.getId() == id && item.getIsAvailable()) {
				System.out.println("Thank you for taking this item out, enjoy!");
				item.setAvailable(false);
			} else {
				System.out.println("Sorry, item is not currently available");
			}
		}
		return true;
	}
}
