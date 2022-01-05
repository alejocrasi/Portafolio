package com.example.alejo4.repitory;

import com.example.alejo4.model.Mascota;
import com.example.alejo4.services.MascotaServices;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MascotaRepository extends JpaRepository<Mascota, Long> {
}
