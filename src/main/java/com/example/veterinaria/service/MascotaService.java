package com.example.veterinaria.service;

import com.example.veterinaria.model.Mascota;
import com.example.veterinaria.repository.MascotaRepository;
import org.springframework.stereotype.Service;

import java.util.*;


public class MascotaService {
    private final MascotaRepository mascotaRepository;

    public MascotaService(MascotaRepository mascotaRepository){
        this.mascotaRepository = mascotaRepository;
    }

    //Listar todas las mascotas
    public List<Mascota> listarTodas(){
        return mascotaRepository.findAll();
    }

    //obtener mascota por ID
    public Optional<Mascota> buscarPorId(Integer id){
        return mascotaRepository.findById(id);
    }

    //crear mascota
    public Mascota crearMascota(Mascota mascota){
        return mascotaRepository.save(mascota);
    }

    //actualizar mascota
    public Mascota actualizarMascota(Integer id, Mascota mascota){
        mascota.setId(id);
        return mascotaRepository.save(mascota);
    }

    //eliminamos mascota
    public void eliminarMascota(Integer id){
        mascotaRepository.deleteById(id);
    }
}
