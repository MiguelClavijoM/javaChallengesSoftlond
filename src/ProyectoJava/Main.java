package ProyectoJava;

public class Main {
  public static void main(String[] args) {
    //PUNTO #1
//    Factura factura0 = new Factura(5000, "Miguel", "Jorge");
//
//    factura0.imprimirFactura();
//    System.out.println(factura0.valor);

    //PUNTO #2
    CuentaBancaria cuenta0 = new CuentaBancaria(5000, 0.1f);

    cuenta0.valores();
    cuenta0.retiro(1000);
    cuenta0.consignacion(500);
    cuenta0.extractoMensual();
    cuenta0.interesMensual();


  }
}
