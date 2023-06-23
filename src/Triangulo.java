import java.util.Scanner;

public class Triangulo extends Figura{
    double l1;
    int l1x;
    int l1y;
    double l2;
    int l2x;
    int l2y;
    double l3;
    int l3x;
    int l3y;

    @Override
    public double calcularPerimetro() {
        l1 = calcularDistancia(l1x,l1y);
        l2 = calcularDistancia(l2x,l2y);
        l3 = calcularDistancia(l3x,l3y);
        double perimetro=l1+l2+l3;
        System.out.println("El perimetro del triangulo es: "+perimetro);
        return perimetro;
    }

    @Override
    public double calcularArea() {
        double s=calcularPerimetro()/2;
        double area = Math.sqrt(s*(s-l1)*(s-l2)*(s-l3));
        System.out.println("El area del triangulo es: "+area);
        return area;
    }
    public void ingresarLado(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el primer punto del triangulo: ");
        l1x= sc.nextInt();
        l1y= sc.nextInt();
        listaPuntos.add(new Punto(l1x,l1y,0));
        System.out.println("Ingrese el segundo punto del triangulo: ");
        l2x= sc.nextInt();
        l2y= sc.nextInt();
        listaPuntos.add((new Punto(l2x,l2y,0)));
        System.out.println("Ingrese el tercer punto del triangulo: ");
        l3x= sc.nextInt();
        l3y= sc.nextInt();
        listaPuntos.add(new Punto(l3x,l3y,0));
    }
}
