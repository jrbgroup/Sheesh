/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package restaurant.database;

import java.sql.Connection;
import javax.swing.JFrame;

/**
 *
 * @author hashi
 */
public class RestaurantDatabase {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     Connection conn=null;
        conn=dbConnection.connect();
       
Register E=new Register();
E.setVisible(true);
E.pack();
E.setLocationRelativeTo(null);
E.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


        // TODO code application logic here
    }
    
}
