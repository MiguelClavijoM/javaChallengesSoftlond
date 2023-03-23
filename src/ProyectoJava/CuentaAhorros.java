package ProyectoJava;

public class CuentaAhorros extends CuentaBancaria{
  boolean estado;
  private int numRetiros = 0;
  private int numTransacciones = 0;
  private int numConsignaciones = 0;



  public CuentaAhorros(float saldo, float tasaAnual) {
    super(saldo, tasaAnual);
  }

  public boolean estado(){
    if(saldo > 10000){
      estado = true;

    }else {
      estado = false;

    }
    return estado;
  }
  @Override
  public void consignacion(int num){
  boolean estd = estado();
    if(estd == false){
      System.out.println("No se puede consignar a una cuenta inactiva");
    }else{
      super.consignacion(num);
      numConsignaciones ++;
    }
    }

  @Override
  public void retiro(int num) {
  boolean estd = estado();
  if (estd == false) {
    System.out.println("No se puede retirar dinero de una cuenta inactiva");
  }else {
    super.retiro(num);
    numRetiros ++;
  }
  }

  @Override
  public void extractoMensual() {
    if (numRetiros > 4) {
      saldo += 1000;
    } else {
      super.extractoMensual();
    }
    System.out.println(estado ? "La cuenta está activa" : "La cuenta no está activa");
  }

  public void imprimir(){
    System.out.println("Saldo: "+saldo+" Comisión Mensual: "+comisionMensual+ "Numero de transacciones: "+numTransacciones);
    System.out.println("La cantidad de consignacioes y retiros fue de: "+(numConsignaciones+numRetiros));
  }
}

