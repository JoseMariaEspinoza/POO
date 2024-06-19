package core.networks.presentacion;

import core.networks.modelo.Curso;

public class ProbarCurso {
    public static void main(String[] args) {
        //Instanciar clase Curso
        Curso c1 = new Curso(1,"Programacion en Java", 1500,60f);
        System.out.println(c1.mostrarInformacion());
    }
}
