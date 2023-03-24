package Class;

import java.util.Scanner;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class diasTranscurridos {

    public void calculoDias (){
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingresa una fecha en formato Ano-Mes-Dia 0000-00-00: ");
        String fechaUsuario = sc.nextLine();

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyy-MM-dd");
        LocalDate fecha = LocalDate.parse(fechaUsuario, formatter );

        LocalDate fechaActual = LocalDate.now();
        long diasTranscurridos = ChronoUnit.DAYS.between(fecha, fechaActual);

        System.out.println("Los Dias transcurridos: " + diasTranscurridos);

        menu m = new menu();
        String fin = sc.nextLine();
        if (fin.equals("fin") || fin.equals("FIN") || fin.equals("Fin")){
            m.primerMenu();
        }

    }


}
