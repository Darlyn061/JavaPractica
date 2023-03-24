package Class;

import java.util.Scanner;



public class numeroEntero{
    public void suma(){


        Scanner sc = new Scanner(System.in);

        int num1, num2, total;

        System.out.println("Digite el primer numero: ");
        num1 = sc.nextInt();
        System.out.println("Digite el segundo numero: ");
        num2 = sc.nextInt();

        total=num1+num2;

        System.out.println("El resultado total de la suma de numeros enteros es= " +total);

        menu m = new menu();
        String fin = sc.nextLine();
        if (fin.equals("fin") || fin.equals("FIN") || fin.equals("Fin")){
            m.primerMenu();

        }

    }
}
