package org.ssglobal.training.codes.itemA;

public class Book {
	private String name;
	private Author author;
	private double price;
	private int qtyStock;
	private static int instanceCounter = 0;

	public Book(String name, Author author, double price, int qtyStock) {
		super();
		this.name = name;
		this.author = author;
		this.price = price;
		this.qtyStock = qtyStock;
	}
	
	public static Book getInstance(String name, Author author, double price, int qtyStock) throws BookException, Exception {
        if (instanceCounter < 5) {
            instanceCounter++;
            return new Book(name, author, price, qtyStock);
        } else {
            throw new BookException();
        }
    }
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public Author getAuthor() {
		return author;
	}
	
	public void setAuthor(Author author) {
		this.author = author;
	}
	
	public double getPrice() {
		return price;
	}
	
	public void setPrice(double price) {
		this.price = price;
	}
	

	public int getQtyStock() {
		return qtyStock;
	}
	
	public void setQtyStock(int qtyStock) {
		this.qtyStock = qtyStock;
	}
	
	@Override
	public String toString() {
		return "%s %s %f %d".formatted(name, author, price, qtyStock);
	}
}
