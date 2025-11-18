package maquina;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Cafetera cafetera = new Cafetera(50);
        Azucarero azucar = new Azucarero(20); 
        Vasos p = new Vasos(5, 3);
        Vasos m = new Vasos(5, 5);
        Vasos g = new Vasos(5, 7);

        MaquinaDeCafe maquina = new MaquinaDeCafe(cafetera, azucar, p, m, g);

        Scanner sc = new Scanner(System.in);

        System.out.println("==== Máquina de Café ====");
        System.out.println("Seleccione el tamaño del vaso:");
        System.out.println("1. Pequeño (3 oz)");
        System.out.println("2. Mediano (5 oz)");
        System.out.println("3. Grande  (7 oz)");
        System.out.print("Opción: ");
        int opcion = sc.nextInt();

        String tamano = "";
        if (opcion == 1) tamano = "pequeno";
        else if (opcion == 2) tamano = "mediano";
        else if (opcion == 3) tamano = "grande";
        else {
            System.out.println("Opción inválida");
            sc.close();
            return;
        }

        System.out.print("Cantidad de azúcar: ");
        int cucharadas = sc.nextInt();

        String resultado = maquina.servirCafe(tamano, cucharadas);

        System.out.println("Resultado: " + resultado);
        sc.close();
    }
}
