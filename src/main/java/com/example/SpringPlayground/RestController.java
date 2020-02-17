package com.example.SpringPlayground;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@org.springframework.web.bind.annotation.RestController
@RequestMapping("/rest")
public class RestController {

    @Autowired
    EntityRepo entityRepo;

    @GetMapping("/autokar/{id}")//dokoncz mapowanie
    public Autokary autokaryTest(@RequestParam(name = "id",required = true)int id, Model model){
        model.addAttribute("id",id);
        return entityRepo.findById(id);
    }
    @GetMapping("/greeting")
    public Greeting greeting(@RequestParam(required = false,defaultValue = "world")String content){
        return new Greeting(content,1);
    }
    /*@GetMapping("/{id}")
    public String test(@PathVariable int id){
        return "Hello "+id;
    }*/
}
