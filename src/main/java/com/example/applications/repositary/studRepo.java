package com.example.applications.repositary;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.applications.model.StudentData;

public interface studRepo extends JpaRepository<StudentData, String>{

}
