package com.project.onlinesystem.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import org.springframework.web.bind.annotation.RestController;

import com.project.onlinesystem.model.Review;
import com.project.onlinesystem.service.ReviewService;

@RestController
@CrossOrigin

public class ReviewController {
	
	@Autowired
	private ReviewService service;
	
	@PostMapping("/review")
	public Review savemeth(@RequestBody Review review) {
		return service.savereview(review);
	}
	
	@GetMapping("/get")
	public List<Review> getallreview() {
		return service.getAll();
	}

}