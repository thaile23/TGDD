package com.project.TGDD.Service.ServiceImpl;

import com.project.TGDD.Model.*;
import com.project.TGDD.Repository.*;
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
    @Autowired
    PhoneTabletDetailRepository phoneTabletRepo;
    @Autowired
    ColorProductRepository colProRepo;
    @Autowired
    RomProductRepository romProRepo;

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

    @Override
    public void addPhoneTablet(Product pro, PhoneTabletDetail phonetablet, ColorProduct colPro, RomProduct romPro) {
        productRepository.save(pro);
        phonetablet.setProductId(pro.getProductId());
        colPro.setProductId(pro.getProductId());
        romPro.setProductId(pro.getProductId());
        phoneTabletRepo.save(phonetablet);
        colProRepo.save(colPro);
        romProRepo.save(romPro);
    }

    @Override
    public void addPhoneDetail(PhoneTabletDetail phone) {
        phoneTabletRepo.save(phone);

    }


}
