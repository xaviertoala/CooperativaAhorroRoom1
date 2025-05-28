package com.mycompany.cooperativacredito;
import java.util.Scanner; 
public class CooperativaCredito {

    public static void main(String[] args) {
        Scanner a = new Scanner (System.in);
        System.out.println("COOPERATIVA DE AHORRO Y CREDITO FuturoSeguro");
        Persona objHuman = new Persona ();
        System.out.println("_______________________________________");
        objHuman.imprimirPersona();
        
        Cuenta obj = new Cuenta (220024, /*saldo*/2000, Tipocuenta.AHORRO, /*depositar*/ 700,/*retirar*/ 2001,/*transferir*/ 100,150);
        obj.imprimirCuenta(true);
        objHuman.imprimirAsociada();
        
        Cuenta obj2 = new Cuenta (220025, 10, Tipocuenta.CORRIENTE, 700, 2001, 100,150);
        obj2.cuentaDos();
        
        //Eleccion de cuenta para alguna transaccion
        System.out.println("Con cual de las cuentas desea ingresar?");
        System.out.println("1.Afiliada");
        System.out.println("2.Asociada");
        int tipoOpcion = a.nextInt();
        switch(tipoOpcion){
            case 1:
                objHuman.imprimirPersona();
                obj.imprimirCuenta(true);                
                break;
            case 2:
                objHuman.imprimirAsociada();
                obj2.cuentaDos();
                break;
        }
       
        System.out.println("Desea hacer alguna transaccion?");    
        System.out.println("1. Deposito");
        System.out.println("2. Retiro");
        System.out.println("3. Transferencia");
        System.out.println("4. No");
        int opcion = a.nextInt ();
        //Saldo después del deposito
        switch (opcion){
            case 1: 
                if(tipoOpcion == 1){
                    obj.imprimirDeposito();
                }else {
                    obj.imprimirDepositoA();
                }
                break;
            case 2: 
                if(tipoOpcion == 1){
                   obj.imprimirRetiro (); 
                }else{
                   obj.imprimirRetiroA();
                }                
                break; 
            case 3: 
                 if(tipoOpcion == 1){
                    obj.imprimirTransferencia();
                    objHuman.imprimirAsociada();
                    obj2.montoCuendaDos();
                 }
                 else{
                    obj.imprimirTransferenciaAsociadoAfiliada();
                    objHuman.imprimirPersona();
                    obj.montoCuendaUno();
                 }
                break; 
                
        }
        
        
        
        
        
        
    }
}
