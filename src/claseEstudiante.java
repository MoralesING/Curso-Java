// las subclases se definen a las clases que heredaran atributos y metodos de otra clase. la cual se denominara clase padre
//                       Con extends se define de que clase heredara atributos.
public class claseEstudiante extends clasePersona {
    String carrera;
    //se instancia el constructor con todos los atributos, los heredados y los nuevos.
    public claseEstudiante(String nombre,String apellido,int edad,String carrera){
    //Con super se conectan los herdados, indicando que es de la superclase (clase padre)
        super.nombre = nombre;
        super.apellido = apellido;
        super.edad = edad;
    //los nuevos se conectan normalmente
        this.carrera = carrera;

    };

    public void informacion(){
        System.out.println(nombre + " " + apellido  + " de " + edad + " años de edad, estan en la carrera de " + carrera + ".");
    }

    public void saludar(){ 
        //Metodo heredado se llama tambien con el comando super
        super.saludar();
    
    }

    //La subclase tambien puede modificar o sobreescribir metodos heredados con @Override

    // @Override 
       //escribe el metodo igual.
    // public void dinero(){
    
       //escribe el nuevo comportamiento

    // }


}
