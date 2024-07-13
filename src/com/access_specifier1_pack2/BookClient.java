package com.access_specifier1_pack2;

import com.access_specifier1_pack1.Book;


public class BookClient {

    public static void main(String[] args) {
        Book b = new Book("B001", "Spring", "Gosling");
        b.display();
    }
}
