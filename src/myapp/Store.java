package myapp;

import java.util.ArrayList;

public class Store {
    
	 ArrayList<String []> Books;
	 private static int BOOKID;
	 private static int BOOKCOUNT;
		public Store() {
			this.Books = new ArrayList<>();
			BOOKID = 0;
			BOOKCOUNT = 0;
		}
		
		public void showBooks() {
			System.out.println("Books in Library");
			for(int i = 0;i<this.Books.size();i++) {
			  String[] bookContent	 = Books.get(i);
	            System.out.println("Book ID: " + bookContent[0] + ", Book Name: " + bookContent[1] + ", Author: " + bookContent[2]);
			}
		}
		
		public void addBookToStore(String bookname,String Author) {
			String bookDetails[] = new String[3];
			bookDetails[0] =Integer.toString(BOOKID++);
			bookDetails[1] = bookname;
			bookDetails[2] = Author;
			this.Books.add(bookDetails);
			BOOKCOUNT++;
		}
		
		public static int getBookCount() {
			return BOOKCOUNT;
		}
	
}
