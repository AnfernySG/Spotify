/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package spotify;

/**
 *
 * @author USUARIO
 */
public class Canciones {
    private int idCancion;
    private String titulo;
    private String autor;
    private String duracion;
    private String anioCreacion;

    public Canciones() {
    }
    
    
    public Canciones(int idCancion,String titulo,String autor, String duracion, String anioCreacion){
        this.autor=autor;
        this.anioCreacion=anioCreacion;
        this.duracion=duracion;
        this.idCancion=idCancion;
        this.titulo=titulo;
    }

    @Override
    public String toString() {
        return "Canciones{" + "idCancion=" + idCancion + ", titulo=" + titulo + ", autor=" + autor + ", duracion=" + duracion + ", anioCreacion=" + anioCreacion + '}';
    }
    
    

    public int getIdCancion() {
        return idCancion;
    }

    public void setIdCancion(int idCancion) {
        this.idCancion = idCancion;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getDuracion() {
        return duracion;
    }

    public void setDuracion(String duracion) {
        this.duracion = duracion;
    }

    public String getAnioCreacion() {
        return anioCreacion;
    }

    public void setAnioCreacion(String anioCreacion) {
        this.anioCreacion = anioCreacion;
    }
    
    
    
    
    
}
