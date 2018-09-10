/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programmingassignment1a1;

import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author Andres
 */
public class Recorridos {
    private String fecha;
    private ArrayList<Vagon> wagons;
    private ArrayList<Reserva> reserva;
    private int cupos;
    private int ocupados;

    public Recorridos(String fecha, ArrayList<Vagon> wagons, ArrayList<Reserva> reserva) {
        this.fecha = fecha;
        this.wagons = new ArrayList<>();;
        this.reserva = new ArrayList<>();
        this.cupos = 0;
        this.ocupados = 0;
    }

    public int getOcupados() {
        return ocupados;
    }

    //verfica que no se salga del limite de asientos
    public void setOcupados(int ocupados) {
        if(ocupados<getCupos()){
        this.ocupados = ocupados;
        setCupos(getCupos()-ocupados);}
    }

    public int getCupos() {
        return cupos;
    }

    public void setCupos(int cupos) {
        this.cupos = cupos;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public ArrayList<Vagon> getWagons() {
        return wagons;
    }

    public void setWagons(ArrayList<Vagon> wagons) {
        this.wagons = wagons;
    }

    public ArrayList<Reserva> getReserva() {
        return reserva;
    }

    public void setReserva(ArrayList<Reserva> reserva) {
        this.reserva = reserva;
    }
    
    public boolean nuevaReserva(Reserva r){
        return this.reserva.add(r);
    }
    
    public boolean nuevoVagon(Vagon v){
        return this.wagons.add(v);
    }

    @Override
    public String toString() {
        String imprime ="";
        imprime += "Ride Status" + "\n" + "DATE: " + fecha + "\n";
        for (Vagon r : this.wagons) {
        imprime +="WAGON " + wagons.toString() + ". Occupied: " + ocupados + " Available: " + (this.cupos) + "\n" + "Bookings = " + reserva.toString()+ "\n";
        }
        return imprime;
    }

    
}
