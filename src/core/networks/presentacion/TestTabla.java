package core.networks.presentacion;

import core.networks.modelo.Tablas;

public class TestTabla {
    public static void main(String[] args) {
        Tablas num = new Tablas(7);
        System.out.println(num.mostrarTabla());
    }
}
