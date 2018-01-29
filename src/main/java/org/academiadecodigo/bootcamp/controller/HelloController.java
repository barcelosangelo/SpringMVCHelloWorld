package org.academiadecodigo.bootcamp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HelloController {

    // Map the URL/Verb to the method
    @RequestMapping(method = RequestMethod.GET, value = "/hello")
    public String sayHello(Model model) {

        // Add an attribute to the request
        model.addAttribute("greeting", "Hello World Angelo Barcelos");

        // Return the view name
        return "hello";

    }

}