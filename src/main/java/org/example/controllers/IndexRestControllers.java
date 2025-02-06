package org.example.controllers;

import org.example.Main;
import org.example.entities.Man;
import org.example.servicies.IndexService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Random;

@RestController
@RequestMapping("/rest")
public class IndexRestControllers {

    public IndexService service;

    @Autowired
    public void setService(IndexService service) {
        this.service = service;
    }

    @GetMapping("/index")
    public ResponseEntity<Integer> indexRestController(){
        Random rnd = new Random();
        return ResponseEntity.ok(rnd.nextInt());
    }

    @GetMapping("/man")
    public ResponseEntity<Man> getMan(){
        Man someMan = new Man("Ilya", 10, "машинист");
        return ResponseEntity.ok(someMan);
    }

    @PostMapping("/man")
    public ResponseEntity<String> saveMan(){
        service.saveNewMan("Kostya", 21, "бегун");
        return ResponseEntity.ok("saved");
    }


}
