package com.andreluiz.bookstoremanager.books.repository;

import com.andreluiz.bookstoremanager.books.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Long> {
}
