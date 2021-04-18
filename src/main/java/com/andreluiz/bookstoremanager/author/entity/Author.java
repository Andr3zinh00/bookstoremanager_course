package com.andreluiz.bookstoremanager.author.entity;

import com.andreluiz.bookstoremanager.books.entity.Book;
import lombok.Data;

import javax.persistence.*;
import java.util.List;

/**
 * @author andr3z0
 */
@Entity
@Data
public class Author {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, unique = true)
    private String name;

    @Column(columnDefinition = "integer default 0")
    private int age;

    @OneToMany(mappedBy = "author", fetch = FetchType.LAZY)
    private List<Book> books;

}
