public class VariablesYMas {
    public static void main(String[] args) throws Exception {
        
        //variables java
        int numero = 18;
        boolean falsoVerdadero = true;
        char caracter = 'a';  //si o si en coma simple
        String texto = "helo world";
        double decimal = 1.123456789012345; //15 decimales
        float decimal2 = 1.123456f; //6 decimales y si o si termina con una f

        //numeros de caracteres de un texto 

        int longitud = texto.length();


        //seleccionar una letra 

        char letra = texto.charAt(5);

        //seleccionar una parte del texto

        String subTexto = texto.substring(5, 10);

        //remplazar texto

        String remplazar = texto.replace("helo", "Bye");

        //buscar texto 

        boolean contiene = texto.contains("helo");

        //matrises o arreglos

        int[] numeros = {1,10,100,1000,10000};

        for (int index = 0; index < numeros.length; index++) {
            System.out.println(numeros[index]);
        }
    }
}