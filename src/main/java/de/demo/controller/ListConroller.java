package de.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.lang.annotation.ElementType;
import java.util.ArrayList;
import java.util.List;

@Controller
public class ListConroller {

    @GetMapping
    public String getList(Model model) {
        List<ListElement> list = new ArrayList<ListElement>();

        // Fügt 10 Elemente in die liste ein
        for (int i = 0; i < 10; i++) {
            list.add(new ListElement(Integer.toString(i), i*2));
        }

        model.addAttribute("list", list);
        return "list";
    }
}
