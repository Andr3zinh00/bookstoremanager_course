package com.andreluiz.bookstoremanager.books.entity;

import com.andreluiz.bookstoremanager.author.entity.Author;
import com.andreluiz.bookstoremanager.publishers.entity.Publisher;
import com.andreluiz.bookstoremanager.user.entity.User;
import lombok.Data;

import javax.persistence.*;
import java.time.LocalDate;

/**
 * @author andr3z0
 */
@Entity
@Data
public class Book {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


    @Column(nullable = false, length = 100)
    private String name;

    @Column(nullable = false)
    private String isbn;


    @Column(columnDefinition = "integer default 0")
    private int pages;

    @Column(columnDefinition = "integer default 0")
    private int chapters;

    @ManyToOne(cascade = {CascadeType.MERGE})
    private Author author;

    @ManyToOne(cascade = {CascadeType.MERGE})
    private Publisher publisher;

    @ManyToOne(cascade = {CascadeType.MERGE})
    private User user;

}
