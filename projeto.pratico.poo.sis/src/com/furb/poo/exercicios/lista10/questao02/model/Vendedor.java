package com.furb.poo.exercicios.lista10.questao02.model;

import java.util.ArrayList;

/**
 * 
 * @author André Felipe Bürger (afburger@furb.br)
 */
public class Vendedor extends Funcionario {
    
    private double percentualComissao;
    private ArrayList<Venda> vendas = new ArrayList<>();
    
    public Vendedor(String nome, double salarioBase, double percentualComissao){
        super(nome, salarioBase);
        setPercentualComissao(percentualComissao);
        
    }

    public double getPercentualComissao() {
        return percentualComissao;
    }

    public void setPercentualComissao(double percentualComissao) {
        this.percentualComissao = percentualComissao;
    }

    public ArrayList<Venda> getVendas() {
        return vendas;
    }
    
    public void incluirVenda(Venda v){
        vendas.add(v);
    }
        
    @Override
    public double calcularSalario(){
      double totalVendas = 0;
      
      for (Venda v : getVendas()){
          totalVendas += v.getValor();
      }
      
      return getSalarioBase() + ((totalVendas * percentualComissao)/100);
        
    }
    
}
