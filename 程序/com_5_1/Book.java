package com_5_1;

public class Book {
       int id;
       String title;
       Book(String title, int id){
    	   this.title = title;
    	   this.id = id;
       }
       public String toString() {
    	   return title;
       }

}