package com.furb.poo.exemplos.aula09.revisao;

/**
 *
 * @author André Felipe Bürger (afburger@furb.br)
 */
public class Desenvolvedor extends Funcionario {

    public Desenvolvedor(String nome, double salario) {
        super(nome, salario);
    }

    @Override
    public void calcularBonus() {
       System.out.println("O bônus do Desenvolvedor é: " + (getSalario() * 0.50));
    }

    
    
    
}
