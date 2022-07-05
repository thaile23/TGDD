package com.project.TGDD.Service;

import com.project.TGDD.Model.*;

import java.util.List;

public interface ProductService {
    List<Product> getAllProduct();

    List<Manufacturer> getAllManufacturer();

    List<Rom> getAllRom();

    void AddRom(Rom rom);

    void AddManufacturer(Manufacturer manufacturer);

    void addPhoneTablet(Product product, PhoneTabletDetail Phone, ColorProduct colPro, RomProduct romPro);

    void addPhoneDetail(PhoneTabletDetail phone);
}
