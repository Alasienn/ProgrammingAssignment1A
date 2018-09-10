/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programmingassignment1a1;

import java.util.ArrayList;

/**
 *
 * @author enter
 */
public class Gestion {
    private ArrayList<Recorridos> recor;

    public Gestion(ArrayList<Recorridos> recor) {
        this.recor = new ArrayList<>();
    }

    public ArrayList<Recorridos> getRecor() {
        return recor;
    }

    public void setRecor(ArrayList<Recorridos> recor) {
        this.recor = recor;
    }
    public boolean newRecor(Recorridos r) {
        return this.recor.add(r);
    }

    @Override
    public String toString() {
        String aux ="";
        for (Recorridos r : this.recor) {
            aux += recor+ " \n";
        }
        return aux;
    }

}
