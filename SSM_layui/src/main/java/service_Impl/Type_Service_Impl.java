package service_Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dao.Type_Dao;
import model.Type;
import service.Type_service;
@Service
public class Type_Service_Impl implements Type_service {
    @Autowired
    Type_Dao dao;
	
	public Type selectById(int id) {
		return dao.selectById(id);
	}

	public void insert(Type b) {
		dao.insert(b);
	}

	public void update(Type b) {
		dao.update(b);
	}

	public void delete(int id) {
		dao.delete(id);
	}
	public List<Type> select(String txt,String limit) {
		return dao.select(txt,limit);
	}
	
	public int selectCount(String txt) {
		return dao.selectCount(txt);
	}

	public List<Type> selectAll() {
		return dao.selectAll();
	}

}
