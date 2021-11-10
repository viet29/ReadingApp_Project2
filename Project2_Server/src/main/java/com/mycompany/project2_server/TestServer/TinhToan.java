/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.project2_server.TestServer;

import com.mycompany.project2_connector.InterfaceRMI.model.TinhTong;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

/**
 *
 * @author Do_Do
 */
public class TinhToan extends UnicastRemoteObject implements TinhTong {

    TinhToan() throws RemoteException {
    }

    @Override
    public int tinhTong(int a, int b) throws RemoteException {
        System.out.println("goi ham tinh tong");
        return a + b;
    }

}