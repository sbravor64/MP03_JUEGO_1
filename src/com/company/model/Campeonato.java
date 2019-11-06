package com.company.model;

import java.util.Scanner;

public class Campeonato {
    Scanner sc = new Scanner(System.in);
    private int numCircuitos;
    private int numParticipantes;

    public void setNumCircuitos() {
        numCircuitos =sc.nextInt();
    }

    public int getNumCircuitos(){
        return numCircuitos;
    }

    public void setNumParticipantes() {
        numParticipantes=sc.nextInt();
    }

    public int getNumParticipantes(){
        return numParticipantes;
    }
}

