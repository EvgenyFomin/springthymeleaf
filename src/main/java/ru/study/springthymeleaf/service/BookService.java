package ru.study.springthymeleaf.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.study.springthymeleaf.model.Book;
import ru.study.springthymeleaf.repository.BookRepository;

import java.util.List;

@Service
public class BookService {
    @Autowired
    BookRepository bookRepository;

    public List<Book> findAll() {
        return bookRepository.findAll();
    }

    public Book findById(Long id) {
        return bookRepository.findById(id).orElse(null);
    }

    public List<Book> findAllByNameLike(String name) {
        return bookRepository.findByNameContaining(name);
    }
}
