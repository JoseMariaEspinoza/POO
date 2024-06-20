package core.networks.modelo;

public class Empleado {
    //1. Atributos
    private int idEmpleado;
    private String nombre;
    private String dNi;
    private double sueldo;
    //2. Metodos
    public double calcularNomina(){
        return sueldo*0.85;
    }
    //3. Contructor

}
