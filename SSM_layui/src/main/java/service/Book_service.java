package service;

import java.util.List;

import model.Book;

public interface Book_service {
	
	public int selectCount(String txt);
	
	public List<Book> select(String txt,String limit);
	
	public void insert(Book b);
	
	public void update(Book b);
	
	public void delete(int id);

	public Book selectById(int id);
}
