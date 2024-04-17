/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.utfpr.modelo;




/**
 *
 * @author Oswaldo Beltrani Net
 */
public class Livro extends Midia {

    private String isbn;

    public Livro(String isbn, String nome) {
        super(nome);
        this.isbn = isbn;
    }
    

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    @Override
    public void mostrar() {
        System.out.println(" Dados do livro: \n Nome: " + getNome() + "\n ISBN: " + this.isbn);
    }

}
