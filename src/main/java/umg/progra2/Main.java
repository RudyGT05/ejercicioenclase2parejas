package umg.progra2;

import umg.progra2.PKG_GRUPO1.PKG_GRUPO1;
import umg.progra2.PKG_GRUPO2.PKG_GRUPO2;
import umg.progra2.PKG_GRUPO3.PKG_GRUPO3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int opcion;
        Scanner sc = new Scanner(System.in);
        PKG_GRUPO1 cone = new PKG_GRUPO1();
        PKG_GRUPO2 cone2 = new PKG_GRUPO2();
        PKG_GRUPO3 cone3 = new PKG_GRUPO3();
        System.out.println("Bienvenido a nuestro programa, elige la opcion que deseas");
        System.out.println("1.Circunferencia");
        System.out.println("2.Area Triangulo");
        System.out.println("3.Area Paralelograma");
        System.out.println("4.Salir");
        opcion = sc.nextInt();

        switch (opcion)
        {
            case 1: cone.circuferencia();
            break;
            case 2: cone2.areatriangulo();
            break;
            case 3: cone3.areaparalelograma();
            break;
            case 4: System.exit(0);
            default:
                System.out.println("Te cuesta, elige una opcion valida");
                break;
        }

    }
}
