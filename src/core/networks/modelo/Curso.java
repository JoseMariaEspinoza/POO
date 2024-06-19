package core.networks.modelo;

import java.util.Scanner;

public class Curso {
    //1. Atributos
    public String nombre;
    public String contenido;
    public String requisitos;
    public float duracion;
    public double precio;
    public int idCurso;
    public String modalidad;
    public String tipoCurso;

    //2. Metódos
    public Curso[] mostrarCurso(String tipoCurso,String modalidad){
        return new Curso[6];
    }
    public void solicitarCriteriosBusqueda(){
        System.out.println("Mandamos llamar a l capa presentación");
    }
    public  String mostrarInformacion(){
        return "ID Curso : " + idCurso + " nombre : " + nombre +
                " contenido " + contenido + " requisitos: " + "duración: " + duracion +
                " modalidad : " + modalidad + " Tipo curso : " + tipoCurso;
    }
    //3. Constructores
    //Sobrecarga de constructores
    //Constructor vacío
    public Curso(){

    }
    //Constructor
    public Curso(int idCurso, String nombre, double precio, float duracion){
        this.idCurso = idCurso;
        this.nombre = nombre;
        this.precio = precio;
        this.duracion = duracion;
    }
}
