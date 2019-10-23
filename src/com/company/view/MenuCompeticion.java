package com.company.view;
import com.company.model.Jugador;

import java.util.Scanner;

public class MenuCompeticion {
    public void show() {
        Scanner sc = new Scanner(System.in);
        System.out.println("1. Ecribir nombre del juegor");
        System.out.println("2. Cantidad de Participantes");
        System.out.println("3. Cantidad de Circuitos");
        System.out.println("4. Volver a inicio");

        MenuPrincipal menuPrincipal = new MenuPrincipal();
        Jugador jugador = new Jugador();
        int opcion= sc.nextInt();
        switch (opcion) {
            case 1:
                jugador.nom = sc.nextLine();
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                menuPrincipal.show();
                break;
        }
    }
}
