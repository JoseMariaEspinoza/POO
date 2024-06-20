package core.networks.modelo;

public class Tablas {
    //1. Atributos
    public int numero;
    //2. Metodos
    public String mostrarTabla(){
        int[] tabla = {1,2,3,4,5,6,7,8,9,10};
        String resultado="";
        for(int elemento : tabla){
            resultado += (numero + "*" + elemento + " : " + numero*elemento)+"\n";
        };
        return resultado;
    }
    //3. Constructor

    public Tablas(int numero) {
        this.numero = numero;
    }
}
