package com.mycompany.cooperativacredito;

public class Persona {
    //Atributos
    public String nombre; 
    public int Id; 
    public String email; 
    
    
    //Metodos
    public void Persona (String nombre, int Id, String email){
        System.out.println("...............Persona afiliada............");
        System.out.println("Nombre completo: "+ nombre);
        System.out.println("Identificacion: "+ Id);
        System.out.println("Email: "+ email);
        System.out.println("---------------------");
    }
    public void PersonaAsociada (String nombre, int Id, String email){
        System.out.println("............Persona Asociada..........");
        System.out.println("Nombre completo: "+ nombre);
        System.out.println("Identificador: "+ Id);
        System.out.println("Email: "+email);
        
    }
    public void imprimirPersona (){
        Persona("Ander", 220032456, "ander.espoch.edu.ec");
        }
    public void imprimirAsociada (){
        PersonaAsociada ("Josue", 200032457, "josue.espoch.edu.ec");
    }    
    
    
    
    
}
