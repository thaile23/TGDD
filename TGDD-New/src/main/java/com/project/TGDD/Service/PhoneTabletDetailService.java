package com.project.TGDD.Service;

import com.project.TGDD.Model.PhoneTabletDetail;
import org.webjars.NotFoundException;

public interface PhoneTabletDetailService {
    public PhoneTabletDetail getbyID(int id)throws NotFoundException;
}
