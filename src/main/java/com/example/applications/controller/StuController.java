package com.example.applications.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.applications.model.StudentData;
import com.example.applications.repositary.studRepo;

@RestController
public class StuController {
	@Autowired
	private studRepo stR;
	
	@GetMapping(path = "/home")
	public String home() {
		return "Home Works";
	}
	
	@PostMapping(path = "/insertData", consumes = {"application/json"})
	public String SaveData(@RequestBody StudentData std) {
		stR.save(std);
		return "Date Saved!..";
	}

}
