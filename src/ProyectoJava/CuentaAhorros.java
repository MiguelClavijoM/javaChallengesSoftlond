package ProyectoJava;

public class CuentaAhorros extends CuentaBancaria{
  boolean estado;

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
    }
    }
  }

