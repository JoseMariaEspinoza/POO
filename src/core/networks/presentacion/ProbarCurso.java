package core.networks.presentacion;

import core.networks.modelo.Curso;
import core.networks.modelo.Usuario;

public class ProbarCurso {
    public static void main(String[] args) {
        //Instanciar clase Curso
        Curso c1 = new Curso(1,"Programacion en Java", 1500,60f);
        c1.setRequisitos("ESO");
        c1.setModalidad("Presencial");
        c1.setTipoCurso("Informática");
        c1.setContenido("JSE y acceso a BBDD");
        System.out.println(c1.mostrarInformacion());

    }
}
