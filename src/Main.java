//Ejercicios tema 4 OpenBootCamp

public class Main {
    public static void main(String[] args) {

        //Variables

        int numeroIf = 10;
        int numeroWhile = 0;
        int numeroDoWhile = 2;
        var estacion = "Otoño";

        //Usando un if, crear una condición que compare si la variable numeroIf es positivo, negativo, o 0

        System.out.println("___________ Condicional If ___________");

        if (numeroIf > 0){
            System.out.println("El numero es positivo");
        } else if (numeroIf < 0) {
            System.out.println("El numero es negativo");
        } else {
            System.out.println("El numero es 0...");
        }


        /*
        Crea un bucle While, este bucle tendrá que tener como condición que la variable numeroWhile sea inferior a 3,
        el bloque de código que tendrá el bucle deberá:

        Incrementar el valor de la variable en uno cada vez que se ejecute.
        */

        System.out.println("___________ Bucle While ___________");

        while (numeroWhile < 3) {
            System.out.println(numeroWhile);
            numeroWhile++;
        }

        /*Para el bucle Do While, deberás crear la misma estructura que en el While,
          pero solo se debe ejecutar una vez.
         */

        System.out.println("___________ Bucle Do While ___________");

        do {
            System.out.println(numeroDoWhile);
            numeroDoWhile++;
        }while (numeroDoWhile > 3);


        /*
        Para el bucle For, crea una variable numeroFor, esta variable tendrá como valor 0 y su condición será que la
        variable sea igual o menor que 3, se irá incrementando en 1 su valor cada vez que se ejecute y deberá mostrarse
        por pantalla.
         */

        System.out.println("___________ Bucle For ___________");

        for (int numerofor = 0; numerofor <= 3; numerofor++) {
            System.out.println(numerofor);
        }



        /*
        Por último, para el Switch, deberás crear la variable estacion, y distintos case para las
        cuatro estaciones del año.
        Dependiendo del valor de la variable estacion se deberá mandar un mensaje por consola informando de la estación
        en la que está. También habrá que poner un default para cuando el valor de la variable no sea una estación.
         */

        System.out.println("___________ Bucle Switch ___________");

        switch (estacion) {
            case "Primavera":
                System.out.println("Es primavera");
                break;
            case "Verano":
                System.out.println("Es verano");
                break;
            case "Otoño":
                System.out.println("Es otoño");
                break;
            case "Invierno":
                System.out.println("Es invierno");
                break;

            default:
                System.out.println("Estamos en el mes de Octubre");

        }
    }
}