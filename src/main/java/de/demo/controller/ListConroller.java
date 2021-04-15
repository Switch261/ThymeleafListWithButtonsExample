package de.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ListConroller {

    @GetMapping
    public String getList(Model model) {

        return "list";
    }
}
