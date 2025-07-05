package com.library.service;

import com.library.repository.BookRepository;

public class BookService {

    private BookRepository bookRepository;

    // Constructor Injection
    public BookService(BookRepository bookRepository) {
        System.out.println("Constructor injection called.");
        this.bookRepository = bookRepository;
    }

    // Setter Injection
    public void setBookRepository(BookRepository bookRepository) {
        System.out.println("Setter injection called.");
        this.bookRepository = bookRepository;
    }

    public void addBook(String bookName) {
        System.out.println("Adding book: " + bookName);
        bookRepository.save(bookName);
    }
}
