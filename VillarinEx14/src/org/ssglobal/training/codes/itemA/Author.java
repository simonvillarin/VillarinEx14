package org.ssglobal.training.codes.itemA;

public class Author {
	private String name;
	private String email;
	private char gender;
	private static int instanceCounter = 0;
	
	private Author(String name, String email, char gender) {
		super();
		this.name = name;
		this.email = email;
		this.gender = gender;
	}
	
	public static Author getInstance(String name, String email, char gender) throws AuthorException, Exception {
        if (instanceCounter < 5) {
            instanceCounter++;
            return new Author(name, email, gender);
        } else {
            throw new AuthorException();
        }
    }

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public char getGender() {
		return gender;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}
	
	@Override
	public String toString() {
		return "%s %s %c".formatted(name, email, gender);
	}
}
