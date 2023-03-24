package Class;

import java.util.ArrayList;
import java.util.Scanner;

public class ordenLista {

    public void lista(){
        Scanner sc = new Scanner(System.in);
        ArrayList<String> lista = new ArrayList<String>();
        String Nlista;
        System.out.println("Lista");

        do {
            System.out.println("introduzca lo que desea agregar a la lista: ");
           Nlista = sc.nextLine();

            if (!Nlista.equals("fin")){
                lista.add(Nlista);
            }
        }while (!Nlista.equals("fin"));

        System.out.println("Listado");
        for (String elem : lista){
            System.out.println(elem);
        }

        menu m = new menu();
        String fin = sc.nextLine();
        if (fin.equals("fin") || fin.equals("FIN") || fin.equals("Fin")){
            m.primerMenu();
        }



    }
}
