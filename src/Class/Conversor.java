package Class;

import java.util.Scanner;

public class Conversor {

    public void FaC (){
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite el numero que desea convertir de Fahrenheit (°F) a grados Celsius (°C): ");
        int F = sc.nextInt();

        int C = (F - 32)*5/9;

        System.out.println("Equivale a " +C+ "°C");

        menu m = new menu();
        String fin = sc.nextLine();
        if (fin.equals("fin") || fin.equals("FIN") || fin.equals("Fin")){
            m.primerMenu();
        }
    }
}
