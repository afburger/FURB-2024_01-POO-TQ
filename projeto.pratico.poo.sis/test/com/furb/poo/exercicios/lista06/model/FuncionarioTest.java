package com.furb.poo.exercicios.lista06.model;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author André Felipe Bürger (afburger@furb.br)
 */
public class FuncionarioTest {
   
    @Test
    public void test1_IdentificarFaixaIrpf() {
        Funcionario funcionario = new Funcionario("André", 850.00);
        assertEquals(FaixaIrpf.PRIMEIRA, funcionario.identificarFaixaIrpf());
    }
    
    @Test
    public void test2_CalcularIrpf() {
        Funcionario funcionario = new Funcionario("André", 850.00);
        assertEquals(0.00, funcionario.calularIrpf(), 0.01);
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void test3_excecao() {
        Funcionario funcionario = new Funcionario(null, 0.00);
        funcionario.setSalario(-1500);
    }
}
