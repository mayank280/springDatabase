package com.example.applications;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {
	
	@Autowired
	private StudentRepo stRepo;
	
	@RequestMapping(path = "/")
	public String home() {
		return "Hello World";
	}
	@RequestMapping(path = "/savedata")
	public String saveData(@RequestParam String id, @RequestParam String name) {
		StudentModel st = new StudentModel();
		st.setId(id);
		st.setName(name);
		stRepo.save(st);
		return "Data Saved..";
	}

}
