package book_management_system;


public class Book {
	private int bookId;
	private String bookName;
	private String author;
	private double bookPrice;
	
	//getter and setter method
	public int getBookId() {
		return bookId;
	}
	public void setBookId(int bookId) {
		this.bookId = bookId;
	}
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public double getBookPrice() {
		return bookPrice;
	}
	public void setBookPrice(double bookPrice) {
		this.bookPrice = bookPrice;
	}
	
	
	//constructor using fields
	public Book(int bookId, String bookName, String author, double bookPrice) {
		super();
		this.bookId = bookId;
		this.bookName = bookName;
		this.author = author;
		this.bookPrice = bookPrice;
	}
	
	//constructor using superclass
	public Book() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}