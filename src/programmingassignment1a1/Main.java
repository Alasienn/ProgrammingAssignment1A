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
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Cliente cli = new Cliente(12345, "Pepe");
        Cliente cli2 = new Cliente(12346, "Pepito2");
        Reserva pru = new Reserva("A1", null);
        Reserva pru2 = new Reserva("A2", null);
        //pru.newCliente(12345, "Pepito2");
        pru.newCliente2(cli);
        pru.newCliente2(cli2);

        Vagon prueba = new Vagon(10);
        
        Recorridos rec = new Recorridos("hoy", null, null);
        rec.nuevaReserva(pru);
        rec.nuevaReserva(pru2);
        rec.nuevoVagon(prueba);
        pru.setTamano();
        rec.setCupos(prueba.getCupos());
        rec.setOcupados(pru.getTamano());
        System.out.println(rec.toString());




    }
    
}
