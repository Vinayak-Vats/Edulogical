package com.edulogical.backend.serviceimpl;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

import com.edulogical.backend.model.entities.Exam;
import com.edulogical.backend.service.ExamService;

@Service
public class ExamServiceImpl implements ExamService{
	
	List<Exam> examList = new ArrayList(Arrays.asList("okay"));
	
	@Override
	public List<Exam> getExamDataList() {
		return examList;
	}

	@Override
	public Exam getExamDataById(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Exam postExamData(Exam exam) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Exam updateExamDataById(Exam exam) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean deleteExamData(String id) {
		// TODO Auto-generated method stub
		return false;
	}

}
