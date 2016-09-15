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
public class Trem {
    
    private String nome;
    private HorarioTrem horarioTrem;
    private Rota rota;
    private TipoTrem tipoTrem;
    
    public Trem(String nome, HorarioTrem horarioTrem, Rota rota, TipoTrem tipoTrem){
        this.nome=nome;
        this.horarioTrem= horarioTrem;
        this.rota=rota;
        this.tipoTrem=tipoTrem;
    }
    
   @Override
    public String toString() {
        return nome + ", " + horarioTrem  + rota + ", " + tipoTrem;
    
}
    
}
