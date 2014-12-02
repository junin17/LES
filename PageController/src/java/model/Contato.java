/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package model;

import java.util.Date;
import java.util.List;

/**
 *
 * @author Junin
 */
public class Contato {
    private String nome;
    private String email;
    private Date dataNascimento;
    private String endereco;

    public Contato(String nome, String email, Date dataNascimento, String endereco) {
        this.nome = nome;
        this.email = email;
        this.dataNascimento = dataNascimento;
        this.endereco = endereco;
    }
    
    

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(Date dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
    
    public void salvarContato(List<Contato> contatos){
        contatos.add(this);
    }

    @Override
    public String toString() {
        return "Contato{" + "nome=" + nome + ", email=" + email + ", dataNascimento=" + dataNascimento + ", endereco=" + endereco + '}';
    }
    
    
    
}
