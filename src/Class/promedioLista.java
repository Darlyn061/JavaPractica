package Class;

import java.util.Scanner;

public class promedioLista {

    public void calculoLista(){
        Scanner sc = new Scanner(System.in);
        double notaT = 0;

        System.out.println("Digite la cantidad de numero de su lista: ");
        int numLista = sc.nextInt();

        for (int i = 1; i<numLista; i++ ){
            System.out.println("Djite la nota" +i+ " = ");
            int nota = sc.nextInt();
            notaT = nota + nota;
        }

        double total = notaT/numLista;
        System.out.println("El promedio de las notas es= "+total);

        menu m = new menu();
        String fin = sc.nextLine();
        if (fin.equals("fin") || fin.equals("FIN") || fin.equals("Fin")){
            m.primerMenu();
        }

    }
}
