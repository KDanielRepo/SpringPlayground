package com.example.SpringPlayground;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import javax.validation.Valid;

@Controller
public class FirstController implements WebMvcConfigurer {


    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        registry.addViewController("/results").setViewName("results");
    }

    @GetMapping("/")
    public String index(){
        return "index";
    }
    @GetMapping("/form")
    public String form(Person person){
        return "form";
    }
    /*@GetMapping("/greeting")
    public String greeting(@RequestParam(name="name",required = false,defaultValue = "niga")String name,Model model){
        model.addAttribute("name",name);
        return "greeting";
    }*/
    @PostMapping("/")
    public String checkPersonInfo(@Valid Person person, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            return "form";
        }

        return "redirect:/results";
    }
}
