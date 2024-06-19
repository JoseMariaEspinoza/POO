package core.networks.modelo;

public class Usuario {
    //1. Atributos
    private String usuario;
    private String contrasena;
    private String nombre;
    private String direccion;
    //2. Metodos
    public String mostrarInformacion(){
        return "Usuario: " + usuario + "  Contraseña: " + contrasena +
                "  Nombre: " + nombre + "  Direccion: " + direccion;
    }
    //3. Constructores
    //Constructor vacío
    public Usuario(){}
    //Contructor
    public Usuario(String usuario,String contrasena, String nombre, String direccion){
        this.usuario = usuario;
        this.contrasena = contrasena;
        this.nombre = nombre;
        this.direccion = direccion;
    }
    //4. Setters y Getters
    //Setters
    public void setUsuario(String usuario){
        this.usuario = usuario;
    }
    public void setContrasena(String contrasena){
        this.contrasena = contrasena;
    }
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public void setDireccion(String direccion){
        this.direccion = direccion;
    }
    //Getters
    public String getUsuario(){
        return usuario;
    }
    public String getContrasena(){
        return contrasena;
    }
    public String getNombre(){
        return nombre;
    }
    public String getDireccion(){
        return direccion;
    }

}


