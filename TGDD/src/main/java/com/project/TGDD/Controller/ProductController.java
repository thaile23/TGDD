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
        model.addAttribute("addManufacturer", new Manufacturer());
        model.addAttribute("addRom", new Rom());
        model.addAttribute("addColor", new Color());

        return "AddProduct";
    }

    @GetMapping("/Product/AddManu")
    public String AddManufacturer(Manufacturer manu, RedirectAttributes re) {
        List<Manufacturer> listManufacturer = productService.getAllManufacturer();
        String nameManu = manu.getManufacturerName().toLowerCase().trim();
        boolean check = false;
        for (int i = 0; i < listManufacturer.size(); i++) {
            if (listManufacturer.get(i).getManufacturerName().toLowerCase().equals(nameManu)) {
                check=true;
            }
        }
        if(check==false){
            productService.AddManufacturer(manu);
        }else{
            re.addFlashAttribute("ErrorNull", "Manufacturer name was existed");
        }
        return "redirect:/Product/Add";
    }

    @GetMapping("/Product/AddRom")
    public String AddRom(Rom rom, RedirectAttributes re) {
        List<Rom> listRom = productService.getAllRom();
        String nameRom = rom.getRomDetail().toUpperCase().trim();
        boolean check = false;
        for (int i = 0; i < listRom.size(); i++) {
            if (listRom.get(i).getRomDetail().toUpperCase().equals(nameRom)) {
                check=true;
            }
        }
        if(check==false){
            productService.AddRom(rom);
        }else{
            re.addFlashAttribute("ErrorNull", "Rom was existed");
        }
        return "redirect:/Product/Add";
    }

    @GetMapping("/Product/AddColor")
    public String AddColor(Color color, RedirectAttributes re) {
        List<Color> listColor = colorservice.getAllColor();
        String nameColor = color.getColorName().toUpperCase().trim();
        boolean check = false;
        for (int i = 0; i < listColor.size(); i++) {
            if (listColor.get(i).getColorName().toUpperCase().equals(nameColor)) {
                check=true;
            }
        }
        if(check==false){
            colorservice.addColor(color);
        }else{
            re.addFlashAttribute("ErrorNull", "Color was existed");
        }
        return "redirect:/Product/Add";
    }
}
