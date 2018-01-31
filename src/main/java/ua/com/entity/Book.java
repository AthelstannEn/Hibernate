package ua.com.entity;

public class Book {

	private int id;

	private String name;

	private String aurhor;

	public Book() {
	}

	public Book(String name, String aurhor) {
		super();
		this.name = name;
		this.aurhor = aurhor;
	}

	public String getAurhor() {
		return aurhor;
	}

	public void setAurhor(String aurhor) {
		this.aurhor = aurhor;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
