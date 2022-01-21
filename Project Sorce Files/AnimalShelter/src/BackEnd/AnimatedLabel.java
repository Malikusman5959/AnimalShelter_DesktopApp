/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BackEnd;

/**
 *
 * @author USMAN
 */

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;


public class AnimatedLabel {

    public static void main(String[] args) {
        
        
        //establish connection
            try {
			Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/sakila" ,"root","abc123");
                        
			java.sql.Statement stmt = c.createStatement();
			ResultSet r = stmt.executeQuery("SELECT first_name FROM actor");
			while(r.next()) {
				System.out.println(r.getString(1));
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
        
    }

   
    }

    
