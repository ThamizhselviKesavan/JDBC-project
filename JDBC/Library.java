package JDBC;

import java.util.Scanner;

public class Library {

	//private attributes 
	private String bookName;
	private String authorName;
	private long edition;
	private int noOfCopies;
	private String journal;
	private int bookId;



	// public getter and setter methods for the above mentioned attributes
	public int getbookId() {
		return bookId;
	}
	public void setbookId(int bookId) {
		this.bookId=bookId;
	}


	public String getbookName() {
		return bookName;
	}
	public void setbookName(String bookName) {
		this.bookName=bookName;
	}


	public String getauthorName() {
		return authorName;
	}
	public void setauthorName(String authorName) {
		this.authorName=authorName;
	}


	public long getedition() {
		return edition;
	}
	public void setedition(int edition) {
		this.edition=edition;
	}


	public int getnoOfCopies() {
		return noOfCopies;
	}
	public void setnoOfCopies(byte noOfCopies) {
		this.noOfCopies=noOfCopies;
	}


	public String getjournal() {
		return journal;
	}
	public void setjournal(String journal) {
		this.journal=journal;
	}

	// method to check login details  
	static void toCheckLogin(String username,String password) throws Exception {

		if(username.equals("LibraryManagement") && password.equals("library@123")) {
			System.out.println("Logged In Successfully");
			System.out.println("Enter a number from the below options which you want to perform: ");
			System.out.print("1.Add the books"+ '\n'+"2.Display all books" +'\n'+ "3.Search a book"+'\n'+ "4.Delete a book" +'\n'+ "5.Update book" +'\n'+"6.Exit " );
			DriverClass.toCheckCases();
		}
		else {
			System.out.println("Please Enter the correct Login Credentials!");
		}
	}

	// method to Logout
	static void toLogout() {
		System.out.println("Logged Out Successfully ");
		System.out.println("Thank you for visiting");
	}


}