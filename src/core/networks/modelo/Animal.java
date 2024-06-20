package core.networks.modelo;

public class Animal {
    //1. Atributos
    private String tipo;
    private int numExtremidades;
    private boolean vuelan;
    private float tamano;
    //2. Metodo
    public String Moverse(){
        return switch(tipo){
            case "perro" -> "Camina";
            case "pez" -> "Nada";
            case "cocodrilo" -> "Repta";
            default -> "";
        };
    }
    public String Comer(){
        return "Está comiendo";
    }
    public String sonidoEmitido(){
        return switch(tipo) {
            case "perro" -> "Ladra";
            case "pez" -> "GluGlu";
            case "cocodrilo" -> "Gruñe";
            default -> "";
        };
    }
    //3. Constructor
    public Animal(String tipo, int numExtremidades, boolean vuelan, float tamano) {
        this.tipo = tipo;
        this.numExtremidades = numExtremidades;
        this.vuelan = vuelan;
        this.tamano = tamano;
    }
    //4. Getters y Setters

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getNumExtremidades() {
        return numExtremidades;
    }

    public void setNumExtremidades(int numExtremidades) {
        this.numExtremidades = numExtremidades;
    }

    public boolean isVuelan() {
        return vuelan;
    }

    public void setVuelan(boolean vuelan) {
        this.vuelan = vuelan;
    }

    public float getTamano() {
        return tamano;
    }

    public void setTamano(float tamano) {
        this.tamano = tamano;
    }
}
