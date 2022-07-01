public class App {
    public static void main(String[] args) throws Exception {
    
    Persona miPersona = new Persona();

    miPersona.setNombre("Jonathan");
    miPersona.setEdad(26);
    miPersona.setTelefono(223344);

    System.out.println("Nombre: " + miPersona.getNombre());
    System.out.println("Edad: " + miPersona.getEdad());
    System.out.println("Telefono: " + miPersona.getTelefono());
    }
}
class Persona{
    private int edad;
    private String nombre;
    private int telefono;

    public void setEdad(int valor){
        this.edad = valor;
    }
    public int getEdad(){
        return this.edad;
    }
    public void setNombre(String valor){
        this.nombre = valor;
    }
    public String getNombre(){
        return this.nombre;
    }
    public void setTelefono(int valor){
        this.telefono = valor;
    }
    public int getTelefono(){
        return this.telefono;
    }
}
