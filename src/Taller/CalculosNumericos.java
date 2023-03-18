package Taller;

public class CalculosNumericos {

  public static double calcularRaiz(double numero) throws ArithmeticException {
    if (numero < 0) {
      throw new ArithmeticException("No se puede calcular la raíz cuadrada de un número negativo ");
    }
    return Math.sqrt(numero);
  }
}
