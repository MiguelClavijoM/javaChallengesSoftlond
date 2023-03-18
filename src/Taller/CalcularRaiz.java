package Taller;
public class CalcularRaiz {
  public static void CalcularRaiz(double num) {
    try{
      double result = Math.sqrt(num);
      if(num < 0){
        throw new ArithmeticException("Can't run it because the result is negative");
      }
    } catch (ArithmeticException e) {
      throw new RuntimeException(e);
    }
  }
}
