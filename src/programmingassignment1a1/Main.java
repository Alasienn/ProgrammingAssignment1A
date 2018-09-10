/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programmingassignment1a1;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Andres
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Clientes
        Cliente cli = new Cliente(12345, "Pepe");
        Cliente cli2 = new Cliente(12346, "Pepito2");

        //Reservas
        Reserva pru = new Reserva("A1", null);
        Reserva pru2 = new Reserva("A2", null);
        //pru.newCliente(12345, "Pepito2");

        //Clientes en reser 1
        pru.newCliente2(cli);
        pru.newCliente2(cli2);
        pru.newCliente2(cli);

        //Clientes en reser 2
        pru2.newCliente2(cli2);
        pru2.newCliente2(cli);

        //Vagon
        Vagon prueba = new Vagon(1,10);
        Vagon prueba2 = new Vagon(2,10);

        ///RECORRIDOS
        Recorridos rec = new Recorridos("25/3/2014", null, null);
        
        
        
        rec.nuevaReserva(pru);
        rec.nuevaReserva(pru2);
        //Vagones en Rec
        rec.nuevoVagon(prueba);
        rec.nuevoVagon(prueba2);
        //Tamaños de reservas
        pru.setTamano();
        pru2.setTamano();
        //Cupos en Vagones
        rec.setCupos(prueba.getCupos());
        rec.setOcupados(pru.getTamano());

        rec.setCupos(prueba2.getCupos());
        rec.setOcupados(pru2.getTamano());
        
        //FINAL
        Gestion sabana = new Gestion(null);
        sabana.newRecor(rec);
        //System.out.println(sabana.toString());
        System.out.println(sabana.toString());
       }
    }



