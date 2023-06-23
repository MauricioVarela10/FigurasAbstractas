import java.util.Scanner;

public class Cuadrado extends Figura{

    double l;
    @Override
    public double calcularPerimetro() {
        double perimetro = l*4;
        System.out.println("El perimetro de cuadrado es: "+perimetro);
        return perimetro;
    }

    @Override
    public double calcularArea() {
        double area=Math.pow(l,2);
        System.out.println("El area del cuadrado es: "+area);
        return area;
    }

    public void ingresarLado(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el lado del cuadrado: ");
        l= sc.nextDouble();
    }

}
