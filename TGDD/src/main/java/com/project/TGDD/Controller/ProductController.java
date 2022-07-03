package com.project.TGDD.Controller;

import com.project.TGDD.Model.Color;
import com.project.TGDD.Model.Manufacturer;
import com.project.TGDD.Model.Rom;
import com.project.TGDD.Service.ColorService;
import com.project.TGDD.Service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.List;

@Controller
public class ProductController {
    @Autowired
    ColorService colorservice;
    @Autowired
    ProductService productService;

    @GetMapping("/Product/Add")
    public String FormAddProduct(Model model) {
        List<Color> listColor = colorservice.getAllColor();
        model.addAttribute("listColor", listColor);
        List<Manufacturer> listManufacturer = productService.getAllManufacturer();
        model.addAttribute("listManufacturer", listManufacturer);
        List<Rom> listRom = productService.getAllRom();
        model.addAttribute("listRom", listRom);
        model.addAttribute("Manufacturer", new Manufacturer());
        return "AddProduct";
    }

    @GetMapping("/Product/AddManu")
    public String AddManufacturer(Manufacturer manu, RedirectAttributes re) {
        List<Manufacturer> listManufacturer = productService.getAllManufacturer();
        if(manu.getManufacturerName().isEmpty()){
            re.addFlashAttribute("ErrorNull", "Manufacturer name is null");
        }
        for (int i = 0; i < listManufacturer.size(); i++) {
            if(listManufacturer.get(i).getManufacturerName().equals(manu.getManufacturerName())){
                re.addFlashAttribute("ErrorNull", "Manufacturer name was existed");
            }
            else{
                productService.AddManufacturer(manu);
            }
        }
        return "redirect:/Product/Add";
    }
}
