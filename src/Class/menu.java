package Class;

import java.util.Scanner;


public class menu {
    public void primerMenu(){
        Scanner sc = new Scanner(System.in);

        numeroEntero ne = new numeroEntero();
        areaTriangulo at = new areaTriangulo();
        factorial f = new factorial();
        diasTranscurridos dt = new diasTranscurridos();
        promedioLista pl = new promedioLista();
        numeroPrimo np = new numeroPrimo();
        ordenLista ol = new ordenLista();
        operacionesAritmeticas op = new operacionesAritmeticas();
        Conversor c = new Conversor();
        aypCirculo apc = new aypCirculo();




        System.out.println("Para volver al menu digite fin al final de cada proceso");
        System.out.println("1- Sumar dos numero enteros.");
        System.out.println("2- Calcular el area de un triangulo.");
        System.out.println("3- Calcular el factorial de un numero.");
        System.out.println("4- Calcular el numero de dias trascurridos entre dos fechas.");
        System.out.println("5- El promedio de una lista de numeros.");
        System.out.println("6- Determinar si es un numero primo");
        System.out.println("7- Ordenar una lista de numeros");
        System.out.println("8- Realizar operaciones aritmeticas basicas.");
        System.out.println("9- convertir de celsius a fahrenheit.");
        System.out.println("0- Calcular el area y el perimetro de un circulo");

        System.out.println("Digite un numero para elejir: ");
        int num = sc.nextInt();

        switch (num) {
            case 1 -> ne.suma();
            case 2 -> at.calculoArea();
            case 3 -> f.calculoFactrial();
            case 4 -> dt.calculoDias();
            case 5 -> pl.calculoLista();
            case 6 -> np.esPrimo();
            case 7 -> ol.lista();
            case 8 -> op.calculo();
            case 9 -> c.FaC();
            case 10 -> apc.AreaPerimetro();
        }


    }
}
