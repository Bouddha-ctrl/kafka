package com.example.demo;

import com.example.demo.dto.Log;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import com.example.demo.sender.ISender;

@SpringBootApplication(scanBasePackages= {"com.example.demo"})
public class DemoApplication  implements CommandLineRunner {

    @Autowired
    private ISender sender; // Affectation de l'instance sender

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }



    @Override
    public void run(String... args) throws Exception {


        Log logTuto1 = new Log("12/10/2002", "200", "HTTP 1.0", "www.google.com","/index"); // Créer un objet pour Tuto1
        sender.send("Tuto1", logTuto1.toString()); // Envoyer l'objet sur le topic "Tuto1"


        Log logTuto2 = new Log("12/05/2902", "201", "HTTP 2.0", "gpt.com", "/help"); // Créer un objet pour Tuto1
        sender.send("Tuto2", logTuto2.toString());  // Envoyer l'objet sur le topic "Tuto2"

    }
}
