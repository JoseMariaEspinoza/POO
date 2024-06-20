package core.networks.presentacion;

import core.networks.modelo.Alumno;

import java.util.Scanner;

public class TestAlumno {
    public static void main(String[] args) {
        //Instanciar
        Scanner entrada = new Scanner(System.in);
        Alumno a1 = new Alumno();
        System.out.println("Introduzca nombre completo");
        a1.setNombreCompleto(entrada.next());
        System.out.println("Introduzca el numero de parciales");
        a1.setParciales(entrada.nextInt());
        for(int i=0; i<=a1.getNotas().length;i++){
        System.out.println("Introduzca Calificación " + (i+1));
        a1.asignarValores(i,entrada.nextDouble());
        }
    }
}
