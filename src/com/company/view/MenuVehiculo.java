package com.company.view;

import com.company.model.Circuito;
import com.company.model.Participante;

import java.util.Scanner;

public class MenuVehiculo {
    Scanner sc = new Scanner(System.in);
    private int opcion;

    public void show() {
        System.out.println("1. Coche");
        System.out.println("2. Moto");
        System.out.println("3. Bicicleta");

        opcion=sc.nextInt();
        switch (opcion){
            case 1:
            case 2:

            case 3:

        }

    }
}
