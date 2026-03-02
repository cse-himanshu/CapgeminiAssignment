package com.assignment.bookStoreInventoryManagment.service;

import java.time.LocalDate;
import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.assignment.bookStoreInventoryManagment.model.Book;
import com.assignment.bookStoreInventoryManagment.repository.BookRepository;

@Service
public class BookService {

	private final BookRepository bookRepository;

	public BookService(BookRepository bookRepository) {
		this.bookRepository = bookRepository;
	}

	public List<Book> getByAuthor(String author) {
		return bookRepository.findByAuthor(author);
	}

	public Page<Book> getByGenre(String genre, Pageable pageable) {
		return bookRepository.findByGenre(genre, pageable);
	}

	public List<Book> getBooksCheaperThan(Double maxPrice) {
		return bookRepository.findByPriceLessThan(maxPrice);
	}

	public List<Book> getBooksExpensiveThan(Double minPrice) {
		return bookRepository.findByPriceGreaterThan(minPrice);
	}

	public List<Book> getBooksPublishedAfter(LocalDate date) {
		return bookRepository.findByPublishedDateAfter(date);
	}

	public List<Book> searchByTitle(String keyword) {
		return bookRepository.findByTitleContaining(keyword);
	}

	public List<Book> getByGenreAndAuthor(String genre, String author) {
		return bookRepository.findByGenreAndAuthor(genre, author);
	}

	public List<Book> getByGenreOrAuthor(String genre, String author) {
		return bookRepository.findByGenreOrAuthor(genre, author);
	}

	public List<Book> getByPriceRange(Double minPrice, Double maxPrice) {
		return bookRepository.findByPriceBetween(minPrice, maxPrice);
	}

	public List<Book> getByGenreDiscount(String genre, Double maxPrice) {
		return bookRepository.findByGenreAndPriceLessThan(genre, maxPrice);
	}

	public Page<Book> getLatestBooks(Pageable pageable) {
		return bookRepository.findAll(pageable);
	}

	public Page<Book> getBooksByPrice(Pageable pageable) {
		return bookRepository.findAll(pageable);
	}
}
