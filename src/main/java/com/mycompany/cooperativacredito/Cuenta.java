package com.mycompany.cooperativacredito;

public class Cuenta {
    //Atributos
    public int identificador;
    public double saldo; 
    public Tipocuenta tipoCuenta; 
    //Constructores

    public Cuenta(int identificador, double saldo, Tipocuenta tipoCuenta) {
        this.identificador = identificador;
        this.saldo = saldo;
        this.tipoCuenta = tipoCuenta;
    }
   
    //Metodos 
    public void cuentaA (int identificador, double saldo, Tipocuenta tipoCuenta){
        System.out.println("Numero de cuenta: "+ identificador);
        System.out.println("Saldo actual: "+ saldo);
        System.out.println("Tipo de cuenta"+ Tipocuenta.AHORRO);
        
    }
    public void cuentaC (int identificador, double saldo, Tipocuenta tipoCuenta){
        System.out.println("Numero de cuenta: "+ identificador);
        System.out.println("Saldo actual: "+ saldo);
        System.out.println("Tipo de cuenta"+ Tipocuenta.CORRIENTE);
      
    }
    public void imprimirCuenta (boolean valor){
        if (valor){
            cuentaA (identificador, saldo, tipoCuenta);
        } else {
            cuentaC (identificador, saldo, tipoCuenta);
        }
    }
    
    
}
