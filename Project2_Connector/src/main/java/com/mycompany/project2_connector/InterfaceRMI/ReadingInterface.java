/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.project2_connector.InterfaceRMI;

import java.rmi.Remote;
import java.rmi.RemoteException;
import InterfaceRMI.model.Account;
/**
 *
 * @author Do_Do
 */
public interface ReadingInterface extends Remote {
    Account Login()throws RemoteException;
}
