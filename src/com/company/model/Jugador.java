package com.company.model;

import java.util.Scanner;

public class Jugador {
    Scanner sc = new Scanner(System.in);
    private String nom;

    public void setNom() {
        nom=sc.nextLine();
    }

    public String getNom(){
        System.out.println(nom);
        return nom;
    }
}
