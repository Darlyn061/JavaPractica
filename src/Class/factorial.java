package Class;

import com.sun.tools.javac.Main;

import java.util.Scanner;
public class factorial {
    Scanner sc = new Scanner(System.in);
    public void calculoFactrial(){
    int f = 1;

        System.out.println("Digite un numero para saber el factorial: ");
        int num = sc.nextInt();

        for (int i=1; i<=num; i++){
            f=f*i;
        }
        System.out.println("El factorial de " +num+ ", es= " + f);


        menu m = new menu();
        String fin = sc.nextLine();
        if (fin.equals("fin") || fin.equals("FIN") || fin.equals("Fin")){
            m.primerMenu();
        }

    }
}
