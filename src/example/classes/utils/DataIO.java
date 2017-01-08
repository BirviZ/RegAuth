package example.classes.utils;

import example.classes.User;

public class DataIO {
	
	private static DataIO instance;
	
	private DataIO() {
		
	}
	
	public static DataIO getInstance() {
		if(instance == null) {
			instance = new DataIO();
		}
		return instance;
	}
	
	public User getUser(String name, String pass) {
		if (!exist(name)) {
			return null;
		}
		
		User user = new User(name, pass);
		return user;
	}
	
	private boolean exist(String name) {
		return true;
	}
}