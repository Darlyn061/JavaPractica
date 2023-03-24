package Class;

import java.util.Scanner;

public class numeroPrimo {

    public void esPrimo(){
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite el  numero que desea saber si es primo: ");
        int numero = sc.nextInt();
        int suma = 0;

        for (int i=1; i<=numero; i++){
            int auxiliar = numero%i;

            if (auxiliar == 0){
                suma = suma+1;
            }
        }

        if (suma >= 2){
            System.out.println("es primo");
        }else {
            System.out.println("no es primo");
        }

        menu m = new menu();
        String fin = sc.nextLine();
        if (fin.equals("fin") || fin.equals("FIN") || fin.equals("Fin")){
            m.primerMenu();
        }

    }
}
