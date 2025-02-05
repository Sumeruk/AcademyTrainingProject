package org.example.controllers;

import org.example.servicies.IndexService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Random;

@Controller
public class IndexController {

    public IndexService service;

    @Autowired
    public IndexController(IndexService service) {
        this.service = service;
    }

    @GetMapping("/html")
    public String index(Model model){
        System.out.println("---Сейчас будет вызываться сервис");
        System.out.println("---В нем происходит обработка информации");
        double randDouble = service.indexService();
        System.out.println("---Вернулись из сервиса, отображение страницы HTML");

        model.addAttribute("randDouble", randDouble);
        return "index";
    }

    @GetMapping("/randNum")
    public String getPageRandNums(){
        return "randNums";
    }

    @PostMapping("/randNum")
    public String getRandNums(@RequestParam int min, @RequestParam int max, Model model){
        Random random = new Random();
        int randomNumber = min + random.nextInt(max - min + 1);
        model.addAttribute("randomNumber", randomNumber);
        return "randNums";
    }
}
