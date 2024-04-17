/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.utfpr.modelo;

/**
 *
 * @author Oswaldo Beltrani Neto
 */

public abstract class Midia {
    private String nome;

    public Midia(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    
    public abstract void mostrar();
    
}
