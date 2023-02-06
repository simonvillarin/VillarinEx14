package org.ssglobal.training.codes.itemA;

public class TestLibrary {

	public static void main(String[] args) {
		try {
			System.out.println(Book.getInstance("Cypher", Author.getInstance("Simon", "simon@email.com", 'M'), 1000.0, 5));
		} catch (BookException e) {
			System.out.println(e.getMessage());
		} catch (AuthorException e) {
			System.out.println(e.getMessage());
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		try {
			System.out.println(Book.getInstance("Neon", Author.getInstance("James", "james@email.com", 'M'), 1000.0, 5));
		} catch (BookException e) {
			System.out.println(e.getMessage());
		} catch (AuthorException e) {
			System.out.println(e.getMessage());
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		try {
			System.out.println(Book.getInstance("Breach", Author.getInstance("Skye", "skye@email.com", 'F'), 1000.0, 5));
		} catch (BookException e) {
			System.out.println(e.getMessage());
		} catch (AuthorException e) {
			System.out.println(e.getMessage());
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		try {
			System.out.println(Book.getInstance("Fade", Author.getInstance("Reyna", "reyna@email.com", 'F'), 1000.0, 5));
		} catch (BookException e) {
			System.out.println(e.getMessage());
		} catch (AuthorException e) {
			System.out.println(e.getMessage());
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		try {
			System.out.println(Book.getInstance("Raze", Author.getInstance("Sova", "sova@email.com", 'M'), 1000.0, 5));
		} catch (BookException e) {
			System.out.println(e.getMessage());
		} catch (AuthorException e) {
			System.out.println(e.getMessage());
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		try {
			System.out.println(Book.getInstance("Jett", Author.getInstance("Brimstone", "brimstone@email.com", 'M'), 1000.0, 5));
		} catch (BookException e) {
			System.out.println(e.getMessage());
		} catch (AuthorException e) {
			System.out.println(e.getMessage());
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
