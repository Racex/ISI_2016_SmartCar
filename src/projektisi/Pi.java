/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projektisi;

import com.dudus.camera.ClassImplements;
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
private static Thread Aparat;   
    public static void main(String[] args) throws IOException {
       System.out.println("Projekt ISI");
       //Obsluga_aparatu_watek(); // to jest cześć sewcia od komentuj sobie o zakomentuja moja to Ci smignie
       nawiaz_polaczenie(Adres_Clienta_BT);   // Czesc maćka BT+ drzwi
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

    private static void Obsluga_aparatu_watek() {
       ClassImplements obsluga = new ClassImplements();
       Aparat=new Thread( () -> {
           new ClassImplements();
       });
       Aparat.start();
    }

   
    
}