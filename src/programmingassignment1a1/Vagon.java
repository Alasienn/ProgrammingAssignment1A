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
public class Vagon {
    private int num;
    private int cupos;
    private ArrayList<Reserva> reserva;

    public Vagon(int cupos) {
        this.num = num;
        this.cupos = cupos;
        this.reserva = new ArrayList<>();
    }
    
    public int cuporeserva(){
        int i = 0;
        for (Reserva r : this.reserva) {
            i = reserva.size();
        }
        return i;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public int getCupos() {
        return cupos;
    }

    public void setCupos(int cupos) {
        this.cupos = cupos;
    }

    public ArrayList<Reserva> getReserva() {
        return reserva;
    }

    public void setReserva(ArrayList<Reserva> reserva) {
        this.reserva = reserva;
    }
    
    public boolean newReserva(Reserva r){
        return this.reserva.add(r);
    }

    @Override
    public String toString() {
        String id =""+num;
        return id;
    }
    
    

}
