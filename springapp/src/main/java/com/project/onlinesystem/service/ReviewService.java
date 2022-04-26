package com.project.onlinesystem.service;

import java.util.List;

import com.project.onlinesystem.model.Review;

public interface ReviewService {

	public Review savereview(Review review);

	public List<Review> getAll();

}