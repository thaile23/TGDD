package com.project.TGDD.Service.ServiceImpl;

import com.project.TGDD.Controller.ProductNotFoundException;
import com.project.TGDD.Model.*;
import com.project.TGDD.Repository.*;
import com.project.TGDD.Service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import javax.persistence.criteria.CriteriaBuilder;
import java.util.List;
import java.util.Optional;

@Service
public class ProductServiceImpl implements ProductService {
    @Autowired
    private ProductRepoSortPage ProductRepoSort;

    @Autowired
    private ProductRepository productRepository;
    @Autowired
    private ManufacturerRepository manufacturerRepository;
    @Autowired
    private RomRepository romRepository;
    @Autowired
    private PhoneTabletDetailRepository phoneTabletRepo;
    @Autowired
    private LaptopDetailRepository laptopRepo;
    @Autowired
    private SmartWatchDetailRepository smartWatchRepo;
    @Autowired
    private ColorProductRepository colProRepo;
    @Autowired
    private RomProductRepository romProRepo;
    @Autowired
    private TabletRepository tabletRepository;
    @Autowired
    private AccessoryRepository accessoryRepository;
    @Autowired
    private TabletFilterHSXRepository tabletFilterHSXRepository;
    @Autowired
    private PhoneRepository phoneRepository;
    @Autowired
    PhoneFilterHSXRepository phoneFilterHSXRepository;

    public Page<Product> listAll(int pageNum, String sortField, String sortDir, String keyword) {

        Pageable pageable = PageRequest.of(pageNum - 1, 3,
                sortDir.equals("asc") ? Sort.by(sortField).ascending()
                        : Sort.by(sortField).descending()
        );
        if (keyword != null) {
            return ProductRepoSort.findAll(keyword, pageable);
        }
        return ProductRepoSort.findAll(pageable);
    }


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
    public void addLaptop(Product product, LaptopDetail laptopDetail, ColorProduct colPro, RomProduct romPro) {
        productRepository.save(product);
        laptopDetail.setProductId(product.getProductId());
        colPro.setProductId(product.getProductId());
        romPro.setProductId(product.getProductId());
        laptopRepo.save(laptopDetail);
        colProRepo.save(colPro);
        romProRepo.save(romPro);
    }

    @Override
    public void addSmartWatch(Product product, smartWatchDetail smartWatch, ColorProduct colPro) {
        productRepository.save(product);
        smartWatch.setProductId(product.getProductId());
        colPro.setProductId(product.getProductId());
        smartWatchRepo.save(smartWatch);
        colProRepo.save(colPro);
    }

    @Override
    public void addAccessory(Product product, ColorProduct colPro) {
        productRepository.save(product);
        colPro.setProductId(product.getProductId());
        colProRepo.save(colPro);
    }

    //show tablet
    public List<Product> listAll(String keyword) {
        if (keyword != null) {
            return tabletRepository.search(keyword);
        }
        return tabletRepository.findAll();
    }

    public Product get(int id) throws ProductNotFoundException {
        Optional<Product> result = tabletRepository.findById(id);
        if (result.isPresent()) {
            return result.get();
        }
        throw new ProductNotFoundException("Not Found" + id);
    }

    //show hsx tablet
    public List<Product> listAll1(Integer categoryId, Integer manufacturerId) {
        return (List<Product>) tabletFilterHSXRepository.findByCateAndManu(categoryId, manufacturerId);
    }

    //show phu kien
    public List<Product> listAll2(String keyword) {
        if (keyword != null) {
            return accessoryRepository.search(keyword);
        }
        return accessoryRepository.findAll();
    }

    //show dien thoai
    public List<Product> listAll3(String keyword) {
        if (keyword != null) {
            return phoneRepository.search(keyword);
        }
        return phoneRepository.findAll();
    }

    //show hsx dien thoai
    public List<Product> listAll3(Integer categoryId, Integer manufacturerId) {
        return (List<Product>) phoneFilterHSXRepository.findByCateAndManu(categoryId, manufacturerId);
    }

    @Override
    public List<Color> getColorByProductId(Integer productId) {
        List<Color> listColorByProId = productRepository.FindColorbyProductId(productId);
        return listColorByProId;
    }

    @Override
    public List<Rom> getRomByProductId(Integer productId) {
        List<Rom> listRomByProId = null;
        return listRomByProId;
    }

    @Override
    public List<Product> getAllProductByCategoryId(Integer categoryId) {
        return productRepository.FindProductByCategory(categoryId);
    }

    @Override
    public Product findProductById(Integer productId) {
        Product product = productRepository.findById(productId).get();
        return product;
    }

    @Override
    public smartWatchDetail findSWByProductId(Integer productId) {
        smartWatchDetail smartWatchDetail = productRepository.FindSmartWatchByProId(productId);
        return smartWatchDetail;
    }

}
