package com.furb.poo.exercicios.lista10.questao02.model;

import java.util.ArrayList;

/**
 * 
 * @author André Felipe Bürger (afburger@furb.br)
 */
public class Programador extends Funcionario {
    
    private ArrayList<String> linguagens = new ArrayList<>();
    
    public Programador(String nome, double salarioBase){
        super(nome, salarioBase);
        
    }
    
    public void incluirLinguagem(String linguagem){
        linguagens.add(linguagem);
    }
    
    public void removerLinguagem(String linguagem){
        linguagens.remove(linguagem);
    }

    public ArrayList<String> getLinguagens() {
        return linguagens;
    }
    
    @Override
    public double calcularSalario(){
        double totalSalario = getSalarioBase();
        
        if (conheceJava()){
            totalSalario += ((getSalarioBase() * 20)/100);
        }
        
        return totalSalario;
    }
    
    private boolean conheceJava(){
        for (String l : getLinguagens()){
            if (l.equalsIgnoreCase("Java")){
                return true;
            }
        }
        
        return false;
    }
    
}
