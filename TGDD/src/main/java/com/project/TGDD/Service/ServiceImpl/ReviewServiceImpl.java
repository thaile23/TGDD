package com.project.TGDD.Service.ServiceImpl;

import com.project.TGDD.Repository.ReviewRepository;
import com.project.TGDD.Service.ReviewService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ReviewServiceImpl implements ReviewService {
    @Autowired private ReviewRepository reviewRepository;
}
