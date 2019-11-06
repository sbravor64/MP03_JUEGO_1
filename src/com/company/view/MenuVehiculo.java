package com.company.view;

import com.company.manager.Jugar;
import com.company.model.*;

import java.util.Scanner;

public class MenuVehiculo {
    Jugar jugar = new Jugar();

    Participante participante = new Participante();
    Scanner sc = new Scanner(System.in);
    private int opcion;

    public void show() {
        System.out.println("1. Coche");
        System.out.println("2. Moto");
        System.out.println("3. Bicicleta");

        opcion=sc.nextInt();
        switch (opcion){
            case 1:
                participante.setVehiculo("Coche");
                Coche coche = new Coche();
                jugar.start();
            case 2:
                participante.setVehiculo("Moto");
                Moto moto = new Moto();
                jugar.start();
            case 3:
                participante.setVehiculo("Bicicleta");
                Bicicleta bicicleta = new Bicicleta();
                jugar.start();

        }
    }
}
