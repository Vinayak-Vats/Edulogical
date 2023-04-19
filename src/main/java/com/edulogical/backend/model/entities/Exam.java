package com.edulogical.backend.model.entities;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter @Setter @NoArgsConstructor
public class Exam {
	String id;
	String examName;
	String date;
	String detail;
	String documentRequired;
	String eligibilityCriteria;
	String registrationFormLink;
	String imageUrl;
	
	public Exam(String id, String examName, String date, String detail, String documentRequired,
			String eligibilityCriteria, String registrationFormLink, String imageUrl) {
		super();
		this.id = id;
		this.examName = examName;
		this.date = date;
		this.detail = detail;
		this.documentRequired = documentRequired;
		this.eligibilityCriteria = eligibilityCriteria;
		this.registrationFormLink = registrationFormLink;
		this.imageUrl = imageUrl;
	}


}
