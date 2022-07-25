package com.project.TGDD.Controller;

import com.project.TGDD.Model.ListShowUser;
import com.project.TGDD.Model.User;
import com.project.TGDD.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class UserController {

    @Autowired UserService userService;


    @GetMapping("/User")
    public String ListUser(Model model){
        List<ListShowUser> lisst = new ArrayList<>();
        List<User> listUser = userService.getAllUser();
        for(Integer i= 0; i<listUser.size(); i++){
            String s = "gender";
            Integer a = listUser.get(i).getNumberPhone();
            if(listUser.get(i).getGender().equals(0)){
                s = "Nữ";
            } else if(listUser.get(i).getGender().equals(1)){
                s = "Nam";
            }
            ListShowUser l = new ListShowUser(i,a, listUser.get(i).getName(),s,listUser.get(i).getAddress());
            lisst.add(l);
        }
        model.addAttribute("listUser", lisst);
        model.addAttribute("addUser", new User());
        return "UserIndex";
    }
    @PostMapping("/User/save")
    public String addUser(User user){
        userService.addUser(user);
        return "redirect:/User";
    }

    @PostMapping("/User/edit")
    public String editUser(User user){
        userService.addUser(user);
        return "redirect:/User";
    }
}
