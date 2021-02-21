package com.geekymon2.gallery.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @GetMapping("/list")
    public String getList() {
        return "A list of items";
    }

}
