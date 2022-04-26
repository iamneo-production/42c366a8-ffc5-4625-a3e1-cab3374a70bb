package com.project.onlinesystem.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.onlinesystem.model.Review;
import com.project.onlinesystem.repository.ReviewRepository;

@Service
public class ReviewServiceImpl implements ReviewService{
	
	@Autowired
	private ReviewRepository repo;

	@Override
	public Review savereview(Review review) {
		return repo.save(review);
	}

	@Override
	public List<Review> getAll() {
		return repo.findAll();
	}
	

}