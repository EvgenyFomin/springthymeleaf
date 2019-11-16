package ru.study.springthymeleaf.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.study.springthymeleaf.model.Book;

import java.util.List;

public interface BookRepository extends JpaRepository<Book, Long> {
    List<Book> findByNameContaining(String name);
}
