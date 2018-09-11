/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programmingassignment1a1;

import java.io.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
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
    public static void main(String[] args) throws FileNotFoundException {
        try {
            // Abrimos el archivo
            FileInputStream fstream = new FileInputStream("entrada.txt");
            // Creamos el objeto de entrada
            DataInputStream entrada = new DataInputStream(fstream);
            // Creamos el Buffer de Lectura
            BufferedReader buffer = new BufferedReader(new InputStreamReader(entrada));
            String strLinea;
            // Leer el archivo linea por linea
            while ((strLinea = buffer.readLine()) != null) {
                // Imprimimos la línea por pantalla
                System.out.println(strLinea);
            }
            // Cerramos el archivo
            entrada.close();
        } catch (Exception e) { //Catch de excepciones
            System.err.println("Ocurrio un error: " + e.getMessage());
        }

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
        Vagon prueba = new Vagon(1, 10);
        Vagon prueba2 = new Vagon(2, 10);

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
        if (pru.getTamano() >= prueba.getCupos()) {
            rec.setOcupados(pru.getTamano());
        } else {
            rec.setOcupados(pru2.getTamano());
        }

        rec.setCupos(prueba2.getCupos());
        rec.setOcupados(pru2.getTamano());

        //FINAL
        Gestion sabana = new Gestion(null);
        sabana.newRecor(rec);
        //System.out.println(sabana.toString());
        System.out.println(sabana.toString());

        CreacionArchivo f = new CreacionArchivo();
        File fl = f.crearArchivo();
        f.rellArchivo(sabana, fl);
    }

    public static class CreacionArchivo {

        public File crearArchivo() {
            File f = new File("salida.txt");
            if (!(f.exists())) {
                try {
                    f.createNewFile();
                    System.out.println("getAbsolutePath returns " + f.getAbsolutePath());
                } catch (IOException ex) {
                    System.out.println("No se pudo crear el archivo.");
                }
            }
            return f;
        }

        public static void rellArchivo(Gestion g, File fl) throws FileNotFoundException {
            ArrayList<String> z = new ArrayList<>();
            String r = null;
            for (Recorridos re : g.getRecor()) {
                r = "" + g.toString();
                z.add(r);
            }

            PrintStream ps = new PrintStream(fl);
            for (String lt : z) {
                ps.println(lt);
            }
        }
    }
}
