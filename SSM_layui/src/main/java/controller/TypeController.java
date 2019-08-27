package controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import model.Book;
import model.Type;
import service.Book_service;
import service.Type_service;
import utils.ReturnInfo;

@Controller
@RequestMapping("Type")
public class TypeController {
	@Autowired
	Type_service tservice;
	
	@ExceptionHandler
	public void ex(Exception e) {
		e.printStackTrace();
	}
	
	@RequestMapping("index")
	public @ResponseBody ReturnInfo index(String txt,Integer page,Integer limit,ModelMap m) {
		ReturnInfo info = new ReturnInfo();
		String where = "";
		if(txt!=null)
			where = " where book.name like '%"+txt+"%'";
		String lim = info.getLimit(page, limit);
		info.setList(tservice.select(where,lim));
		info.setCount(tservice.selectCount(where));
		return info;
	}

	@RequestMapping("delete")
	public @ResponseBody String delete(int id) {
		tservice.delete(id);
		return "{\"status\":1}";
	}
	
	@RequestMapping("update")
	public @ResponseBody String update(Type b) {
		tservice.update(b);
		return "{\"status\":1}";
	}

	@RequestMapping("insert")
	public @ResponseBody String insert(Type b) {
		tservice.insert(b);
		return "{\"status\":1}";
	}
	
	@RequestMapping("edit")
	public @ResponseBody Type edit(int id){
		return tservice.selectById(id);
	}
}

