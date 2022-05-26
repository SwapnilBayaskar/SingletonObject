package com.SingletonPattern;

public class Database {
	
	private static Database objDatabase; //Created Singleton Object. No other object will be permitted.
	
	private Database() { //This is the private constructor. So that no other object should be created.
		
	}
	
	public static Database getInstance() {
		
		if(objDatabase == null) {
			objDatabase = new Database();
		}
		
		return objDatabase;
	}
	
	
	public void setConnection() {
		
		System.out.println("Setting up the Connection......");
	}
	
	public void getConnection() {
		
		System.out.println("Connected to the Database !");
	}
	

}
