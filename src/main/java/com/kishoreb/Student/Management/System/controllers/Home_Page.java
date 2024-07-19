package com.kishoreb.Student.Management.System.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.kishoreb.Student.Management.System.entity.Model_class;
import com.kishoreb.Student.Management.System.entity.Student_database;
import com.kishoreb.Student.Management.System.service.Business_Logic;

import jakarta.validation.Valid;
import jakarta.websocket.server.PathParam;

@Controller
public class Home_Page {

	@Autowired
	Business_Logic lo;
	@GetMapping("/")
	public String homePage( Model mo)
	
	{
		mo.addAttribute("data",lo.getAllStudents());
		return "home_pg";
	}
	@GetMapping("/add")
	public String getStudents(@ModelAttribute("mods") Model_class cl)
	{
		return "add_user";
	}
	@PostMapping("/adds")
	public String getStudents1(@ModelAttribute("mods1") Model_class cl)
	{
		Student_database db=new Student_database();
		db.setName(cl.getName());
		db.setDept(cl.getDept());
		db.setMail_id(cl.getMail_id());
		db.setStatus(cl.getStatus());
		db.setPending(cl.getPending());
		db.setStd(cl.getStd());
		lo.saveData(db);
		
		return "redirect:/";
	}
	
	@GetMapping("/del/{id}")
	public String getStudents2(@PathVariable int id)
	{
		
		lo.deleteStudent(id);
		return "redirect:/";
	}
	
	@GetMapping("/edit/{id}")
	public String getStudents3(@PathVariable int id,Model mo)
	{
			
	Student_database db=lo.getStudentDatas(id);
	mo.addAttribute("mods", db);
		return "add_user2";
	}
	
	
	@PostMapping("/ed/{id}")
	public String getStudents4(@PathVariable int id, @ModelAttribute("mods1") Model_class cl )
	{
		System.out.println("CAMED");
			
		System.out.println("val:"+id);
		Student_database db=new Student_database();
		System.out.println(cl.getName());
		System.out.println(cl.getMail_id());
Student_database da=lo.getStudentDatas(id);
da.setName(cl.getName());
da.setDept(cl.getDept());
da.setMail_id(cl.getMail_id());
da.setStatus(cl.getStatus());
da.setPending(cl.getPending());
da.setStd(cl.getStd());
lo.saveData(da);
	//	lo.updateStudentDatas(db,id);
	return "redirect:/";
	}
	
	

}
