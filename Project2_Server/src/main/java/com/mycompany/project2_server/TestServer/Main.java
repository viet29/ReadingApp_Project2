/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.project2_server.TestServer;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Do_Do
 */
public class Main {
    public static void main(String[] args)  {
        try {
            TinhToan tinhToan = new TinhToan();
            LocateRegistry.createRegistry(7898);
            Naming.rebind("rmi://localhost:7898/tinhtong", tinhToan);
            System.out.println("da chay rmi tinh toan");

        } catch (RemoteException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        } catch (MalformedURLException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
