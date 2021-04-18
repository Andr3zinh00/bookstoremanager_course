package com.andreluiz.bookstoremanager.publishers.entity;

import com.andreluiz.bookstoremanager.auditable.Auditable;
import com.andreluiz.bookstoremanager.books.entity.Book;
import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;

/**
 * @author andr3z0
 */
@EqualsAndHashCode(callSuper = true)
@Entity
@Data
public class Publisher extends Auditable {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


    @Column(nullable = false, unique = false)
    private String name;

    @Column(nullable = false, unique = false, length = 100)
    private String code;


    @Column(nullable = false, unique = false, columnDefinition = "TIMESTAMP")
    private LocalDate foundationDate;


    @OneToMany(mappedBy = "user", fetch = FetchType.LAZY)
    private List<Book> books;
}
