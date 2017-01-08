package example.classes;

public class User {
	private final String name;
	private final String pass;
	private boolean exist = false;
	
	public User(String name, String pass) {
		this.name = name;
		this.pass = pass;
	}
	
	public String getName() {
		return this.name;
	}
	
	public String getPassword() {
		return this.pass;
	}
	
	public boolean isExist() {
		return this.exist;
	}
	
	public void setExist() {
		this.exist = true;
	}
}
