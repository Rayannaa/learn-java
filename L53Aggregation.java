package l53;


// Aggregation = "has-a" relationship between object.
// one object contains another object as part of its structure
// the contained object can exist independently
public class L53Aggregation {

	public static void main(String[] args) {
		Book book1 = new Book("The Fellow of the Ring", 423);
		Book book2 = new Book("The Two Towers", 352);
		Book book3 = new Book("The Return of the King", 416);
		
		Book[] books = {book1, book2, book3};
		
		Library library = new Library("NYC Public Library", 1897, books);
		
		library.displayInfo();
	}

}
