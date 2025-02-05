package org.example.controllers;

import org.example.Main;
import org.example.entities.Man;
import org.example.servicies.IndexService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Random;

@RestController
@RequestMapping("/rest")
public class IndexRestControllers {

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


}
