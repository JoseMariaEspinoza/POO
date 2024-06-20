package core.networks.presentacion;

import core.networks.modelo.Saludo;

public class MainSaludo {
    public static void main(String[] args) {
        //Instanciar saludo
        Saludo s1 = new Saludo();
        System.out.println(s1.saludar());
    }
}
