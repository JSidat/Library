package library;

import java.util.ArrayList;

public class Library {

	private ArrayList<Items> items = new ArrayList<>();
	private ArrayList<Person> people = new ArrayList<>();

	public void addPerson(Person person) {
		if (people.contains(person) == false) {
			people.add(person);
		}
	}

	public void removePerson(Person person) {
		people.remove(person);
	}

	public void addItem(Items item) {
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
				addItem(item);
				item.setAvailable(true);
			}
		}
		return "Thank you for returning this item";
	}

	public String checkOutItem(int id) {
		for (Items item : items) {
			if (item.getId() == id && item.getIsAvailable() == true && items.contains(item)) {
				removeItem(id);
				item.setAvailable(false);
			}
		}
		return "Thank you for taking this item out, enjoy!";
	}
}
