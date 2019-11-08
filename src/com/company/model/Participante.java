package com.company.model;
import java.util.Random;

public class Participante {

    private String nom = "player";
    private String nomP;
    private float time;
    private String vehiculo;

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getNom(){
        System.out.println(nom);
        return nom;
    }

    public void timeParticipante(){
        float min = 0F;
        float max = 2F;
        time = min + new Random().nextFloat() * (max - min);
    }

    public void setVehiculo(String vehiculo){
        this.vehiculo=vehiculo;
    }

    public String getVehiculo() {
        return vehiculo;
    }
}
