/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.utfpr.modelo;

import java.util.List;

/**
 *
 * @author Oswaldo Beltrani Net
 */
public class Journal extends Midia {
    private String area;

    public Journal(String area, String nome) {
        super(nome);
        this.area = area;
    }
    
    

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public List<Exemplar> getExemplares() {
        return exemplares;
    }

    public void setExemplares(List<Exemplar> exemplares) {
        this.exemplares = exemplares;
    }

    @Override
    public void mostrar() {
        System.out.println("Dados do Journal: \n Nome: " + getNome() + "\nArea: " + this.area);
    }
    
  
    
    
  
    
}
