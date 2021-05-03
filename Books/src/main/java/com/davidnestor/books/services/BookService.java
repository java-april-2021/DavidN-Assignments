package com.davidnestor.books.services;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

//...
import org.springframework.stereotype.Service;

import com.davidnestor.books.models.Book;
import com.davidnestor.books.repositories.BookRepository;
@Service
public class BookService {
 // adding the book repository as a dependency
private final BookRepository bookRepository;
 
 public BookService(BookRepository bookRepository) {
     this.bookRepository = bookRepository;
 }
 
 private List<Book> books = new ArrayList<Book>(Arrays.asList(
         new Book("Harry Potter and the Sorcerer's Stone", "A boy wizard saving the world", "english", 309),
         new Book("The Great Gatsby", "The story primarily concerns the young and mysterious millionaire Jay Gatsby", "english", 180),
         new Book("Moby Dick", "The saga of Captain Ahab", "english", 544),
         new Book("Don Quixote", "Life of a retired country gentleman", "english", 150),
         new Book("The Odyssey", "Ancient Greek epic poem", "english", 475)
         ));
 // returns all the books
 public List<Book> allBooks() {
     return bookRepository.findAll();
 }
 // creates a book
 public Book createBook(Book b) {
     return bookRepository.save(b);
 }
 // retrieves a book
 public Book findBook(Long id) {
     Optional<Book> optionalBook = bookRepository.findById(id);
     if(optionalBook.isPresent()) {
         return optionalBook.get();
     } else {
         return null;
     }
 }
 public Book findBookByIndex(int index) {
     if (index < books.size()){
         return books.get(index);
     }else{
         return null;
     }
 }
 public void updateBook(int id, Book book) {
     if (id < books.size()){
         books.set(id, book);
     }
 }
 public void destroyBook(long id) {
     if (id < books.size()){
         books.remove(bookRepository.findById(id));
     }
 }
}
