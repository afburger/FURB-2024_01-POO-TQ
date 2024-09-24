package com.furb.poo.exemplos.aula07.view;

import com.furb.poo.exemplos.aula07.model.Departamento;
import com.furb.poo.exemplos.aula07.model.Funcionario;

/**
 *
 * @author André Felipe Bürger (afburger@furb.br)
 */
public class Exemplo {

    public static void main(String[] args) {
        Funcionario gerenteAndre = new Funcionario();
        gerenteAndre.setNome("André");
        gerenteAndre.setRamal(2525);
        
        Departamento ti = new Departamento(gerenteAndre);
        ti.setNome("TI");
        
        System.out.println(
                "Departamento: " + ti.getNome()
                + " Gerente: " + ti.getGerente().getNome()
                + " ramal: " + ti.getGerente().getRamal());
    }
}
