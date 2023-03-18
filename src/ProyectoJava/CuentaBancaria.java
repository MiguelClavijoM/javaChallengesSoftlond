package ProyectoJava;

public class CuentaBancaria {
  float saldo;
  int startnumConsignaciones = 0;
  int numRetiros = 0;
  float tasaAnual;
  float comisionMensual = 0;

  public CuentaBancaria(float saldo, float tasaAnual) {
    this.saldo = saldo;
    this.tasaAnual = tasaAnual;
  }

  public void consignacion(int num){
    saldo = saldo+num;
    System.out.println("Usted consignó: "+ num + ", saldo : "+ saldo);
  }

  public void retiro(int num) {
    if (num > saldo) {
      System.out.println("Puede retirar maximo "+ saldo);
    } else {
      saldo = saldo - num;
      System.out.println("Usted retiró: " + num + ", saldo: " +saldo);
    }
  }

  public float interesMensual(){
    float tasaMensual = tasaAnual / 12;
    float interes = saldo * tasaMensual;
    return interes;
  }
  public void extractoMensual(){
    float interes = interesMensual();
    saldo = saldo - interes;
    System.out.println("Saldo final : " +saldo);
  }

  public void valores(){
    System.out.println("La tasa anual: "+tasaAnual);
    System.out.println("El saldo inicial: "+saldo);
  }

  }


