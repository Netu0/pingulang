/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.utfpr.app;

import br.edu.utfpr.modelo.Exemplar;
import br.edu.utfpr.modelo.Journal;
import br.edu.utfpr.modelo.Livro;
import br.edu.utfpr.modelo.Midia;

/**
 *
 * @author Oswaldo Beltrani Net
 */
public class app {
    
    public static void main(String[] args) {
     Midia domQuixote = new Livro("1234-5678", "Dom Quixote");
     domQuixote.mostrar();
     
     Exemplar exemplar1 = new Exemplar(1);
     Exemplar exemplar2 = new Exemplar(2);
     Exemplar exemplar3 = new Exemplar(3);
     Exemplar exemplar4 = new Exemplar(4);
     Exemplar exemplar5 = new Exemplar(5);
     domQuixote.add(exemplar3);
     domQuixote.add(exemplar2);
     domQuixote.add(exemplar1);
     
     domQuixote.mostrarExemplares();
     
     Midia meuJournal = new Journal("Ciência da computação", "Meu jornal de computação");
     Exemplar journal1 = new Exemplar(1);
     meuJournal.add(journal1);
     meuJournal.mostrar();
     meuJournal.mostrarExemplares();
    }
    
}
