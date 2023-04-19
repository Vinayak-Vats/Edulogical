package com.edulogical.backend.model.entities;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter @Setter @NoArgsConstructor
public class Resources {
	String bookName;
	String authorName;
	String bookType;
	String description;
	String bookImage;
	String bookEdition;
	String subject;
	String resourceUrl;
	
	public Resources(String bookName, String authorName, String bookType, String description, String bookImage,
			String bookEdition, String subject, String resourceUrl) {
		super();
		this.bookName = bookName;
		this.authorName = authorName;
		this.bookType = bookType;
		this.description = description;
		this.bookImage = bookImage;
		this.bookEdition = bookEdition;
		this.subject = subject;
		this.resourceUrl = resourceUrl;
	}
	
	
}
