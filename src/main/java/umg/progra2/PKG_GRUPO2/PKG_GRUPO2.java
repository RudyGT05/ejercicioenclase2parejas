package umg.progra2.PKG_GRUPO2;

import java.util.Scanner;

public class PKG_GRUPO2 {
    public void areatriangulo()
    {
        Scanner sc = new Scanner(System.in);
        int base, altura, resultado;
        System.out.println("Ingresa la base del triangulo");
        base = sc.nextInt();
        System.out.println("Ingresa la altura del triangulo");
        altura = sc.nextInt();
        resultado = base*altura;
        System.out.println("El area es: " + resultado);
    }
}
