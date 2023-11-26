package com.inmueble.InmobiliariaSp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.CrossOrigin;

@CrossOrigin(origins = "http://localhost:5173")
@SpringBootApplication
public class InmobiliariaSpApplication {

    public static void main(String[] args) {
        SpringApplication.run(InmobiliariaSpApplication.class, args);
    }

}
