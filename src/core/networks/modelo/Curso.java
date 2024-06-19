package core.networks.modelo;

public class Curso {
    //1. Atributos
    private String nombre;
    private String contenido;
    private String requisitos;
    private float duracion;
    private double precio;
    private int idCurso;
    private String modalidad;
    private String tipoCurso;
    //2. Metódos
    public Curso[] mostrarCurso(String tipoCurso,String modalidad){
        return new Curso[6];
    }
    public void solicitarCriteriosBusqueda(){
        System.out.println("Mandamos llamar a l capa presentación");
    }
    public  String mostrarInformacion(){
        return "ID Curso: " + idCurso + "  Nombre: " + nombre +
                "  Contenido: " + contenido + "  Requisitos: " + requisitos +
                "  Duración: " + duracion + "  Modalidad: " + modalidad +
                "  Tipo de Curso: " + tipoCurso;
    }
    //3. Constructores
    //Sobrecarga de constructores
    //Constructor vacío
    public Curso(){}
    //Constructor
    public Curso(int idCurso, String nombre, double precio, float duracion){
        this.idCurso = idCurso;
        this.nombre = nombre;
        this.precio = precio;
        this.duracion = duracion;
    }
    //4. setters y getters
    //Setters
    public void setIdCurso(int idCurso){
        this.idCurso = idCurso;
    }
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public void setPrecio(double precio){
        this.precio = precio;
    }
    public void setContenido(String contenido){
        this.contenido = contenido;
    }
    public void setRequisitos(String requisitos){
        this.requisitos = requisitos;
    }
    public void setModalidad(String modalidad){
        this.modalidad = modalidad;
    }
    public void setTipoCurso(String tipoCurso){
        this.tipoCurso = tipoCurso;
    }
    public void setDuracion(float duracion){
        this.duracion = duracion;
    }
    //Getters
    public int getIdCurso(){
        return idCurso;
    }
    public String getNombre(){
        return nombre;
    }
    public double getPrecio(){
        return precio;
    }
    public String getContenido(){
        return contenido;
    }
    public String getRequisitos(){
        return requisitos;
    }
    public String getModalidad(){
        return modalidad;
    }
    public String getTipoCurso(){
        return tipoCurso;
    }
    public float getDuracion(){
        return duracion;
    }
}
