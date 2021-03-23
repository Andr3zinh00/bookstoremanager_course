package com.andreluiz.bookstoremanager.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author André Luiz
 * Classe inicial
 **/
@RestController
@RequestMapping("/api/v1/books")
public class BookController {
    @GetMapping
    public String helloWorld() {
        return "HelloWorld";
    }
}
