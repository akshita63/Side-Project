package com.Example.Repos;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Example.Entity.Books;

public interface BookRepo extends JpaRepository<Books, Long> {
    List<Books> findByGenre(String genre);
}

