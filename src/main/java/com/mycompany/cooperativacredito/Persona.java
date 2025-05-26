package com.mycompany.cooperativacredito;

public class Persona {
    //Atributos
    public String nombre; 
    public int Id; 
    public String email; 
    
    
    //Metodos
    public void Persona (String nombre, int id, String email){
        System.out.println("Nombre completo: "+ nombre);
        System.out.println("Identificacion: "+ id);
        System.out.println("Email: "+ email);
        System.out.println("---------------------");
    }
    /*public void PersonaD (String nombre){
        System.out.println("Nombre completo: "+ nombre);
    }*/
    public void imprimirPersona (){
        Persona("Ander", 220032456, "ander.espoch.edu.ec");
        
    }
    
    
    
}
