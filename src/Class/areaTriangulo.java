package Class;

import java.util.Scanner;


public class areaTriangulo{
    public void calculoArea(){
        Scanner sc = new Scanner(System.in);


        float base, haltura, area;

        System.out.println("Digite la medida de la base del trinagulo: ");
        base = sc.nextFloat();
        System.out.println("Digite la altura del triangulo");
        haltura = sc.nextFloat();

        area=base*haltura/2;

        System.out.println("El Area de su triangul el = " +area);

        menu m = new menu();
        String fin = sc.nextLine();
        if (fin.equals("fin") || fin.equals("FIN") || fin.equals("Fin")){
            m.primerMenu();
        }


    }
}
