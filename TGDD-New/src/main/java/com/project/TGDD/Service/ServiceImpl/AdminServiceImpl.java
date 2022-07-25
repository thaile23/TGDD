package com.project.TGDD.Service.ServiceImpl;

import com.project.TGDD.Repository.AdminRepository;
import com.project.TGDD.Service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AdminServiceImpl implements AdminService {
    @Autowired private AdminRepository adminRepository;
}
