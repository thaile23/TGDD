package com.project.TGDD.Controller;

import com.project.TGDD.Model.Order;
import com.project.TGDD.Model.OrderDetail;
import com.project.TGDD.Service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

@Controller
public class OrderController {
    @Autowired
    OrderService orderService;
//    @PostMapping("/Order/Create")
//    public String CreateOrder(HttpSession session, OrderDetail orderDetail, RedirectAttributes re){
//       String customer = session.getAttribute("username").toString();
//       String address = session.getAttribute("address").toString();
//       String number = session.getAttribute("numberPhone").toString();
//       Integer numberphone = Integer.parseInt(number);
//       //order
//       Order order = new Order();
//       order.setName(customer);
//       order.setAddress(address);
//       order.setNumberPhone(numberphone);
//       //orderDetail
//       orderService.addOrder(order, orderDetail);
//        return "redirect:/Product/Pos";
//    }
}
