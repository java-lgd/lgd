package service_Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dao.Book_Dao;
import model.Book;
import service.Book_service;
@Service
public class Book_Service_Impl implements Book_service {
    @Autowired
    Book_Dao dao;
	
	public Book selectById(int id) {
		return dao.selectById(id);
	}

	public void insert(Book b) {
		dao.insert(b);
	}

	public void update(Book b) {
		dao.update(b);
	}

	public void delete(int id) {
		dao.delete(id);
	}
	public List<Book> select(String txt,String limit) {
		return dao.select(txt,limit);
	}
	
	public int selectCount(String txt) {
		return dao.selectCount(txt);
	}

}
