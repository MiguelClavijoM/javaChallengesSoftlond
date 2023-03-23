package Taller;
public class CalcularRaiz {
  public static void CalcularRaiz(double num) {
    try{
      double result = Math.sqrt(num);
      if(num < 0){
        throw new ArithmeticException("No se puede ejecutar porque el resultado es negativo");
      }
    } catch (ArithmeticException e) {
      throw new RuntimeException(e);
    }
  }
}
