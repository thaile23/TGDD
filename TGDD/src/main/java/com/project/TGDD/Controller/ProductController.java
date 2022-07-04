package com.project.TGDD.Controller;

import com.project.TGDD.Model.*;
import com.project.TGDD.Service.ColorService;
import com.project.TGDD.Service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.servlet.http.HttpServletRequest;
import java.util.Date;
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
        model.addAttribute("addProduct", new Product());
        model.addAttribute("addPhone", new PhoneTabletDetail());
        return "AddProduct";
    }

    @GetMapping("/Product/AddManu")
    public String AddManufacturer(Manufacturer manu, RedirectAttributes re) {
        List<Manufacturer> listManufacturer = productService.getAllManufacturer();
        String nameManu = manu.getManufacturerName().toLowerCase().trim();
        boolean check = false;
        for (int i = 0; i < listManufacturer.size(); i++) {
            if (listManufacturer.get(i).getManufacturerName().toLowerCase().equals(nameManu)) {
                check = true;
            }
        }
        if (check == false) {
            productService.AddManufacturer(manu);
        } else {
            re.addFlashAttribute("ErrorNull", "Manufacturer name was existed");
        }
        return "redirect:/Product/Add";
    }

    @GetMapping("/Product/AddRom")
    public String AddRom(Rom rom, RedirectAttributes re) {
        List<Rom> listRom = productService.getAllRom();
        String nameRom = rom.getRomName().toUpperCase().trim();
        boolean check = false;
        for (int i = 0; i < listRom.size(); i++) {
            if (listRom.get(i).getRomName().toUpperCase().equals(nameRom)) {
                check = true;
            }
        }
        if (check == false) {
            productService.AddRom(rom);
        } else {
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
                check = true;
            }
        }
        if (check == false) {
            colorservice.addColor(color);
        } else {
            re.addFlashAttribute("ErrorNull", "Color was existed");
        }
        return "redirect:/Product/Add";
    }

    @PostMapping("/Product/AddNew")
    public String AddNewPhone(Product pro, HttpServletRequest request, @RequestParam("ImageUpload") String picPro) {
        Date currentDate = new Date();
        String screen = request.getParameter("PhoneScreen");
        String screenTechnology = request.getParameter("PhoneScreenTechnology");
        String resolution = request.getParameter("PhoneResolution");
        String wideScreen = request.getParameter("PhoneWideScreen");
        String brightness = request.getParameter("PhoneBrightness");
        String Pin = request.getParameter("");
        String frontCamera = request.getParameter("PhoneFrontCamera");
        String rearCamera = request.getParameter("PhoneRearCamera");
        String chip = request.getParameter("PhoneChip");
        String chipSpeed = request.getParameter("PhoneChipSpeed");
        String chipGraphic = request.getParameter("PhoneChipGraphic");
        String ram = request.getParameter("PhoneRam");
        String material = request.getParameter("PhoneMaterial");
        String release = request.getParameter("PhoneRelease");
        String sim = request.getParameter("PhoneSim");
        String sizeWeight = request.getParameter("PhoneSizeWeight");


        return "redirect:/Product/Add";
    }
}
