package com.andreluiz.bookstoremanager.author.repository;

import com.andreluiz.bookstoremanager.author.entity.Author;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AuthorRepository extends JpaRepository<Author, Long> {
}
