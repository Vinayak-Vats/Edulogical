package com.edulogical.backend.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.edulogical.backend.model.entities.Exam;
import com.edulogical.backend.service.ExamService;

@RestController
public class ExamController {
	
	@Autowired
	private ExamService examService;
	
	@GetMapping("/exams")
	public List<Exam> exam() {
		return examService.getExamDataList();
	}
}
