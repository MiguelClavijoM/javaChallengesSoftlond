package EjerciciosC;

public class PrecioCine implements PrecioBoleta {
  @Override

  public double calcularPrecio(int cantidadBoletas) throws IllegalArgumentException {
    double precioTotal;

    if (cantidadBoletas >= 1 && cantidadBoletas <= 10) {
      precioTotal = cantidadBoletas * 10.0;
    } else if (cantidadBoletas >= 11 && cantidadBoletas <= 20) {
      precioTotal = cantidadBoletas * 9.0;
    } else if (cantidadBoletas >= 21 && cantidadBoletas <= 30) {
      precioTotal = cantidadBoletas * 8.0;
    } else if (cantidadBoletas > 30) {
      throw new IllegalArgumentException("No se pueden comprar más de 30 boletas");
    } else {
      throw new IllegalArgumentException("La cantidad de boletas debe ser mayor a cero");
    }

    return precioTotal;
  }
}
