package umg.progra2.PKG_GRUPO3;

import java.util.Scanner;

public class PKG_GRUPO3 {

    public void areaparalelograma()
    {
        int basapara, alturapara, resultado;
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresa la base del paralelograma");
        basapara = sc.nextInt();
        System.out.println("Ingresa la altura del paralelograma");
        alturapara = sc.nextInt();
        resultado = basapara * alturapara;
        System.out.println("El resultado de la paralelograma es: " + resultado);

    }
}
