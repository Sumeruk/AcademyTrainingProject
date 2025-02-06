package org.example.servicies;

import org.example.entities.Man;
import org.example.repositories.ManRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Random;

@Service
public class IndexService {

    private ManRepository manRepository;
    @Autowired
    public void setManRepository(ManRepository manRepository) {
        this.manRepository = manRepository;
    }



    public double indexService(){
        System.out.println("Привет из сервиса!");
        Random rnd = new Random();
        return rnd.nextInt();
    }

    public void saveNewMan(String name, int age, String profession){
        manRepository.save(new Man(name, age, profession));
    }
}
