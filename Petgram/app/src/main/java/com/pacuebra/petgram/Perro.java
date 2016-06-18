package com.pacuebra.petgram;

/**
 * Created by Francisco on 14/06/2016.
 */
public class Perro {
    private String nombre;
    private int foto;

    public Perro (int foto,String nombre){
        this.nombre = nombre;
        this.foto = foto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getFoto() {
        return foto;
    }

    public void setFoto(int foto) {
        this.foto = foto;
    }
}
