package com.company.manager;

import com.company.model.Campeonato;
import com.company.model.Participante;
import com.company.view.Competicion;

import java.util.ArrayList;
import java.util.List;

public class Jugar {
    public Jugar(Competicion competicion) {
        this.competicion = competicion;
    }

    Campeonato campeonato = new Campeonato();
    Competicion competicion = new Competicion();
    List<Participante> participanteList = new ArrayList<>();


    public void start(){

        for (int i = 0; i < campeonato.getNumParticipantes() ; i++) {
            Participante p = new Participante();
            p.getNom();
            participanteList.add(p);

            System.out.println(p.getNom());
        }

        for (int i = 0; i < campeonato.getNumCircuitos() ; i++) {

        }

    }

}
