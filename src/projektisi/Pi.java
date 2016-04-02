/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projektisi;

import com.maciek.connection.Connection;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.bluetooth.BluetoothStateException;

/**
 *
 * @author cos
 */
public class Pi {
static String Adres_Clienta_BT="344DF7F79717"; // Adress z ktorym pi moze sie polaczyc
    
    public static void main(String[] args) throws IOException {
       System.out.println("Projekt ISI");
       nawiaz_polaczenie(Adres_Clienta_BT);   
    }

    private static void nawiaz_polaczenie(String Adres_Clienta_BT) {
        try 
        {
            Connection polaczenie = new Connection(Adres_Clienta_BT);
            polaczenie.start();
        } 
        catch (IOException ex) 
        {
            System.out.println("Nie mozna utworzyc servera");
            Logger.getLogger(Pi.class.getName()).log(Level.SEVERE, null, ex);
        }
      
    }
    
}
