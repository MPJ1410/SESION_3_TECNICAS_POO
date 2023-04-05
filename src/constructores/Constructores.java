/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package constructores;

/**
 *
 * @author MIKI
 */
public class Constructores {

    /**
     * @param args the command line arguments
     */
    /*
    public static void main(String[] args) {
        Persona persona = new Persona();
        Persona juanPersona = new Persona("juan",25);
        imprimir(persona.getTextoImprimir());
        imprimir(juanPersona.getTextoImprimir());
        
    }
    */
    public static void main(String[] args) {
        Empleado empleado = new Empleado("manuel",20,"finanzas");
        Empleado empleadoCopia = new Empleado(empleado);
        
        empleadoCopia.setDepartamento("ventas");
        
        imprimir(empleado.getTextoImprimir());
        
        imprimir(empleadoCopia.getTextoImprimir());
        
    }
    public static void imprimir(String texto){
        System.out.println(texto);
    }
    //ejemplo
    public static String convertirATexto(int entero){
        return String.valueOf(entero);
    }
}
