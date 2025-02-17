//Declaracion de una clase privada/ 
//accesible desde la misma clase(este archivo.java) 

//Encapsulamiento: Proteje los datos al evitar que se modifiquen directamente, 
//permite aplicar validaciones, modificar los atributos sin afectar los metodos.
//Se maneja atrasvez de dos comandos, getters y setters, se debe especificar 
//que tipo de encapsulamiento se usa. con /private /public /protected con la 
//asignacion de los atributos. el mas usado es private.

public class claseMascota {
    private String raza;
    private String subRaza;
    
    public claseMascota(String raza, String subRaza) {
        this.raza = raza;
        this.subRaza = subRaza;

    }

    // los getter son la configuracion para poder mostrar la informacion de las variables privadas 

    public String getRaza() {
        return raza;
    }

    public String getSubRaza() {
        return subRaza;
    }

    // Los setter son la configuracion para modificar la informacion de las variables 
    public void setRaza(String raza) {
        this.raza = raza;
    }

    public void setSubRaza(String subRaza) {
        this.subRaza = subRaza;
    }


    
}
