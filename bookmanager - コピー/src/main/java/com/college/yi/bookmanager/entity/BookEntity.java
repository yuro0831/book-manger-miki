package com.college.yi.bookmanager.entity;

import java.time.LocalDate;

import lombok.Data;

@Data
public class BookEntity {
	private int id;
	private String title;
	private String author;
	private String publisher;
	private LocalDate publishDate;
	private int stock;

}
