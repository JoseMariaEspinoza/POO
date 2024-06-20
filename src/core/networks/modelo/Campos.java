package core.networks.modelo;

public class Campos {
    //1. Atributos
    public int x;
    //2. Metodos
    public int muestra(){
        return x;
    }
    public int incrementa(){
        return ++x;
    }
    //3. Constructor

    public Campos(int x) {
        this.x = x;
    }
}
