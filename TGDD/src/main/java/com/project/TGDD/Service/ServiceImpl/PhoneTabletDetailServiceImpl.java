package com.project.TGDD.Service.ServiceImpl;

import com.project.TGDD.Repository.PhoneTabletDetailRepository;
import com.project.TGDD.Service.PhoneTabletDetailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PhoneTabletDetailServiceImpl implements PhoneTabletDetailService {
@Autowired private PhoneTabletDetailRepository phoneTabletDetailRepository;
}
