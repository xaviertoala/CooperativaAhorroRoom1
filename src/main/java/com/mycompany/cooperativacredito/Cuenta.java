package com.mycompany.cooperativacredito;

public class Cuenta {
    //Atributos
    public int identificador;
    public double saldo; 
    public Tipocuenta tipoCuenta; 
    public double depositarDinero; 
    public double retirarDinero;
    public double transferencia; 
    //Constructores
    public Cuenta(int identificador, double saldo, Tipocuenta tipoCuenta, double depositarDinero, double retirarDinero, double transferencia) {
        this.identificador = identificador;
        this.saldo = saldo;
        this.tipoCuenta = tipoCuenta;
        this.depositarDinero = depositarDinero;
        this.retirarDinero = retirarDinero;
        this.transferencia = transferencia; 
    }

    //Metodos 
    public void cuentaA (int identificador, double saldo, Tipocuenta tipoCuenta){
        System.out.println("Numero de cuenta: "+ identificador);
        System.out.println("Saldo actual: "+ saldo);
        System.out.println("Tipo de cuenta "+ Tipocuenta.AHORRO);
        System.out.println("....................................");
        
    }
    public void cuentaC (int identificador, double saldo, Tipocuenta tipoCuenta){
        System.out.println("Numero de cuenta: "+ identificador);
        System.out.println("Saldo actual: "+ saldo);
        System.out.println("Tipo de cuenta "+ Tipocuenta.CORRIENTE);
        System.out.println("....................................");
    }
    public void imprimirCuenta (boolean valor){
        if (valor){
            cuentaA (identificador, saldo, tipoCuenta);
        } else {
            cuentaC (identificador, saldo, tipoCuenta);
        }
 
    }
    public double depositarDinero (){
        return saldo + depositarDinero; 
    }
    public void imprimirDeposito (){
        //Saldo después del deposito
        System.out.println("Cuanto dinero desea depositar? "+"\n"+depositarDinero);
        System.out.println("Saldo actual: "+ depositarDinero ());
        System.out.println(" ");
    }
    //Retirar dinero
    public double retirarDinero (){
        return saldo-retirarDinero; 
    }
    public void imprimirRetiro (){
        System.out.println("Cuanto dinero desea retirar? "+"\n"+ retirarDinero);
        if (retirarDinero > saldo){
            System.out.println("Error: saldo insuficiente");
        } else {
            System.out.println("Saldo actual: "+retirarDinero ());
        }
        System.out.println(" ");
    }
    //CUENTA DOS 
    public void cuentaDos (){
        System.out.println("-----------------------");
        System.out.println("Numero de cuenta: "+ identificador);
        System.out.println("Saldo: "+ saldo);
        System.out.println("Tipo de cuenta: "+ tipoCuenta);
        System.out.println("_______________________________________");
    }
    public double transferencia (){
        return saldo - transferencia ; 
    }
    public void imprimirTransferencia (){
        System.out.println("Monto de dinero transferido a persona asociada: "+ transferencia);
        System.out.println("Saldo actual: "+transferencia ());
    }
    public double montoCuentaD (){
        return transferencia + saldo; 
    }
    public void montoCuendaDos (){
        System.out.println("-----------------------");
        System.out.println("Numero de cuenta: "+ identificador);
        System.out.println("Saldo: "+ montoCuentaD());
        System.out.println("Tipo de cuenta: "+ tipoCuenta);
        System.out.println("_______________________________________");
    }
}
