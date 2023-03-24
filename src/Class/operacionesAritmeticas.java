package Class;

import java.util.Scanner;

public class operacionesAritmeticas {

    public void calculo(){
        Scanner sc = new Scanner(System.in);
        int num1, num2, total;

        System.out.println("Aritmetico");
        System.out.println("1--> Suma");
        System.out.println("2--> Resta");
        System.out.println("3--> Multiplicar");
        System.out.println("4--> Dividir");
        System.out.println("_________________________________");
        System.out.println("Elija una opcion: ");
        int num = sc.nextInt();

        switch (num) {
            case 1:
                System.out.println("Digite el primer numero a sumar: ");
                num1 = sc.nextInt();
                System.out.println("Digite segundo numero a sumar: ");
                num2 = sc.nextInt();

                total = num1 + num2;
                System.out.println("El resultado es= " +total);
                return;

            case 2:
                System.out.println("Digite el primer numero a restar: ");
                num1 = sc.nextInt();
                System.out.println("Digite segundo numero a restar: ");
                num2 = sc.nextInt();

                total = num1 - num2;
                System.out.println("El resultado es= " +total);
                return;

            case 3:
                System.out.println("Digite el primer numero a multiplicar: ");
                num1 = sc.nextInt();
                System.out.println("Digite segundo numero a multiplicar: ");
                num2 = sc.nextInt();

                total = num1 * num2;

                System.out.println("El resultado es= " +total);
                return;

            case 4:
                System.out.println("Digite el primer numero a dividir: ");
                num1 = sc.nextInt();
                System.out.println("Digite segundo numero a dividir: ");
                num2 = sc.nextInt();

                total = num1 / num2;
                System.out.println("El resultado es= " +total);
                return;
        }

        menu m = new menu();
        String fin = sc.nextLine();
        if (fin.equals("fin") || fin.equals("FIN") || fin.equals("Fin")){
            m.primerMenu();
        }

    }
}
