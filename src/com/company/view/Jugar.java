package com.company.view;

import com.company.model.*;

import java.util.*;

public class Jugar {
    Scanner sc = new Scanner(System.in);
    Configuracion configuracion;
    List<Participante> participanteList = new ArrayList<>();

    public Jugar(Configuracion configuracion) {
        this.configuracion = configuracion;
    }

    public void start() {
        elegirVehiculo();

        Participante Pjugador = new Participante();
        Pjugador.setNom(configuracion.getNomJ());

        participanteList.add(Pjugador);

        int cantPart = configuracion.getCantParticipantes();

        for (int i = 1; i <= cantPart; i++) {
            Participante p = new Participante();
            p.setNom("participante " + i);
            participanteList.add(p);
        }

        for (int i = 0; i < configuracion.getCantCircuitos() ; i++) {
            int y = i+1;
            System.out.println("---------------------");
            System.out.println("Circuito " + y);
            for (Participante p : participanteList) {
                p.setTime();
            }

            Collections.sort(participanteList);

            for (int j = 0; j <3 ; j++) {
                Participante p = participanteList.get(j);
                if(j==0){
                    p.setPuntos(p.getPuntos()+3);
                } else if(j==1){
                    p.setPuntos(p.getPuntos()+2);
                } else if(j==2){
                    p.setPuntos(p.getPuntos()+1);
                }
            }

            for (Participante p_ordenado: participanteList) {
                System.out.format(p_ordenado.getNom() + " ----> " + p_ordenado.getPuntos() + "-----" + "%.2f",p_ordenado.getTime());
                System.out.print("s");
                System.out.println("");
            }

            System.out.println("");
        }
    }

    public void elegirVehiculo() {
        System.out.println("1. Coche");
        System.out.println("2. Moto");
        System.out.println("3. Bicicleta");

        int opcion;
        do {
            opcion = sc.nextInt();
            switch (opcion) {
                case 1:
                    Coche coche;
                    break;
                case 2:
                    Moto moto;
                    break;
                case 3:
                    Bicicleta bicicleta;
                    break;
            }
        } while (opcion>3);

    }
}
