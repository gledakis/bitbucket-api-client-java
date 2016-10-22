/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.vx68k.bitbucket.api.client;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author jled
 */
public class Tester {
    
    public static void main(String[] args) {
        
        try {
            Client cl = new Client();
            String access_token = "-----";
            cl.setAccess_token(access_token);
            Service service = cl.getService();
            System.out.println("service"+service.toString());
            BitbucketUser bituser =cl.getService().getCurrentUser();
            
            String displayName = bituser.getDisplayName();
            System.out.println("user:"+displayName);
            //String user = cl.getUser();
        } catch (IOException ex) {
            Logger.getLogger(Tester.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
    }
    
}
