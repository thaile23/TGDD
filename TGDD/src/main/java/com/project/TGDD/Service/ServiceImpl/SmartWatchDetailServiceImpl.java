package com.project.TGDD.Service.ServiceImpl;

import com.project.TGDD.Repository.SmartWatchDetailRepository;
import com.project.TGDD.Service.SmartWatchDetailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SmartWatchDetailServiceImpl implements SmartWatchDetailService {
    @Autowired private SmartWatchDetailRepository smartWatchDetailRepository;
}
