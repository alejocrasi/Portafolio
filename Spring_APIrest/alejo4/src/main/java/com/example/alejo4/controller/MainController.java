package com.example.alejo4.controller;

import com.example.alejo4.model.Mascota;
import com.example.alejo4.repitory.MascotaRepository;
import com.example.alejo4.services.MascotaServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Controller
@RestController
@RequestMapping

public class MainController {
    @Autowired
    private MascotaServices mascotaServices;

    @GetMapping("/home")
    public void print(){
            System.out.println("hola ");
        }

    @GetMapping("/listar")
    public List<Mascota> listar() {
        return mascotaServices.listarMascotas();
    }



}
