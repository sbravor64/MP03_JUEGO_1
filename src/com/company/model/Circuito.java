package com.company.model;

import java.util.Scanner;

public class Circuito {
    Scanner sc = new Scanner(System.in);
    private int numCircuitos;

    public void setNumCircuitos() {
        numCircuitos =sc.nextInt();
    }

    public int getNumCircuitos(){
        return numCircuitos;
    }
}

