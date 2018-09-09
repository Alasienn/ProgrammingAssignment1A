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
        Reserva pru = new Reserva("1A", null);
        pru.newCliente(12345, "Pepito2");
        pru.newCliente2(cli);

        Vagon prueba = new Vagon(5, 10);
        
        Recorridos rec = new Recorridos("hoy", null, null);
        rec.nuevaReserva(pru);
        rec.nuevoVagon(prueba);
        pru.setTamano();
        rec.setCupos(prueba.getCupos());
        rec.setOcupados(pru.getTamano());
        System.out.println(rec.toString());




    }
    
}
