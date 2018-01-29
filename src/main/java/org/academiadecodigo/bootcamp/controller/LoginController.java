package org.academiadecodigo.bootcamp.controller;


import org.academiadecodigo.bootcamp.Model.User;
import org.academiadecodigo.bootcamp.UserService.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class LoginController {

    @Autowired
    private UserService userService;

    @RequestMapping(method = RequestMethod.GET, value = "/login")
    public ModelAndView showLogin(){

        ModelAndView modelAndView = new ModelAndView("login");
        modelAndView.addObject("user",new User);
        return modelAndView;
    }

    @RequestMapping(method = RequestMethod.POST, value = "/login")
    public String doLogin(Model model, @ModelAttribute("user") User user) {

        if (user.getUsername() == null || user.getUsername().isEmpty() || user.getPassword() == null || user.getPassword().isEmpty()) {
            return "login";
        }

        if (userService.authenticate(user.getUsername(), user.getPassword())) {
            model.addAttribute("greeting", "Welcome");
            return "main";

        } else {
            model.addAttribute("error", "Authentication Failure");
            return "login";
        }

    }

}
