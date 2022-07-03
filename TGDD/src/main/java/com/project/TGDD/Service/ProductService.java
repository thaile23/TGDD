package com.project.TGDD.Service;

import com.project.TGDD.Model.Manufacturer;
import com.project.TGDD.Model.Product;
import com.project.TGDD.Model.Rom;

import java.util.List;

public interface ProductService {
    List<Product> getAllProduct();
    List<Manufacturer> getAllManufacturer();
    List<Rom> getAllRom();
    void AddRom(Rom rom);
    void AddManufacturer(Manufacturer manufacturer);
}
