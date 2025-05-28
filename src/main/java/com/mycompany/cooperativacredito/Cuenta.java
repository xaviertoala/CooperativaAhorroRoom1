package com.mycompany.cooperativacredito;

public class Cuenta {
    //Atributos
    public int identificador;
    public double saldo; 
    public Tipocuenta tipoCuenta; 
    public double depositarDinero; 
    public double retirarDinero;
    public double transferencia; 
    public double saldoDos;
    public String cerrar; 
    //Constructores
    public Cuenta(int identificador, double saldo, Tipocuenta tipoCuenta, double depositarDinero, double retirarDinero, double transferencia) {
        this.identificador = identificador;
        this.saldo = saldo;
        this.tipoCuenta = tipoCuenta;
        this.depositarDinero = depositarDinero;
        this.retirarDinero = retirarDinero;
        this.transferencia = transferencia; 

    }
        public Cuenta (int identificador , Tipocuenta tipoCuenta, double depositarDinero, double retirarDinero, double transferencia,double saldoDos) {
        this.identificador = identificador;
        this.saldo = saldo;
        this.tipoCuenta = tipoCuenta;
        this.depositarDinero = depositarDinero;
        this.retirarDinero = retirarDinero;
        this.transferencia = transferencia; 
        this.saldoDos = saldoDos;
    }
        //Constructor CerrarSesion |null|
        public Cuenta (String cerrar){
            this.cerrar = cerrar; 
        }
    //Metodos CUENTA AFILIADA
    public void cuentaA (int identificador, double saldo, Tipocuenta tipoCuenta){
        System.out.println("Numero de cuenta: "+ identificador);
        System.out.println("Saldo actual: "+ saldo);
        System.out.println("Tipo de cuenta "+ Tipocuenta.AHORRO);
        
    }
    public void cuentaC (int identificador, double saldo, Tipocuenta tipoCuenta){
        System.out.println("Numero de cuenta: "+ identificador);
        System.out.println("Saldo actual: "+ saldo);
        System.out.println("Tipo de cuenta "+ Tipocuenta.CORRIENTE);

    }
    public void imprimirCuenta (boolean valor){
        if (valor){
            cuentaA (identificador, saldo, tipoCuenta);
        } else {
            cuentaC (identificador, saldo, tipoCuenta);
        }
 
    }
    //Metodo DEPOSITO DE DINERO CUENTA C
    public double depositarDinero (){
        return saldo + depositarDinero; 
    }
    public void imprimirDeposito (){
        //Saldo después del deposito
        System.out.println("Cuanto dinero desea depositar? "+"\n"+depositarDinero);
        System.out.println("Saldo actual: "+ depositarDinero ());
        System.out.println(" ");
    }
    
    //Metodo Deposito de dinero cuentaA
    public double depositarDineroA (){
        return saldoDos + depositarDinero ;
    }
    public void imprimirDepositoA (){
        //Saldo después del deposito
        System.out.println("Cuanto dinero desea depositar? "+"\n"+depositarDinero);
        System.out.println("Saldo actual: "+ depositarDineroA ());
        System.out.println(" ");
    }
    
    //Metodo RETIRAR DINERO CUENTA C
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
    
    //Metodo retirar dinero cuentaA
    public double retirarDineroA(){
        return saldoDos - retirarDinero ;
    }
    public void imprimirRetiroA(){
        System.out.println("Cuanto dinero desea retirar? "+"\n"+ retirarDinero);
        if (retirarDinero > saldoDos){
            System.out.println("Error: saldo insuficiente");
        } else {
            System.out.println("Saldo actual: "+retirarDineroA());
        }
        System.out.println(" ");
    }
    
    //Metodo CUENTA ASOCIADA  
    public void cuentaDos (){
        System.out.println("-----------------------");
        System.out.println("Numero de cuenta: "+ identificador);
        System.out.println("Saldo: "+ saldoDos);
        System.out.println("Tipo de cuenta: "+ tipoCuenta);
        System.out.println("_______________________________________");
        System.out.println(" ");
    }
    
    
    //Metodo TRANSFERENCIA CUENTA AFILIADA A CUENTA ASOCIADA
    public double transferencia (){
        return saldo - transferencia ; 
    }
    public void imprimirTransferencia (){
        System.out.println("Monto de dinero transferido a persona asociada: "+ transferencia);
        System.out.println("Saldo actual: "+transferencia ());
    }
    //Metodo CUENTA ASOCIADA CON TRANSFERENCIA DESDE CUENTA AFILIADA
    public double montoCuentaD (){
        return transferencia + saldoDos; 
    }
     public void montoCuendaDos (){
        System.out.println("-----------------------");
        System.out.println("Numero de cuenta: "+ identificador);
        System.out.println("Saldo: "+ montoCuentaD());
        System.out.println("Tipo de cuenta: "+ tipoCuenta);
        System.out.println("_______________________________________");
    }
     
     
    //Metodo Transferencia cuenta asociada a afiliada
    public double transferenciaAsociadoAfiliada(){
        return saldoDos - transferencia ;
    }
    public void imprimirTransferenciaAsociadoAfiliada (){
        System.out.println("Monto de dinero transferido a persona asociada: "+ transferencia);
        System.out.println("Saldo actual: "+transferenciaAsociadoAfiliada());
    }
    public double montoCuentaA (){
        return transferencia + saldo;
    }
    public void montoCuendaUno (){
        System.out.println("-----------------------");
        System.out.println("Numero de cuenta: "+ identificador);
        System.out.println("Saldo actual: "+ montoCuentaA ());
        System.out.println("Tipo de cuenta "+ Tipocuenta.AHORRO);
        System.out.println("_______________________________________");
    }
    public void cerrarsesion (){
        System.out.println("Desea cerrar la cuenta? (1-2)");
        System.out.println("1. Si");
        System.out.println("2. No");
    }
    public void cerrar (){
        System.out.println("Cuenta "+ cerrar+" cerrada exitosamente");
    }
    
   
}
