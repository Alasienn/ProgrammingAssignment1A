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

    private String id;
    private ArrayList<Cliente> cliente;
    private int tamano;

    public Reserva(String id, ArrayList<Cliente> cliente) {
        this.id = id;
        this.cliente = new ArrayList<>();
        this.tamano =0;
    }

    public int getTamano() {
        return tamano;
    }

    public void setTamano() {
        int i = 0;
        for (Cliente c : this.cliente) {
            i = cliente.size();
        }
        this.tamano = i;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public ArrayList<Cliente> getCliente() {
        return cliente;
    }

    public void setCliente(ArrayList<Cliente> cliente) {
        this.cliente = cliente;
    }

    public boolean newCliente(int id, String name) {
        Cliente c = new Cliente(id, name);
        return this.cliente.add(c);
    }

    public boolean newCliente2(Cliente z) {
        return this.cliente.add(z);
    }

    @Override
    public String toString() {
        String i = "";
        for (Cliente c : this.cliente) {
            i += c.toString();
        }
        return i;
    }

}
