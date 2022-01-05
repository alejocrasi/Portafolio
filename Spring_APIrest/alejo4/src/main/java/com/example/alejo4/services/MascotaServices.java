package com.example.alejo4.services;

import com.example.alejo4.model.Mascota;
import com.example.alejo4.repitory.MascotaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class MascotaServices {
    @Autowired
    private MascotaRepository mascotaRepository;

    public List<Mascota> listarMascotas(){
        return mascotaRepository.findAll();
    }
}
