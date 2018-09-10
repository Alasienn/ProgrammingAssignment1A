/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programmingassignment1a1;

import java.util.Iterator;

/**
 *
 * @author Andres
 */
public class Cliente {
    private int identificacion;
    private String nombre;

    public Cliente(int identificacion, String nombre) {
        this.identificacion = identificacion;
        this.nombre = nombre;
    }

    public int getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(int identificacion) {
        this.identificacion = identificacion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        String aux= nombre;
        return aux;
    }
    
    
}
