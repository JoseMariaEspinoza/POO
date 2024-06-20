package core.networks.presentacion;

import core.networks.modelo.Animal;
import org.w3c.dom.ls.LSOutput;

public class TestAnimal {
    public static void main(String[] args) {
        //Instanciar
        Animal perro = new Animal("perro",4,false,100);
        Animal pez = new Animal("pez",0,false,5);
        Animal cocodrilo = new Animal("cocodrilo",5,false,250);
        System.out.println(cocodrilo.Moverse());
        System.out.println(perro.Comer());
        System.out.println(perro.sonidoEmitido());
    }
}
