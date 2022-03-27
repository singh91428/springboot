package com.sb.web.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sb.web.bean.Book;

@Repository
public interface BookRepository extends JpaRepository<Book,Integer>{

}
