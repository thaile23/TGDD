package com.project.TGDD.Controller;

import com.project.TGDD.Model.*;
import com.project.TGDD.Repository.UserRepository;
import com.project.TGDD.Service.ColorService;
import com.project.TGDD.Service.ProductService;
import com.project.TGDD.Service.ServiceImpl.PhoneTabletDetailServiceImpl;
import com.project.TGDD.Service.ServiceImpl.ProductServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;

import java.io.UnsupportedEncodingException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.security.Principal;
import java.util.*;

@Controller
public class ProductController {
    @Autowired
    ColorService colorservice;
    @Autowired
    ProductService productService;

    @Autowired
    ProductServiceImpl service;

    @Autowired
    PhoneTabletDetailServiceImpl phoneTabletDetailService;
    @Autowired
    UserRepository userRepository;

    @GetMapping("/Home")
    public String Home(Model model) {
        List<Product> ListPro = productService.getAllProduct();
        model.addAttribute("ListPro", ListPro);
        return "Home";
    }

    //show tablet
    @GetMapping("/Tablet/show")
    public String showProduct(Model model, HttpSession httpSession) {
        String keyword = "3";
        List<Product> listProducts = service.listAll(keyword);
        model.addAttribute("listProducts", listProducts);
        return "Tablet";
    }

    //Loc theo hang Tablet
    @GetMapping("/Tablet/show/")
    public String showHSXTablet(Model model, @Param("categoryId") Integer categoryId, @Param("manufacturerId") Integer manufacturerId) {
        List<Product> listProducts = service.listAll1(categoryId, manufacturerId);
        model.addAttribute("listProducts", listProducts);
        model.addAttribute("categoryId", categoryId);
        model.addAttribute("manufacturerId", manufacturerId);
        return "Tablet";
    }

    //show dien thoai
    @GetMapping("/Phone/show")
    public String showDienthoai(Model model, HttpSession httpSession) {
        String keyword = "1";
        List<Product> listProducts = service.listAll3(keyword);
        model.addAttribute("listProducts", listProducts);
        return "Phone";
    }

    //Loc theo hang Tablet
    @GetMapping("/Phone/show/")
    public String showHSXPhone(Model model, @Param("categoryId") Integer categoryId, @Param("manufacturerId") Integer manufacturerId) {
        List<Product> listProducts = service.listAll3(categoryId, manufacturerId);
        model.addAttribute("listProducts", listProducts);
        model.addAttribute("categoryId", categoryId);
        model.addAttribute("manufacturerId", manufacturerId);
        return "Phone";
    }

    //show phu kien
    @GetMapping("/Phu_kien/show")
    public String showPhukien(Model model, HttpSession httpSession) {
        String keyword = "5";
        List<Product> listProducts = service.listAll2(keyword);
        model.addAttribute("listProducts", listProducts);
        return "Accessory";
    }

    //Show chi tiet sp
    @GetMapping("/Tablet/show/{id}")
    public String showDetail(@PathVariable("id") int id, Model model, HttpSession session, RedirectAttributes ra) {
        try {
            Product product = service.get(id);
            model.addAttribute("product", product);
            PhoneTabletDetail phoneTabletDetail = phoneTabletDetailService.getbyID(id);
            model.addAttribute("phoneTabletDetail", phoneTabletDetail);
            return "ProductDetail";
        } catch (ProductNotFoundException e) {
            e.printStackTrace();
        }
        return "";
    }


    @RequestMapping("/Product/Admin")
    public String viewHomePage(Model model) {
        String keyword = null;
        return viewPage(model, 1, "name", "asc", keyword);
    }

    @RequestMapping("/page/{pageNum}")
    public String viewPage(Model model,
                           @PathVariable(name = "pageNum") int pageNum,
                           @Param("sortField") String sortField,
                           @Param("sortDir") String sortDir,
                           @Param("keyword") String keyword) {
        Page<Product> page = service.listAll(pageNum, sortField, sortDir, keyword);
        List<Product> listProducts = page.getContent();
        model.addAttribute("currentPage", pageNum);
        model.addAttribute("totalPages", page.getTotalPages());
        model.addAttribute("totalItems", page.getTotalElements());
        model.addAttribute("listProducts", listProducts);
        model.addAttribute("sortField", sortField);
        model.addAttribute("sortDir", sortDir);
        model.addAttribute("keyword", keyword);

        String reverseSortDir = sortDir.equals("asc") ? "desc" : "asc";
        model.addAttribute("reverseSortDir", reverseSortDir);
        return "table-data-product";
    }

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
    public String AddNewPhone(Product pro, @RequestParam("ImageUploadPhone") MultipartFile multipartFile, RedirectAttributes re, HttpServletRequest request) throws IOException {
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
        //String pic = request.getParameter("ImageUploadPhone");
        pro.setCategoryId(1);
        pro.setStar((float) 0);
        //Upload anh
        String fileName = StringUtils.cleanPath(Objects.requireNonNull(multipartFile.getOriginalFilename()));
        System.out.println(fileName);
        pro.setPicture1(fileName);
        productService.addPhoneTablet(pro, phone, colPro, romPro);
        String uploadDir = "./TGDD-New/src/main/resources/static/img-sanpham";
        Path uploadPath = Paths.get(uploadDir);
        re.addFlashAttribute("message", "Create product successfully!!!");
        if (!Files.exists(uploadPath)) {
            Files.createDirectories(uploadPath);
        }
        try (InputStream inputStream = multipartFile.getInputStream()) {
            Path filePath = uploadPath.resolve(fileName);
            Files.copy(inputStream, filePath, StandardCopyOption.REPLACE_EXISTING);
        } catch (IOException ioe) {
            throw new IOException("Could not save image file: " + fileName, ioe);
        }
        return "redirect:/Product/Add";
    }
//
//    @PostMapping("/Product/AddNewLaptop")
//    public String AddNewLaptop(Product pro, @RequestParam("ImageUploadLaptop") MultipartFile multipartFile, RedirectAttributes re, HttpServletRequest request) throws IOException {
//        //Add phone detail
//        String core = request.getParameter("LaptopCore");
//        String thread = request.getParameter("LaptopThread");
//        String cpu = request.getParameter("LaptopCPU");
//        String cpuSpeed = request.getParameter("LaptopCPUSpeed");
//        String ram = request.getParameter("LaptopRam");
//        String ramUpdate = request.getParameter("LaptopRamUpdate");
//        String screen = request.getParameter("LaptopScreen");
//        String graphicCard = request.getParameter("LaptopGraphicCard");
//        String connector = request.getParameter("LaptopConnector");
//        String especially = request.getParameter("LaptopEspecially");
//        String design = request.getParameter("LaptopDesign");
//        String pin = request.getParameter("LaptopPin");
//        String sizeWeight = request.getParameter("LaptopSizeWeight");
//        String release = request.getParameter("LaptopRelease");
//
//        LaptopDetail laptop = new LaptopDetail();
//        laptop.setCore(core);
//        laptop.setThread(thread);
//        laptop.setCpu(cpu);
//        laptop.setCpuSpeed(cpuSpeed);
//        laptop.setRam(ram);
//        laptop.setRamUpdate(ramUpdate);
//        laptop.setScreen(screen);
//        laptop.setGraphicCard(graphicCard);
//        laptop.setConnector(connector);
//        laptop.setEspecially(especially);
//        laptop.setDesign(design);
//        laptop.setPin(pin);
//        laptop.setSizeWeight(sizeWeight);
//        laptop.setRelease(release);
//        //add color product
//        ColorProduct colPro = new ColorProduct();
//        int corlorId = Integer.parseInt(request.getParameter("LaptopColor"));
//        colPro.setColorId(corlorId);
//
//        //add rom product
//        RomProduct romPro = new RomProduct();
//        int romId = Integer.parseInt(request.getParameter("LaptopRom"));
//        romPro.setRomId(romId);
//        pro.setCategoryId(2);
//        pro.setStar((float) 0);
//
//        //Upload anh
//        String fileName = StringUtils.cleanPath(Objects.requireNonNull(multipartFile.getOriginalFilename()));
//        pro.setPicture1(fileName);
//        productService.addLaptop(pro, laptop, colPro, romPro);
//        String uploadDir = "./TGDD-New/src/main/resources/static/img-sanpham";
//        Path uploadPath = Paths.get(uploadDir);
//        re.addFlashAttribute("message", "Create product successfully!!!");
//        if (!Files.exists(uploadPath)) {
//            Files.createDirectories(uploadPath);
//        }
//        try (InputStream inputStream = multipartFile.getInputStream()) {
//            Path filePath = uploadPath.resolve(fileName);
//            Files.copy(inputStream, filePath, StandardCopyOption.REPLACE_EXISTING);
//        } catch (IOException ioe) {
//            throw new IOException("Could not save image file: " + fileName, ioe);
//        }
//        return "redirect:/Product/Add";
//    }

    @PostMapping("/Product/AddNewTablet")
    public String AddNewTablet(Product pro, @RequestParam("ImageUploadTablet") MultipartFile multipartFile, HttpServletRequest request, RedirectAttributes re) throws IOException {
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


        //Upload anh
        String fileName = StringUtils.cleanPath(Objects.requireNonNull(multipartFile.getOriginalFilename()));
        // System.out.println(fileName);
        pro.setPicture1(fileName);
        productService.addPhoneTablet(pro, tablet, colPro, romPro);
        String uploadDir = "./TGDD-New/src/main/resources/static/img-sanpham";
        Path uploadPath = Paths.get(uploadDir);
        re.addFlashAttribute("message", "Create product successfully!!!");
        if (!Files.exists(uploadPath)) {
            Files.createDirectories(uploadPath);
        }
        try (InputStream inputStream = multipartFile.getInputStream()) {
            Path filePath = uploadPath.resolve(fileName);
            Files.copy(inputStream, filePath, StandardCopyOption.REPLACE_EXISTING);
        } catch (IOException ioe) {
            throw new IOException("Could not save image file: " + fileName, ioe);
        }
        return "redirect:/Product/Add";
    }

    @PostMapping("/Product/AddNewSmartWatch")
    public String AddNewSmartWatch(Product pro, @RequestParam("ImageUploadSmartWatch") MultipartFile multipartFile, HttpServletRequest request, RedirectAttributes re) throws IOException {
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

        //Upload anh
        String fileName = StringUtils.cleanPath(Objects.requireNonNull(multipartFile.getOriginalFilename()));
        // System.out.println(fileName);
        pro.setPicture1(fileName);
        productService.addSmartWatch(pro, smartWatch, colPro1);
        String uploadDir = "./TGDD-New/src/main/resources/static/img-sanpham";
        Path uploadPath = Paths.get(uploadDir);

        re.addFlashAttribute("message", "Create product successfully!!!");
        if (!Files.exists(uploadPath)) {
            Files.createDirectories(uploadPath);
        }
        try (InputStream inputStream = multipartFile.getInputStream()) {
            Path filePath = uploadPath.resolve(fileName);
            Files.copy(inputStream, filePath, StandardCopyOption.REPLACE_EXISTING);
        } catch (IOException ioe) {
            throw new IOException("Could not save image file: " + fileName, ioe);
        }

        return "redirect:/Product/Add";
    }

    @PostMapping("/Product/AddNewAccessory")
    public String AddNewAccessory(Product pro, @RequestParam("ImageUploadAccessory") MultipartFile multipartFile, RedirectAttributes re, HttpServletRequest request) throws IOException {
        ColorProduct colPro1 = new ColorProduct();
        int corlorId = Integer.parseInt(request.getParameter("AccessoryColor"));
        colPro1.setColorId(corlorId);
        pro.setCategoryId(5);
        pro.setStar(Float.valueOf(0));

        //Upload anh
        String fileName = StringUtils.cleanPath(Objects.requireNonNull(multipartFile.getOriginalFilename()));
        // System.out.println(fileName);
        pro.setPicture1(fileName);
        productService.addAccessory(pro, colPro1);
        String uploadDir = "./TGDD-New/src/main/resources/static/img-sanpham";
        Path uploadPath = Paths.get(uploadDir);
        re.addFlashAttribute("message", "Create product successfully!!!");
        if (!Files.exists(uploadPath)) {
            Files.createDirectories(uploadPath);
        }
        try (InputStream inputStream = multipartFile.getInputStream()) {
            Path filePath = uploadPath.resolve(fileName);
            Files.copy(inputStream, filePath, StandardCopyOption.REPLACE_EXISTING);
        } catch (IOException ioe) {
            throw new IOException("Could not save image file: " + fileName, ioe);
        }
        return "redirect:/Product/Add";
    }

    @GetMapping("/SmartWatch/show")
    public String ShowAllSmartWatch(Model model) {
        List<Product> listSmartWatch = productService.getAllProductByCategoryId(4);
        List<Manufacturer> listManufacturer = productService.getAllManufacturer();
        model.addAttribute("TotalSmartWatch", listSmartWatch.size());
        model.addAttribute("listSmartWatch", listSmartWatch);
        model.addAttribute("listManufacturer", listManufacturer);
        return "SmartWatch";
    }

    @GetMapping("/SmartWatch/detail/{id}")
    public String ShowSmartWatchDetail(Model model, @PathVariable("id") Integer productid) {
        Product smartWatch = productService.findProductById(productid);
        smartWatchDetail swDetail = productService.findSWByProductId(productid);
        model.addAttribute("smartWatch", smartWatch);
        model.addAttribute("swDetail", swDetail);
        return "SmartWatchDetail";
    }
    //show Laptop
    @GetMapping("/Laptop/show")
    public String showLaptop(Model model, HttpSession httpSession){
        String keyword = "2";
        List<Product> listProducts = service.listAll4(keyword);
        model.addAttribute("listProducts",listProducts);
        return "Laptop";
    }
    @GetMapping("/Laptop/show/")
    public String showHSXLaptop(Model model, @Param("categoryId") Integer categoryId, @Param("manufacturerId") Integer manufacturerId){
        List<Product> listProducts = service.listAll4(categoryId, manufacturerId);
        model.addAttribute("listProducts", listProducts);
        model.addAttribute("categoryId", categoryId);
        model.addAttribute("manufacturerId", manufacturerId);
        return "Laptop";
    }



    @GetMapping("/Product/Pos")
    public String PosBanHang(Model model,HttpSession session) {
        HttpServletRequest request = new HttpServletRequest() {
            @Override
            public Object getAttribute(String name) {
                return null;
            }

            @Override
            public Enumeration<String> getAttributeNames() {
                return null;
            }

            @Override
            public String getCharacterEncoding() {
                return null;
            }

            @Override
            public void setCharacterEncoding(String env) throws UnsupportedEncodingException {

            }

            @Override
            public int getContentLength() {
                return 0;
            }

            @Override
            public long getContentLengthLong() {
                return 0;
            }

            @Override
            public String getContentType() {
                return null;
            }

            @Override
            public ServletInputStream getInputStream() throws IOException {
                return null;
            }

            @Override
            public String getParameter(String name) {
                return null;
            }

            @Override
            public Enumeration<String> getParameterNames() {
                return null;
            }

            @Override
            public String[] getParameterValues(String name) {
                return new String[0];
            }

            @Override
            public Map<String, String[]> getParameterMap() {
                return null;
            }

            @Override
            public String getProtocol() {
                return null;
            }

            @Override
            public String getScheme() {
                return null;
            }

            @Override
            public String getServerName() {
                return null;
            }

            @Override
            public int getServerPort() {
                return 0;
            }

            @Override
            public BufferedReader getReader() throws IOException {
                return null;
            }

            @Override
            public String getRemoteAddr() {
                return null;
            }

            @Override
            public String getRemoteHost() {
                return null;
            }

            @Override
            public void setAttribute(String name, Object o) {

            }

            @Override
            public void removeAttribute(String name) {

            }

            @Override
            public Locale getLocale() {
                return null;
            }

            @Override
            public Enumeration<Locale> getLocales() {
                return null;
            }

            @Override
            public boolean isSecure() {
                return false;
            }

            @Override
            public RequestDispatcher getRequestDispatcher(String path) {
                return null;
            }

            @Override
            public String getRealPath(String path) {
                return null;
            }

            @Override
            public int getRemotePort() {
                return 0;
            }

            @Override
            public String getLocalName() {
                return null;
            }

            @Override
            public String getLocalAddr() {
                return null;
            }

            @Override
            public int getLocalPort() {
                return 0;
            }

            @Override
            public ServletContext getServletContext() {
                return null;
            }

            @Override
            public AsyncContext startAsync() throws IllegalStateException {
                return null;
            }

            @Override
            public AsyncContext startAsync(ServletRequest servletRequest, ServletResponse servletResponse) throws IllegalStateException {
                return null;
            }

            @Override
            public boolean isAsyncStarted() {
                return false;
            }

            @Override
            public boolean isAsyncSupported() {
                return false;
            }

            @Override
            public AsyncContext getAsyncContext() {
                return null;
            }

            @Override
            public DispatcherType getDispatcherType() {
                return null;
            }

            @Override
            public String getAuthType() {
                return null;
            }

            @Override
            public Cookie[] getCookies() {
                return new Cookie[0];
            }

            @Override
            public long getDateHeader(String name) {
                return 0;
            }

            @Override
            public String getHeader(String name) {
                return null;
            }

            @Override
            public Enumeration<String> getHeaders(String name) {
                return null;
            }

            @Override
            public Enumeration<String> getHeaderNames() {
                return null;
            }

            @Override
            public int getIntHeader(String name) {
                return 0;
            }

            @Override
            public String getMethod() {
                return null;
            }

            @Override
            public String getPathInfo() {
                return null;
            }

            @Override
            public String getPathTranslated() {
                return null;
            }

            @Override
            public String getContextPath() {
                return null;
            }

            @Override
            public String getQueryString() {
                return null;
            }

            @Override
            public String getRemoteUser() {
                return null;
            }

            @Override
            public boolean isUserInRole(String role) {
                return false;
            }

            @Override
            public Principal getUserPrincipal() {
                return null;
            }

            @Override
            public String getRequestedSessionId() {
                return null;
            }

            @Override
            public String getRequestURI() {
                return null;
            }

            @Override
            public StringBuffer getRequestURL() {
                return null;
            }

            @Override
            public String getServletPath() {
                return null;
            }

            @Override
            public HttpSession getSession(boolean create) {
                return null;
            }

            @Override
            public HttpSession getSession() {
                return null;
            }

            @Override
            public String changeSessionId() {
                return null;
            }

            @Override
            public boolean isRequestedSessionIdValid() {
                return false;
            }

            @Override
            public boolean isRequestedSessionIdFromCookie() {
                return false;
            }

            @Override
            public boolean isRequestedSessionIdFromURL() {
                return false;
            }

            @Override
            public boolean isRequestedSessionIdFromUrl() {
                return false;
            }

            @Override
            public boolean authenticate(HttpServletResponse response) throws IOException, ServletException {
                return false;
            }

            @Override
            public void login(String username, String password) throws ServletException {

            }

            @Override
            public void logout() throws ServletException {

            }

            @Override
            public Collection<Part> getParts() throws IOException, ServletException {
                return null;
            }

            @Override
            public Part getPart(String name) throws IOException, ServletException {
                return null;
            }

            @Override
            public <T extends HttpUpgradeHandler> T upgrade(Class<T> httpUpgradeHandlerClass) throws IOException, ServletException {
                return null;
            }
        };
        List<Product> listPro = productService.getAllProduct();
        model.addAttribute("listPro", listPro);
        Integer sum = (Integer) session.getAttribute("totalPrice");
        if (session.getAttribute("listproduct") == null) {
            model.addAttribute("messageNull", "Không có sản phẩm");
        } else {
            List<Product> listproduct = (List<Product>) session.getAttribute("listproduct");
            model.addAttribute("totalPrice", sum);
            model.addAttribute("ListAddPro", listproduct);
        }
        model.addAttribute("OrderDetail", new OrderDetail());
        return AddProPos(model, request, session);
    }
    @PostMapping("/Product/AddPos")
    public String AddProPos(Model model, HttpServletRequest request, HttpSession session) {
        List<String> idpro = List.of(request.getParameterValues("checkPro"));
        List<Product> listproduct = new ArrayList<>();
        int sum = 0;
        boolean check = false;
        if (session.getAttribute("listproduct") == null) {
            for (int q = 0; q < idpro.size(); q++) {
                Product pro = productService.findProductById(Integer.parseInt(idpro.get(q)));
                System.out.println(pro.getProductId() + "prodIDnull");
                listproduct.add(pro);
            }
        } else {
            listproduct = (List<Product>) session.getAttribute("listproduct");
            for (int n = 0; n < idpro.size(); n++) {
                for (int v = 0; v < listproduct.size(); v++) {
                    if (listproduct.get(v).getProductId().equals(Integer.parseInt(idpro.get(n)))) {
                        check = true;
                        break;
                    }
                }
            }
            if (check == false) {
                for (int c = 0; c < idpro.size(); c++) {
                    Product pro = productService.findProductById(Integer.parseInt(idpro.get(c)));
                    listproduct.add(pro);
                }
            }
        }
        for (int i = 0; i < listproduct.size(); i++) {
            sum += listproduct.get(i).getPrice();
        }
        model.addAttribute("OrderDetail", new OrderDetail());
        model.addAttribute("totalPrice", sum);
        model.addAttribute("ListAddPro", listproduct);
        session.setAttribute("totalPrice", sum);
        session.setAttribute("listproduct", listproduct);
        List<Product> listPro = productService.getAllProduct();
        model.addAttribute("listPro", listPro);
        if(session.getAttribute("username") ==null){
            model.addAttribute("username", "   ");
            model.addAttribute("address", "     ");
        }else {
            model.addAttribute("username", session.getAttribute("username").toString());
            model.addAttribute("address", session.getAttribute("address").toString());
        }
        return "Pos-ban-hang";
    }
}
