public class POO {
    public static void main(String[] args) throws Exception {

        //objeto de una clase, en este caso, de clasePersona
        clasePersona persona1 = new clasePersona("Morales", "Parra", 20);

        // Instanciado sin constructor.
        // clasePersona persona = new clasePersona();
        // {
        //     // Asigna los valores
        //     persona1.nombre = "Miguel";
        //     persona1.apellido = "Morales";
        //     persona1.edad = 20;
        // }

        // Instanciado con constructor
        // clasePersona persona = new clasePersona("Morales", "Parra", 20);

        // Instancia o llama el metodo (metodo es un coprtamiento/funcion de la clase, )
        persona1.informacion();
        persona1.saludar();

        // Instancia de un metodo con parametro y retorno,
        // en este caso como se guarda el valor en una variable para poder concatenar
        double dinero = persona1.dineroTotal(1000, 234);
        System.out.println("Dinero restante: " + dinero);

        //sobrecarga de constructores (Explicacion en clasePersona)
        clasePersona persona2 = new clasePersona();
        clasePersona persona3 = new clasePersona("Miguel");

        persona2.informacion();
        persona3.informacion();

        //Encapsulamiento: Proteje los datos al evitar que se modifiquen directamente, 
        //permite aplicar validaciones, modificar los atributos sin afectar los metodos.
        //Se maneja atrasvez de dos comandos, getters y setters, se debe especificar 
        //que tipo de encapsulamiento se usa. con /private /public /protected con la 
        //asignacion de los atributos. el mas usado es private.
        claseMascota mascota1 = new claseMascota("perro","labrador");

        // acceder a los datos con getter 

        System.out.println("Raza: " + mascota1.getRaza());
        System.out.println("Tipo: " + mascota1.getSubRaza());

        // Modificar los datos con Setter

        mascota1.setRaza("gato");
        mascota1.setSubRaza("egipsio");

        System.out.println("Raza: " + mascota1.getRaza());
        System.out.println("Tipo: " + mascota1.getSubRaza());

        //La creacion e instanciacion de subclases con herencias en igual a las demas.

        claseEstudiante estudiante1 = new claseEstudiante("Maria", "Polania", 19, "Arquitectura");

        estudiante1.informacion();
        estudiante1.saludar();

        //al ser un Metodo de la clase y no del objeto se llama con la clase en este caso clasePersona
        System.out.println("Numero de personas totales: " + clasePersona.numeroPersonas());

        
        

    }
}
