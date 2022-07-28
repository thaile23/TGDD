package com.project.TGDD.Controller;

import com.project.TGDD.Model.LoginAD;
import com.project.TGDD.Service.ServiceImpl.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Objects;


@Controller
public class LoginController {

    @Autowired
    private LoginService userService;


    @GetMapping("")

    public ModelAndView login() {
        ModelAndView mav = new ModelAndView("login");
        mav.addObject("user", new LoginAD());
        return mav;
    }

    @PostMapping("/loginA")
    public String login(@ModelAttribute("user") LoginAD user ) {

        LoginAD oauthUser = userService.login(user.getUsername(), user.getPassword());


        System.out.print(oauthUser);
        if(Objects.nonNull(oauthUser))
        {

            return "redirect:/Product/Admin";


        } else {
            return "redirect:/login";


        }

    }

    @RequestMapping(value = {"/logout"}, method = RequestMethod.POST)
    public String logoutDo(HttpServletRequest request,HttpServletResponse response)
    {


        return "redirect:/login";
    }

}