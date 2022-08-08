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

    //void addLaptop(Product product, LaptopDetail laptopDetail, ColorProduct colPro, RomProduct romPro);

    void addSmartWatch(Product product, smartWatchDetail smartWatch, ColorProduct colPro);

    void addAccessory(Product product, ColorProduct colPro);

    List<Color> getColorByProductId(Integer productId);

    List<Rom> getRomByProductId(Integer productId);

    List<Product> getAllProductByCategoryId(Integer categoryId);

    Product findProductById(Integer productId);

    smartWatchDetail findSWByProductId(Integer productId);
}
