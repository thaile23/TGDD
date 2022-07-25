package com.project.TGDD.Service.ServiceImpl;

import com.project.TGDD.Model.PhoneTabletDetail;
import com.project.TGDD.Model.Product;
import com.project.TGDD.Repository.PhoneTabletDetailRepository;
import com.project.TGDD.Service.PhoneTabletDetailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.webjars.NotFoundException;

import java.util.Optional;

@Service
public class PhoneTabletDetailServiceImpl implements PhoneTabletDetailService {
    @Autowired
    private PhoneTabletDetailRepository phoneTabletRepo;
@Autowired private PhoneTabletDetailRepository phoneTabletDetailRepository;

@Override
public PhoneTabletDetail getbyID(int id) throws NotFoundException {
    Optional<PhoneTabletDetail> result = phoneTabletRepo.findById(id);
    if (result.isPresent()) {
        return result.get();
    } throw new NotFoundException("Not Found"+id);
}

}
