package com.furb.poo.exemplos.aula07.view;

import com.furb.poo.exemplos.aula07.model.Departamento2;
import com.furb.poo.exemplos.aula07.model.Funcionario2;

/**
 *
 * @author André Felipe Bürger (afburger@furb.br)
 */
public class Exemplo2 {

    public static void main(String[] args) {
        Funcionario2 gerenteAndre = new Funcionario2();
        gerenteAndre.setNome("André");
        gerenteAndre.setRamal(2525);
        
        Departamento2 ti = new Departamento2(gerenteAndre);
        ti.setNome("TI");
        
        gerenteAndre.setDepartamentoGerenciado(ti);
        
        System.out.println(
                "Departamento: " + ti.getNome()
                + " Gerente: " + ti.getGerente().getNome()
                + " ramal: " + ti.getGerente().getRamal());
        
        ti.getGerente().setNome("Felipe");
        
        System.out.println(
                "Departamento: " + ti.getNome()
                + " Gerente: " + ti.getGerente().getNome()
                + " ramal: " + ti.getGerente().getRamal());
        
    }
    
}
