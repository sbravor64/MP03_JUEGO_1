package com.company.view;

import java.util.Scanner;

public class MenuPrincipal {
    Configuracion configuracion = new Configuracion();

    public void show() {

            Scanner sc = new Scanner(System.in);
            System.out.println("1. Configurar Competición");
            System.out.println("2. Jugar");
            System.out.println("3. Resultados");
            System.out.println("4. Acabar");

            int opcion= sc.nextInt();
            switch (opcion) {
                case 1:
                    configuracion.show();
                    break;
                case 2:
                    MenuVehiculo vehiculo = new MenuVehiculo(configuracion);
                    vehiculo.show();
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
