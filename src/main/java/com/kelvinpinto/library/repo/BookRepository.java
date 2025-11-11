package com.kelvinpinto.library.repo;

import com.kelvinpinto.library.model.Book;
import java.util.Optional;

public interface BookRepository {
    Optional<Book> findByIsbn(String isbn);
    void save(Book book);
}
