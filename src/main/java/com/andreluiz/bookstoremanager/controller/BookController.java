package com.andreluiz.bookstoremanager.controller;

import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
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
    @ApiOperation(value = "Return an hello world")
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Success method return")
    })
    @GetMapping
    public String helloWorld() {
        return "Hello_World PR_EXAMPLE";
    }
}
