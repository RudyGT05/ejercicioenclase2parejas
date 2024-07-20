package umg.progra2.PKG_GRUPO1;

import java.util.Scanner;

public class PKG_GRUPO1
{
    int radio;
    double pi=Math.PI,resultado;
    Scanner scanner = new Scanner(System.in);
 public void circuferencia()
 {
     System.out.println("Ingresa el radio de tu circulo");
     radio = scanner.nextInt();
     resultado = 2*pi*radio;
     System.out.println("El resultado es: " + resultado);

 }


}
