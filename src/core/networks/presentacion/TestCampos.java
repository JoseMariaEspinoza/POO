package core.networks.presentacion;

import core.networks.modelo.Campos;

public class TestCampos {
    public static void main(String[] args) {
        //Instanciar
        Campos c1 = new Campos(10);
        System.out.println(c1.incrementa());
        System.out.println(c1.muestra());
    }
}
