package library;

import java.util.ArrayList;

public class LibraryApp {

	public static void main(String[] args) {

		Library library = new Library();

		ArrayList<Items> items = new ArrayList<>();
		ArrayList<Person> people = new ArrayList<>();

		Person p1 = new Person("John");
		Person p2 = new Person("Jane");
		Person p3 = new Person("Billy");
		Person p4 = new Person("Alex");

		people.add(p1);
		people.add(p2);
		people.add(p3);
		people.add(p4);

		Items item1 = new Book("Educational", "Java for dummies", 300, true, "Jordan Harrison");
		Items item2 = new Book("Sports", "Born to Run", 250, true, "Christopher Mcdougall");
		Items item3 = new Magazine("Fashion", "Vogue", 30, false, "Conde Nast");
		Items item4 = new Magazine("Sports", "Men's Health", 50, true, "Hearst Communications");
		Items item5 = new Map("Navigational", "Ultimate Navigation Manual", 200, false, "Collins");
		Items item6 = new Map("General Reference", "Map Of The World", 600, true, "Collins");

		items.add(item1);
		items.add(item2);
		items.add(item3);
		items.add(item4);
		items.add(item5);
		items.add(item6);

		library.checkOutItem(0);

	}

}
