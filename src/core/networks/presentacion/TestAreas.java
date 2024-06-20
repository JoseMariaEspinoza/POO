package core.networks.presentacion;

import core.networks.modelo.Areas;

import java.sql.SQLOutput;

public class TestAreas {
    public static void main(String[] args) {
        Areas circulo = new Areas(5);
        Areas rectangulo = new Areas(10,20);
        System.out.println("El area del circulo con "
                + circulo.getRadio() + " de radio es : " + circulo.areaCirculo());
        System.out.println("El area del rectangulo con base " +rectangulo.getBase() +
                " y altura " + rectangulo.getAltura() + " es : " + rectangulo.areaRectangulo());
    }
}
