/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programmingassignment1a1;

import java.util.ArrayList;

/**
 *
 * @author Andres
 */
public class Reserva {
    private char id;
    private ArrayList<Cliente> cliente;

    public Reserva(char id, ArrayList<Cliente> cliente) {
        this.id = id;
        this.cliente = new ArrayList<>();
    }

    public char getId() {
        return id;
    }

    public void setId(char id) {
        this.id = id;
    }

    public ArrayList<Cliente> getCliente() {
        return cliente;
    }

    public void setCliente(ArrayList<Cliente> cliente) {
        this.cliente = cliente;
    }
    
    
}
