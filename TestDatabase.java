package com.SingletonPattern;

public class TestDatabase {

	public static void main(String[] args) {
		
		//Database objDatabase1 = new Database(); //here we cannot create object of class. Bcoz constructor is not visible.
		
		Database DB;
		
		DB = Database.getInstance(); //This refers to the object of database.
		
		DB.setConnection();
		
		DB.getConnection();

	}

}
