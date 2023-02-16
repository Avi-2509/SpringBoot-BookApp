package com.api.book.bootrestbook.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BookController {
    @GetMapping(value = "/books")
    public String getBooks(){
        return "This is s get mapping books controller";
    }
}
