/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicios;

/**
 *
 * @author mateus
 */
public class Livraria {
    
    // atributos (campos)
    
    private String titulo;
    private Double preco;
    private Integer ano;
    private String autor; 
    
    // construtor

    public Livraria(String autor, String titulo, Double preco, Integer ano) {
        this.titulo = titulo;
        this.preco = preco;
        this.ano = ano;
        this.autor = autor;
    }
    
    // metodos 

    public Integer getAno() {
        return ano;
    }

    public Double getPreco() {
        return preco;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    @Override
    public String toString() {
        return "-----Informação sobre o livro:------\n"+
				"TiTulo do livro: "+ this.titulo + "\n" +
				"Nome do autor: "+ this.autor + "\n"+
                                "Ano de publicação: "+ this.ano + "\n"+
				"Preco: "+ this.preco + "\n----------------";
    }

    
    

    
    
    
    
    
    
		
                
    
}
