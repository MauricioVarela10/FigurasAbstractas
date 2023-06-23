import java.util.Scanner;

public class Menu {
    public Menu() {
    }
    public char memuPrincipal(){
        char opcion;
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese la opción que desea realizar");
        System.out.println("a. TRIANGULO");
        System.out.println("b. CUADRADO");
        System.out.println("c. CIRCULO");
        System.out.println("d. SALIR");
        opcion = sc.next().charAt(0);
        return opcion;
    }

}
