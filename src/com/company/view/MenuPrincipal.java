package com.company.view;
import java.util.Scanner;

public class MenuPrincipal {
    public void show() {
        Scanner sc = new Scanner(System.in);
        System.out.println("1. Configurar Competición");
        System.out.println("2. Jugar");
        System.out.println("3. Resultados");
        System.out.println("4. Acabar");

        MenuCompeticion menuCompeticion= new MenuCompeticion();
        int opcion= sc.nextInt();
        switch (opcion) {
            case 1:
                menuCompeticion.show();
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
            case 5:
                break;
        }
    }
}
