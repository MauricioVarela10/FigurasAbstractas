// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Menu menu =  new Menu();
        Triangulo triangulo = new Triangulo();
        Circulo circulo = new Circulo();
        Cuadrado cuadrado = new Cuadrado();
        System.out.println("Bienvenido");
        boolean opcionsalir=true;
        do {
            char opcion = menu.memuPrincipal();
            switch (opcion) {
                case 'a':
                    triangulo.ingresarLado();
                    triangulo.calcularPerimetro();
                    triangulo.calcularArea();
                    break;
                case 'b':
                    cuadrado.ingresarLado();
                    cuadrado.calcularPerimetro();
                    cuadrado.calcularArea();
                    break;
                case 'c':
                    circulo.ingresarDato();
                    circulo.calcularPerimetro();
                    circulo.calcularArea();
                    break;
                default:
                    opcionsalir=false;
                    break;
            }
        }while (opcionsalir);
    }
}