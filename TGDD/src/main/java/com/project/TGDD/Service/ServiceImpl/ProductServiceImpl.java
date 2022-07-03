package com.project.TGDD.Service.ServiceImpl;

import com.project.TGDD.Model.Manufacturer;
import com.project.TGDD.Model.Product;
import com.project.TGDD.Model.Rom;
import com.project.TGDD.Repository.ManufacturerRepository;
import com.project.TGDD.Repository.ProductRepository;
import com.project.TGDD.Repository.RomRepository;
import com.project.TGDD.Service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {
    @Autowired
    private ProductRepository productRepository;
    @Autowired
    private ManufacturerRepository manufacturerRepository;
    @Autowired
    private RomRepository romRepository;

    @Override
    public List<Product> getAllProduct() {
        List<Product> listProduct = (List<Product>) productRepository.findAll();
        return listProduct;
    }

    @Override
    public List<Manufacturer> getAllManufacturer() {
        List<Manufacturer> listManufacturer = (List<Manufacturer>) manufacturerRepository.findAll();
        return listManufacturer;
    }

    @Override
    public List<Rom> getAllRom() {
        List<Rom> listRom = (List<Rom>) romRepository.findAll();
        return listRom;
    }

    @Override
    public void AddRom(Rom rom) {
        romRepository.save(rom);
    }

    @Override
    public void AddManufacturer(Manufacturer manufacturer) {
        manufacturerRepository.save(manufacturer);
    }
}
