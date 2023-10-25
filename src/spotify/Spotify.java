/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package spotify;

/**
 *
 * @author USUARIO
 */
public class Spotify {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Canciones nueva =new Canciones(1, "THRILLER", "Michael Jackson", "3MIN CON 22 SEGUNDOS", "1982");
        
        System.out.println(nueva.getIdCancion()+" , "+ nueva.getTitulo()+" , "+nueva.getAutor()+" , "+nueva.getDuracion()+" , "+nueva.getAnioCreacion());
        System.out.println(nueva.getClass());
        
        Canciones nueva1 =new Canciones();
        nueva1.setAnioCreacion("2020");
        nueva1.setAutor("Jeff");
        nueva1.setDuracion("5min");
        nueva1.setIdCancion(2);
        nueva1.setTitulo("The best");
        System.out.println(nueva1.toString());
        System.out.println(nueva1.getClass());
    }
    
}
