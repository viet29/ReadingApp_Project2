/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.project2_connector.Model.SQL.INTF;

import com.mycompany.project2_connector.Admin.Model.SQL.INTF.*;

/**
 *
 * @author ADMIN
 */
public interface IUserControllerSQL {
    boolean login(String Username, String Password);
    void register();
}
