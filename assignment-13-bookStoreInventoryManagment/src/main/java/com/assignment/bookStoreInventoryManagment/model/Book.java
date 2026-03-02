package com.assignment.bookStoreInventoryManagment.model;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;

@Entity
public class Book {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@NotBlank
	private String title;

	@NotBlank
	private String author;

	@NotBlank
	private String genre;

	@NotNull
	@Positive
	private Double price;

	@NotNull
	private LocalDate publishedDate;

	public Book() {
	}

	public Book(Long id, String title, String author, String genre, Double price, LocalDate publishedDate) {
		this.id = id;
		this.title = title;
		this.author = author;
		this.genre = genre;
		this.price = price;
		this.publishedDate = publishedDate;
	}

	public Long getId() { return id; }
	public void setId(Long id) { this.id = id; }

	public String getTitle() { return title; }
	public void setTitle(String title) { this.title = title; }

	public String getAuthor() { return author; }
	public void setAuthor(String author) { this.author = author; }

	public String getGenre() { return genre; }
	public void setGenre(String genre) { this.genre = genre; }

	public Double getPrice() { return price; }
	public void setPrice(Double price) { this.price = price; }

	public LocalDate getPublishedDate() { return publishedDate; }
	public void setPublishedDate(LocalDate publishedDate) { this.publishedDate = publishedDate; }
}
