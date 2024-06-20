package core.networks.modelo;

import java.awt.geom.Area;

public class Areas {
    //1. Atributos
    private int lado;
    private int base;
    private int  altura;
    private int radio;
    //2.Metodos
    public double areaCirculo(){
        return Math.PI*Math.pow(radio,2);
    }
    public double areaRectangulo(){
        return base*altura;
    }
    //3. Constructor

    public Areas(int radio) {
        this.radio = radio;
    }

    public Areas(int base, int altura) {
        this.base = base;
        this.altura = altura;
    }
    //4. Getters y Setters

    public int getLado() {
        return lado;
    }

    public void setLado(int lado) {
        this.lado = lado;
    }

    public int getRadio() {
        return radio;
    }

    public void setRadio(int radio) {
        this.radio = radio;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public int getBase() {
        return base;
    }

    public void setBase(int base) {
        this.base = base;
    }
}
