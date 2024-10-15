package com.furb.poo.exemplos.aula09.revisao;

/**
 *
 * @author André Felipe Bürger (afburger@furb.br)
 */
public class Gerente extends Funcionario {

//    public Gerente() {
//        super("nome", 1000);
//    }
    
    public Gerente(String nome, double salario) {
        super(nome, salario);
    }

    @Override
    public void calcularBonus() {
        System.out.println("O bônus do gerente é: " + (getSalario() * 0.20));
    }

    
}
