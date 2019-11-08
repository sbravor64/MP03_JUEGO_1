package com.company.manager;

import com.company.model.Campeonato;
import com.company.model.Participante;
import com.company.view.Configuracion;
import java.util.ArrayList;
import java.util.List;

public class Jugar {

    Configuracion configuracion ;
    Campeonato campeonato = new Campeonato();
    List<Participante> participanteList = new ArrayList<>();

    public Jugar(Configuracion configuracion) {
        this.configuracion = configuracion;
    }

    public void start(){

        Participante Pjugador = new Participante();
        Pjugador.setNom(configuracion.getNomJ());

        participanteList.add(Pjugador);

        int numParticipantes = configuracion.getCantParticipantes();

        for (int i = 0; i < numParticipantes ; i++) {
            Participante p = new Participante();
            p.getNom();
            participanteList.add(p);

            System.out.println(p.getNom());
        }

    }

}
