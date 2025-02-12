public class POO {
    public static void main(String[] args) throws Exception {

        persona p1 =  new persona();{
            p1.nombre = "Miguel";
            p1.apellido = "Morales";
            p1.edad = 18;

            //Metodo Normal
            System.out.println(p1.darNombreCompleto()); 
            //Metodo con Variable
            System.out.println(p1.saludar("Morales"));
            


        }
        

    }
}
