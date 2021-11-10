/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.project2_connector.InterfaceRMI;

import com.mycompany.project2_connector.InterfaceRMI.model.Account;
import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 *
 * @author Do_Do
 */
public interface ReadingInterface extends Remote {
    Account Login()throws RemoteException;
}
