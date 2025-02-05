package org.example.servicies;

import org.springframework.stereotype.Service;

import java.util.Random;

@Service
public class IndexService {

    public double indexService(){
        System.out.println("Привет из сервиса!");
        Random rnd = new Random();
        return rnd.nextInt();
    }
}
