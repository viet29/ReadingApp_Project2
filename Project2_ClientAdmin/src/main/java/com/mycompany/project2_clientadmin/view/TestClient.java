/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.project2_clientadmin.view;


import com.mycompany.project2_connector.Admin.InterfaceAdmin.TinhTong;
import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Do_Do
 */
public class TestClient {
    public static void main(String[] args) {
        try {
            TinhTong tinhTong = (TinhTong) Naming.lookup("rmi://localhost:7898/tinhtong");

            int tong = tinhTong.tinhTong(344, 444);
            System.out.println("ket qua: " + tong);
        } catch (NotBoundException | MalformedURLException | RemoteException ex) {
            Logger.getLogger(TestClient.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
