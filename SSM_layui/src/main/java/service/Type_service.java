package service;

import java.util.List;

import model.Type;

public interface Type_service {
	
	public int selectCount(String txt);
	
	public List<Type> select(String txt,String limit);
	
	public void insert(Type b);
	
	public void update(Type b);
	
	public void delete(int id);

	public Type selectById(int id);

	public List<Type> selectAll();
}
