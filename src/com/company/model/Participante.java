package com.company.model;

import com.company.view.MenuVehiculo;

import java.util.Random;
import java.util.Scanner;

public class Participante {
    MenuVehiculo menuVehiculo = new MenuVehiculo();

    Scanner sc = new Scanner(System.in);
    private String nom = "player";
    private String nomP;
    private float time;
    private String vehiculo;

    public void setNom() {
        nom=sc.nextLine();
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
