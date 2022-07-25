package com.project.TGDD.Service.ServiceImpl;

import com.project.TGDD.Repository.LaptopDetailRepository;
import com.project.TGDD.Service.LaptopDetailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LaptopDetailServiceImpl implements LaptopDetailService {
    @Autowired private LaptopDetailRepository laptopDetailRepository;
}
