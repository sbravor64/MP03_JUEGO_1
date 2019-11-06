package com.company.view;
import com.company.model.Campeonato;
import com.company.model.Campeonato;
import com.company.model.Participante;

import java.util.Scanner;

public class Competicion {
    public String nomJ;

    public void show() {
        Scanner sc = new Scanner(System.in);

        MenuPrincipal menuPrincipal = new MenuPrincipal();
        Participante participante = new Participante();
        Campeonato campeonato = new Campeonato();

        System.out.print("Ecribir nombre del jugador: ");
        participante.setNom();
        nomJ=participante.getNom();
        System.out.print("Cantidad de Participantes: ");
        campeonato.setNumParticipantes();
        System.out.print("Cantidad de Circuitos: ");
        campeonato.setNumCircuitos();
        System.out.println("");
        menuPrincipal.show();
    }

    public String getNomJ() {
        return nomJ;
    }
}
