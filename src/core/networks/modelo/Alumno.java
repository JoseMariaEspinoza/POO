package core.networks.modelo;

import java.util.Scanner;

public class Alumno {
    //1. Atributos
    public int parciales;
    public double[] notas = new double[parciales];
    public String nombreCompleto;
    public double notaFinal;
    //2. Metodos
    public void asignarValores(int indice, double nota){
                notas[indice] = nota;
    }
    public double promedio(){
        double sumaNotas = 0;
        for(double elemento : notas){
            sumaNotas = sumaNotas + elemento;
        }
        notaFinal = sumaNotas/ parciales;
        return notaFinal;
    }
    public String mostrarNotas(){
        String todasNotas = "";
        int contadorParcial = 1;
        for(double elemento : notas) {
            todasNotas += ("Parcial " + contadorParcial + " : " + elemento + "\n");
        }
        return todasNotas;
    }
    //Constructores
    public Alumno(){}
    public Alumno(String nombreCompleto, int parciales) {
        this.nombreCompleto = nombreCompleto;
        this.parciales = parciales;
        for (int i=0; i<=notas.length;i++) {
            this.notas[i] = notas[i];
        }
    }
    //Getters y Setters


    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    public int getParciales() {
        return parciales;
    }

    public void setParciales(int parciales) {
        this.parciales = parciales;
    }

    public double[] getNotas() {
        return notas;
    }

    public void setNotas(double[] notas) {
        this.notas = notas;
    }

    public double getNotaFinal() {
        return notaFinal;
    }

    public void setNotaFinal(double notaFinal) {
        this.notaFinal = notaFinal;
    }
}
