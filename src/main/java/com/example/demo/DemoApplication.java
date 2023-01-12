package com.example.demo;

import dto.Log;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import sender.ISender;

@SpringBootApplication
public class DemoApplication  implements CommandLineRunner {

    private ISender sender; // Affectation de l'instance sender

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

    /**
     * Exécuter le programme
     * Permet d'envoyer des messages vers une messagerie (Kafka ou autre)
     *
     * La réception du message est asynchrone (en attente)
     */
    @Override
    public void run(String... args) throws Exception {

        while (true) { // Boucle infinie
            Log logTuto1 = new Log("12/10/2002", "200", "HTTP 1.0"); // Créer un objet pour Tuto1
            sender.send("Tuto1", logTuto1); // Envoyer l'objet sur le topic "Tuto1"
            Thread.sleep(3000); // Attendre 3s
            Log logTuto2 = new Log("12/05/2902", "201", "HTTP 2.0"); // Créer un objet pour Tuto1
            sender.send("Tuto2", logTuto2);  // Envoyer l'objet sur le topic "Tuto2"
            Thread.sleep(30000); // Attendre 3s
        }

    }
}
