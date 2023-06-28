package Arrays;

import java.util.Arrays;

class Book{
	private String title;
	private String author;
	
	public Book(String title, String author) {
		super();
		this.title = title;
		this.author = author;
	}

	public String getTitle() {
		return title;
	}

	public String getAuthor() {
		return author;
	}
	
	
	
}

public class DynamicArrayBookInventory {
	
	private Book[] books;
	private int size;
	private int capacity;
	
	public DynamicArrayBookInventory() {
		capacity= 10;
		books = new Book[capacity];
		size=0;
	}
	
	public void addBook(Book book) {
		if(size == capacity) {
			
		}
	}
	
	private void increaseCapacity() {
		capacity *= 2;
		books = Arrays.copyOf(books, capacity);
	}
	
	public void printInventory() {
		System.out.println("Bookstore Inventory: ");
		for(int i=0; i< size; i++) {
			Book book = books[i];
			System.out.println("Title: " + book.getTitle() + "Author: " + book.getAuthor());
		}
	}

}
