public class Main {
    public static void main(String[] args) {

        //Utiliza los gets y sets para darle valores a las propiedades edad, nombre y telefono, 
        //por último muéstralas por consola.

        Persona persona = new Persona();
        persona.setEdad(99);
        persona.setNombre("Pedro");
        persona.setTelefono("58964848");

        System.out.println(persona.getEdad());
        System.out.println(persona.getNombre());
        System.out.println(persona.getTelefono());



    }
}

//Crear clase Persona.
//Crear variables las privadas edad, nombre y telefono de la clase Persona.
//Crear gets y sets de cada propiedad.
//Crear un objeto persona en el main.
//Utiliza los gets y sets para darle valores a las propiedades edad, nombre y telefono, por último muéstralas por consola.

class Persona {
    
    private int edad;
    private String nombre;
    private String telefono;

    public int getEdad() {
        return edad;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getTelefono() {
        return telefono;
    }
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
}