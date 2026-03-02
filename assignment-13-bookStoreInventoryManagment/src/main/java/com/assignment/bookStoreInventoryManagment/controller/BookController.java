package com.assignment.bookStoreInventoryManagment.controller;

import java.time.LocalDate;
import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.assignment.bookStoreInventoryManagment.model.Book;
import com.assignment.bookStoreInventoryManagment.service.BookService;

@RestController
@RequestMapping("/api/books")
public class BookController {

	private final BookService bookService;

	public BookController(BookService bookService) {
		this.bookService = bookService;
	}

	@GetMapping("/author")
	public ResponseEntity<List<Book>> getByAuthor(@RequestParam String author) {
		List<Book> books = bookService.getByAuthor(author);
		return books.isEmpty() ? ResponseEntity.notFound().build() : ResponseEntity.ok(books);
	}

	@GetMapping("/genre")
	public ResponseEntity<Page<Book>> getByGenre(
			@RequestParam String genre,
			@RequestParam(defaultValue = "0") int page,
			@RequestParam(defaultValue = "10") int size,
			@RequestParam(defaultValue = "title") String sortBy,
			@RequestParam(defaultValue = "asc") String sortDir) {
		Sort sort = sortDir.equalsIgnoreCase("desc") ? Sort.by(sortBy).descending() : Sort.by(sortBy).ascending();
		Page<Book> books = bookService.getByGenre(genre, PageRequest.of(page, size, sort));
		return ResponseEntity.ok(books);
	}

	@GetMapping("/cheaper")
	public ResponseEntity<List<Book>> getCheaper(@RequestParam Double maxPrice) {
		List<Book> books = bookService.getBooksCheaperThan(maxPrice);
		return ResponseEntity.ok(books);
	}

	@GetMapping("/expensive")
	public ResponseEntity<List<Book>> getExpensive(@RequestParam Double minPrice) {
		List<Book> books = bookService.getBooksExpensiveThan(minPrice);
		return ResponseEntity.ok(books);
	}

	@GetMapping("/new-arrivals")
	public ResponseEntity<List<Book>> getNewArrivals(
			@RequestParam @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) LocalDate publishedAfter) {
		List<Book> books = bookService.getBooksPublishedAfter(publishedAfter);
		return ResponseEntity.ok(books);
	}

	@GetMapping("/search")
	public ResponseEntity<List<Book>> searchByTitle(@RequestParam String keyword) {
		List<Book> books = bookService.searchByTitle(keyword);
		return ResponseEntity.ok(books);
	}

	@GetMapping("/genre-author")
	public ResponseEntity<List<Book>> getByGenreAndAuthor(
			@RequestParam String genre, @RequestParam String author) {
		List<Book> books = bookService.getByGenreAndAuthor(genre, author);
		return  ResponseEntity.ok(books);
	}

	@GetMapping("/genre-or-author")
	public ResponseEntity<List<Book>> getByGenreOrAuthor(
			@RequestParam String genre, @RequestParam String author) {
		List<Book> books = bookService.getByGenreOrAuthor(genre, author);
		return ResponseEntity.ok(books);
	}

	@GetMapping("/price-range")
	public ResponseEntity<List<Book>> getByPriceRange(
			@RequestParam Double minPrice, @RequestParam Double maxPrice) {
		List<Book> books = bookService.getByPriceRange(minPrice, maxPrice);
		return  ResponseEntity.ok(books);
	}

	@GetMapping("/genre-discount")
	public ResponseEntity<List<Book>> getByGenreDiscount(
			@RequestParam String genre, @RequestParam Double maxPrice) {
		List<Book> books = bookService.getByGenreDiscount(genre, maxPrice);
		return  ResponseEntity.ok(books);
	}

	@GetMapping("/latest")
	public ResponseEntity<Page<Book>> getLatest(
			@RequestParam(defaultValue = "0") int page,
			@RequestParam(defaultValue = "10") int size,
			@RequestParam(defaultValue = "publishedDate") String sortBy,
			@RequestParam(defaultValue = "desc") String sortDir) {
		Sort sort = sortDir.equalsIgnoreCase("asc") ? Sort.by(sortBy).ascending() : Sort.by(sortBy).descending();
		Page<Book> books = bookService.getLatestBooks(PageRequest.of(page, size, sort));
		return ResponseEntity.ok(books);
	}

	@GetMapping("/by-price")
	public ResponseEntity<Page<Book>> getByPrice(
			@RequestParam(defaultValue = "0") int page,
			@RequestParam(defaultValue = "10") int size,
			@RequestParam(defaultValue = "price") String sortBy,
			@RequestParam(defaultValue = "asc") String sortDir) {
		Sort sort = sortDir.equalsIgnoreCase("desc") ? Sort.by(sortBy).descending() : Sort.by(sortBy).ascending();
		Page<Book> books = bookService.getBooksByPrice(PageRequest.of(page, size, sort));
		return ResponseEntity.ok(books);
	}
}
