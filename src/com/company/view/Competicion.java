package com.company.view;
import com.company.model.Circuito;
import com.company.model.Jugador;
import com.company.model.Participante;

import java.util.Scanner;

public class Competicion {

    public void show() {
        Scanner sc = new Scanner(System.in);

        MenuPrincipal menuPrincipal = new MenuPrincipal();
        Jugador jugador = new Jugador();
        Participante participante = new Participante();
        Circuito circuito = new Circuito();

        System.out.print("Ecribir nombre del jugador: ");
        jugador.setNom();
        System.out.print("Cantidad de Participantes: ");
        participante.setNumParticipantes();
        System.out.print("Cantidad de Circuitos: ");
        circuito.setNumCircuitos();

        menuPrincipal.show();

    }
}
