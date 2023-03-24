package Class;

import java.util.Scanner;

public class aypCirculo {

    public void AreaPerimetro(){
        Scanner sc = new Scanner(System.in);
        double Area, peri;
        double pi = Math.PI;

        System.out.println("Digite el radio del circulo para calcular el Area y el Perimetro");
        double radio = sc.nextDouble();

        Area= pi * radio * radio;

        System.out.println("El Area de tu circulo es= "+Area);

        peri= 2*pi*radio;

        System.out.println("El perimetro de tu circulo es= "+peri);

        menu m = new menu();
        String fin = sc.nextLine();
        if (fin.equals("fin") || fin.equals("FIN") || fin.equals("Fin")){
            m.primerMenu();
        }

    }
}
