/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.utfpr.modelo;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Oswaldo Beltrani Neto
 */
public abstract class Midia {

    private String nome;
    public List<Exemplar> exemplares;

    public Midia(String nome) {
        this.nome = nome;
        exemplares = new ArrayList();
    }
   

    public String getNome() {
        return nome;
    }

    public abstract void mostrar();
    
    public void add(Exemplar e){
        exemplares.add(e);
    }
    
    public void mostrarExemplares(){
        for (Exemplar e : exemplares) {
            System.out.println("Código do exemplar: " + e.getCodigo());
        }
    }
}


