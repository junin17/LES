/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package controller;

import modelo.Comando;

/**
 *
 * @author Junin
 */
public interface Aplicacao {
    public Comando lerComandoDeDominio(String comando);
    
    
}
