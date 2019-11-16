package ru.study.springthymeleaf.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import ru.study.springthymeleaf.model.Book;
import ru.study.springthymeleaf.service.BookService;

import java.util.List;

@Controller
public class MainController {
    @Autowired
    BookService bookService;

    @GetMapping
    public String homePage(Model model) {
        model.addAttribute("books", bookService.findAll());
        return "index";
    }

    @PostMapping("/ajquery")
    public ModelAndView ajquery(@RequestParam String name) {
        List<Book> books = bookService.findAllByNameLike(name);
        ModelAndView modelAndView = new ModelAndView("shortcuts/table-with-filter :: table");
        modelAndView.addObject("books", books);

        return modelAndView;
    }
}
