package com.project.TGDD.Service.ServiceImpl;

import com.project.TGDD.Repository.ProductRepository;
import com.project.TGDD.Service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductServiceImpl implements ProductService {
    @Autowired private ProductRepository productRepository;
}
