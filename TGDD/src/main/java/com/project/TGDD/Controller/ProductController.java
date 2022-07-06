package com.project.TGDD.Controller;

import com.project.TGDD.Model.*;
import com.project.TGDD.Service.ColorService;
import com.project.TGDD.Service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
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
        model.addAttribute("addLaptop", new LaptopDetail());
        model.addAttribute("addSmartWatch", new smartWatchDetail());
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

    @PostMapping("/Product/AddNewPhone")
    public String AddNewPhone(Product pro, HttpServletRequest request) {
        //Add phone detail
        String screen = request.getParameter("PhoneScreen");
        String resolution = request.getParameter("PhoneResolution");
        String brightness = request.getParameter("PhoneBrightness");
        String frontCamera = request.getParameter("PhoneFrontCamera");
        String rearCamera = request.getParameter("PhoneRearCamera");
        String chip = request.getParameter("PhoneChip");
        String ram = request.getParameter("PhoneRam");
        String sim = request.getParameter("PhoneSim");
        String pin = request.getParameter("PhonePin");
        String design = request.getParameter("PhoneDesign");
        String release = request.getParameter("PhoneRelease");
        String sizeWeight = request.getParameter("PhoneSizeWeight");
        PhoneTabletDetail phone = new PhoneTabletDetail();
        phone.setBrightness(brightness);
        phone.setChip(chip);
        phone.setRam(ram);
        phone.setDesign(design);
        phone.setScreen(screen);
        phone.setResolution(resolution);
        phone.setFrontCamera(frontCamera);
        phone.setRearCamera(rearCamera);
        phone.setPin(pin);
        phone.setRelease(release);
        phone.setSim(sim);
        phone.setSizeWeight(sizeWeight);
        //add color product
        ColorProduct colPro = new ColorProduct();
        int corlorId = Integer.parseInt(request.getParameter("PhoneColor"));
        colPro.setColorId(corlorId);
        //add rom product
        RomProduct romPro = new RomProduct();
        int romId = Integer.parseInt(request.getParameter("PhoneRom"));
        romPro.setRomId(romId);
        pro.setCategoryId(1);
        pro.setStar((float) 0);
        productService.addPhoneTablet(pro, phone, colPro, romPro);
        return "redirect:/Product/Add";
    }

    @PostMapping("/Product/AddNewLaptop")
    public String AddNewLaptop(Product pro, HttpServletRequest request) {
        //Add phone detail
        String core = request.getParameter("LaptopCore");
        String thread = request.getParameter("LaptopThread");
        String cpu = request.getParameter("LaptopCPU");
        String cpuSpeed = request.getParameter("LaptopCPUSpeed");
        String ram = request.getParameter("LaptopRam");
        String ramUpdate = request.getParameter("LaptopRamUpdate");
        String screen = request.getParameter("LaptopScreen");
        String graphicCard = request.getParameter("LaptopGraphicCard");
        String connector = request.getParameter("LaptopConnector");
        String especially = request.getParameter("LaptopEspecially");
        String design = request.getParameter("LaptopDesign");
        String pin = request.getParameter("LaptopPin");
        String sizeWeight = request.getParameter("LaptopSizeWeight");
        String release = request.getParameter("LaptopRelease");

        LaptopDetail laptop = new LaptopDetail();
        laptop.setCore(core);
        laptop.setThread(thread);
        laptop.setCpu(cpu);
        laptop.setCpuSpeed(cpuSpeed);
        laptop.setRam(ram);
        laptop.setRamUpdate(ramUpdate);
        laptop.setScreen(screen);
        laptop.setGraphicCard(graphicCard);
        laptop.setConnector(connector);
        laptop.setEspecially(especially);
        laptop.setDesign(design);
        laptop.setPin(pin);
        laptop.setSizeWeight(sizeWeight);
        laptop.setRelease(release);
        //add color product
        ColorProduct colPro = new ColorProduct();
        int corlorId = Integer.parseInt(request.getParameter("LaptopColor"));
        colPro.setColorId(corlorId);

        //add rom product
        RomProduct romPro = new RomProduct();
        int romId = Integer.parseInt(request.getParameter("LaptopRom"));
        romPro.setRomId(romId);
        pro.setCategoryId(2);
        pro.setStar((float) 0);
        productService.addLaptop(pro, laptop, colPro, romPro);
        return "redirect:/Product/Add";
    }

    @PostMapping("/Product/AddNewTablet")
    public String AddNewTablet(Product pro, HttpServletRequest request) {
        //Add phone detail
        String screen = request.getParameter("TabletScreen");
        String resolution = request.getParameter("TabletResolution");
        String brightness = request.getParameter("TabletBrightness");
        String frontCamera = request.getParameter("TabletFrontCamera");
        String rearCamera = request.getParameter("TabletRearCamera");
        String chip = request.getParameter("TabletChip");
        String ram = request.getParameter("TabletRam");
        String sim = request.getParameter("TabletSim");
        String pin = request.getParameter("TabletPin");
        String design = request.getParameter("TabletDesign");
        String release = request.getParameter("TabletRelease");
        String sizeWeight = request.getParameter("TabletSizeWeight");
        PhoneTabletDetail tablet = new PhoneTabletDetail();
        tablet.setBrightness(brightness);
        tablet.setChip(chip);
        tablet.setRam(ram);
        tablet.setDesign(design);
        tablet.setScreen(screen);
        tablet.setResolution(resolution);
        tablet.setFrontCamera(frontCamera);
        tablet.setRearCamera(rearCamera);
        tablet.setPin(pin);
        tablet.setRelease(release);
        tablet.setSim(sim);
        tablet.setSizeWeight(sizeWeight);
        //add color product
        ColorProduct colPro = new ColorProduct();
        int corlorId = Integer.parseInt(request.getParameter("TabletColor"));
        colPro.setColorId(corlorId);
        //add rom product
        RomProduct romPro = new RomProduct();
        int romId = Integer.parseInt(request.getParameter("TabletRom"));
        romPro.setRomId(romId);
        pro.setCategoryId(3);
        pro.setStar(Float.valueOf(0));
        productService.addPhoneTablet(pro, tablet, colPro, romPro);
        return "redirect:/Product/Add";
    }

    @PostMapping("/Product/AddNewSmartWatch")
    public String AddNewSmartWatch(Product pro, HttpServletRequest request) {
        //Add phone detail
        String screen = request.getParameter("SmartWatchScreen");
        String resolution = request.getParameter("SmartWatchResolution");
        String material_frame = request.getParameter("SmartWatchChipMaterialFrame");
        String material_strap = request.getParameter("SmartWatchChipMaterialStrap");
        String material_surface = request.getParameter("SmartWatchMaterialSurface");
        String size = request.getParameter("SmartWatchSize");
        String pin_time = request.getParameter("SmartWatchPinTime");
        String charge = request.getParameter("SmartWatchCharge");
        String pin = request.getParameter("SmartWatchPin");
        String release = request.getParameter("SmartWatchRelease");
        smartWatchDetail smartWatch = new smartWatchDetail();
        smartWatch.setScreen(screen);
        smartWatch.setResolution(resolution);
        smartWatch.setMaterial_frame(material_frame);
        smartWatch.setMaterial_strap(material_strap);
        smartWatch.setMaterial_surface(material_surface);
        smartWatch.setSize(size);
        smartWatch.setPin_time(pin_time);
        smartWatch.setCharge(charge);
        smartWatch.setPin(pin);
        smartWatch.setRelease(release);
        //add color product
        ColorProduct colPro1 = new ColorProduct();
        int corlorId = Integer.parseInt(request.getParameter("SmartWatchColor"));
        colPro1.setColorId(corlorId);
        //add rom product

        pro.setCategoryId(4);
        pro.setStar((float) 0);
        productService.addSmartWatch(pro, smartWatch, colPro1);
        return "redirect:/Product/Add";
    }

    @PostMapping("/Product/AddNewAccessory")
    public String AddNewAccessory(Product pro, HttpServletRequest request) {
        ColorProduct colPro1 = new ColorProduct();
        int corlorId = Integer.parseInt(request.getParameter("AccessoryColor"));
        colPro1.setColorId(corlorId);
        pro.setCategoryId(5);
        pro.setStar(Float.valueOf(0));
        productService.addAccessory(pro, colPro1);
        return "redirect:/Product/Add";
    }

}
