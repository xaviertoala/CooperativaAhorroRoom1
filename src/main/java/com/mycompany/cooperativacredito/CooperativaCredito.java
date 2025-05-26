package com.mycompany.cooperativacredito;

public class CooperativaCredito {

    public static void main(String[] args) {
        Persona objHuman = new Persona ();
        objHuman.imprimirPersona();
        Cuenta obj = new Cuenta (220024, 800 , Tipocuenta.AHORRO);
        obj.imprimirCuenta(false);
        
    }
}
