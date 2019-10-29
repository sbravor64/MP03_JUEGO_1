package com.company.model;

import java.util.Scanner;

public class Participante {
    Scanner sc = new Scanner(System.in);
    private int numParticipantes;


    public void setNumParticipantes() {
        numParticipantes=sc.nextInt();
    }

    public int getNumParticipantes(){
        return numParticipantes;
    }

    public Vehiculo vehiculo(){
        return null;
    }
}
