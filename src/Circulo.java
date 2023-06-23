import java.util.Scanner;

public class Circulo extends Figura{
double puntoCentralx;
double puntoCentraly;
double  r;
    @Override
    public double calcularPerimetro() {
        double perimetro =2*Math.PI*r;
        System.out.println("El perimetro es: "+perimetro);
        return perimetro;
    }

    @Override
    public double calcularArea() {
        double area=Math.PI*Math.pow(r,2);
        System.out.println("El Area es: "+area);
        return area;
    }
    public void ingresarDato(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el punto central del circulo en x: ");
        puntoCentralx= sc.nextDouble();
        System.out.println("Ingrese el punto central del circulo en y: ");
        puntoCentraly= sc.nextDouble();
        System.out.println("Ingrese el radio del ciculo: ");
        r= sc.nextDouble();
    }
}
