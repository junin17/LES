/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package controller;

import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import modelo.Comando;
/**
 *
 * @author Junin
 */
public class ControladorDeAplicacao implements Aplicacao {
   

    public Comando lerComandoDeDominio(String comando) {
        Comando comand=null;
        try {
            comand = (Comando) Class.forName("modelo."+comando).newInstance();
        } catch (ClassNotFoundException ex) {
            ex.printStackTrace();
        } catch (InstantiationException ex) {
            ex.printStackTrace();
        } catch (IllegalAccessException ex) {
            ex.printStackTrace();
        }
        return comand;
    }
}
