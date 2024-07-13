package com.access_specifier1_pack1;

public class Book {
    private String bookCode;
    private String bookName;
    private String author;

    public Book(String bookCode, String bookName, String author) {
        this.bookCode = bookCode;
        this.bookName = bookName;
        this.author = author;
    }

    public void display() {
        System.out.println("Code :" + bookCode);
        System.out.println("Book name:" + bookName);
        System.out.println("Author :" + author);
    }
}
