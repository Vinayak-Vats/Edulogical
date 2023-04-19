package com.edulogical.backend.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.edulogical.backend.model.entities.Exam;

@Service
public interface ExamService {
	public List <Exam> getExamDataList();
	public Exam getExamDataById(String id);
	public Exam postExamData(Exam exam);
	public Exam updateExamDataById(Exam exam);
	public boolean deleteExamData(String id);
}
