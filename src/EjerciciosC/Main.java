package EjerciciosC;

public class Main {
  public static void main(String[] args) throws IllegalArgumentException {
    PrecioBoleta preciosCine = new PrecioCine();
    int cantidadBoletas = 500;
    double precio = preciosCine.calcularPrecio(cantidadBoletas);
    System.out.println("El precio total por " + cantidadBoletas + " boletas es: " + precio);
  }
}
