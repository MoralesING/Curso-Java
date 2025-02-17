
//Declaracion de una clase predeterminada/ 
//accesible desde la misma clase(este archivo.java) y paquete. (src) 
public class clasePersona { 
    // Variables como Atributos 
    String nombre;
    String apellido; 
    int edad;
    //Atributos estaticos, son compartidos por todos los objetos. normalmente se necesita crear un
    //objeto para poder acceder a los atributos o metodos, los estaticos no, con llamar a la clase ya se pueden acceder
    //sin necesidad de crear un objeto, no se podran usar ni el this o super.
    static int contadorPersonas = 0;
    
    
    //Constructor, siempre lleva el mismo nombre de la clase.
    //                         variables como parametro 
    public clasePersona(String nombre,String apellido,int edad){
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        //En este caso cuenta cauntas personas vamos creando
        contadorPersonas++;
        /**El this indica que esta usando la variable que se declaro como atributo.
            se iguala al valor que recive la variable como parametro*/
    }

    //Sobrecarga de constructores: La sobrecarga de constructores es una 
    //caracteristica que permite instanciar un objeto sin necesidad de tener toda la informacion, 
    //Ejemplo

    //Constructor vasio                   
    public clasePersona(){                  
        this.nombre = "Desconocido";        
        this.apellido = "Desconocido";      
        this.edad = 0;                      
    }                                       
    //Constructor con solo un parametro
    public clasePersona(String nombre){
        this.nombre = nombre;
        this.apellido = "Desconocido";
        this.edad = 0;

    }

    //El manjear los demas constructores de la forma de arriba no es una buena practica de progrmacion
    //se recomienda usar el this() para tener un codigo mas lipio y legible. 

    //uso del this() para llamar otro constructores, esto sire para evitar tener codigo copiado
    //esto es la manera de hacer mas simple los constructores extra utilizando el codigo que ya tiene el principal

    public clasePersona(int edad){
        this("Desconido","Desconocido",0);
    }

    //Metodo basico/ un comportamiento

    public void informacion(){
        System.err.println(nombre + " " + apellido + " Tiene " + edad + " Años.");
    }

    public void saludar(){
        System.out.println("Hola " + nombre +" " + apellido + ", ¿Como estas?.");
    }

    //Metodo con Parametros y Retorno, parametros numericos.

    public double dineroTotal(double saldo,double deuda){
        return saldo - deuda;
    }

    //Metodo estatico

    public static int numeroPersonas(){
        return contadorPersonas;
    }

    
    


}