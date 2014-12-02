/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package model;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Junin
 */
public class DataBase {
    private List<Contato> contatos;
    private static DataBase instance;
    
    private DataBase(){
        contatos=new ArrayList();
    }
    
    public static DataBase getInstance(){
        if (instance == null)
            instance=new DataBase();
        return instance;
    }

    public List<Contato> getContatos() {
        return contatos;
    }

    public void setContatos(List<Contato> contatos) {
        this.contatos = contatos;
    }

    
    
    
    
}
