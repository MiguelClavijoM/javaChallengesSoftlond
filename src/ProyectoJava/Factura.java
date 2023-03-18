package ProyectoJava;

public class Factura extends Precio {
  String emisor;
  String cliente;

  public Factura(double valor, String emisor, String cliente) {
    super(valor);
    this.emisor = emisor;
    this.cliente = cliente;
  }

  public void imprimirFactura(){
    System.out.println("El valor de la factura es "+ valor);
    System.out.println("El cliente es: "+ cliente);
    System.out.println("El emisor es: " + emisor);
  }
}


