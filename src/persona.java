//clase(Plantilla: persona) 
public class persona {

    //Atributos (estado/caracteristicas de un objeto)
    String nombre;
    String apellido;
    int edad;
    String sexo;
    boolean enfermedad;
    String[] objetos;

    //Metodos (Comportaminetos de un objeto)

    //Metodo Normal
    public String darNombreCompleto(){ 
        return nombre + " " + apellido;
    
    }
    //Metodo con Variable
    public String saludar(String saludado) { 
         //Metodo con If 
        if (edad > 30) return "Hola querido " + saludado;

        return "¡Hola! " + saludado ;        
    }

    // Los atributos tambien pueden ser otra clases, 
    // y para sumarla a la primera clase en este caso persona 
    // primero tendra que instanciarla, asi: clase nombredelaclase = new clase;
    // y asignarle valor a los atributos de dicha clase como se hizo con los atributos
    // de la clase persona. para sumarse es asi: 
    // primeraClase.atributo(la clase que se asigno como atributo) = segundaClase;
    // para seleccionar algun atributo de la segunda clase se hace asi:
    // primeraClase.atributo(clase que se asigno como atributo).atributo(cualquier atributo de la segunda clase)
    

    

}
