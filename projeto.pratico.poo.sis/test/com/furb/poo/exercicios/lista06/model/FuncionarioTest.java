package com.furb.poo.exercicios.lista06.model;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author André Felipe Bürger (afburger@furb.br)
 */
public class FuncionarioTest {
   
     /**
     * Caso de teste 1
     */
    @Test
    public void test01_SalarioCategorizadoComoPrimeiraFaixa() {
        Funcionario func1 = new Funcionario("André", 850);
        assertEquals(FaixaIrpf.PRIMEIRA, func1.identificarFaixaIrpf());
    }

    /**
     * Caso de teste 2
     */
    @Test
    public void test02_ImpostoCalculadoComoPrimeiraFaixa() {
        Funcionario func1 = new Funcionario("André", 850);
        assertEquals(0.00, func1.calcularIrpf(), 0.01);
    }

    /**
     * Caso de teste 3
     */
    @Test
    public void test03_SalarioCategorizadoComoPrimeiraFaixaSuperior() {
        Funcionario func1 = new Funcionario("André", 1903.98);
        assertEquals(FaixaIrpf.PRIMEIRA, func1.identificarFaixaIrpf());
    }

    /**
     * Caso Teste 4
     */
    @Test
    public void test04_ImpostoCalculadoComoPrimeiraFaixaSuperior() {
        Funcionario func1 = new Funcionario("André", 1903.98);
        assertEquals(0.00, func1.calcularIrpf(), 0.01);
    }

    /**
     * Caso de teste 5
     */
    @Test
    public void test05_SalarioCategorizadoComoSegundaFaixa() {
        Funcionario func1 = new Funcionario("André", 1903.99);
        assertEquals(FaixaIrpf.SEGUNDA, func1.identificarFaixaIrpf());
    }

    /**
     * Caso de teste 6
     */
    @Test
    public void test06_ImpostoCalculadoComoSegundaFaixa() {
        Funcionario func1 = new Funcionario("André", 1903.99);
        assertEquals(0.00, func1.calcularIrpf(), 0.01);
    }

    /**
     * Caso de teste 7
     */
    @Test
    public void test07_CategorizadoComoSegundaFaixa() {
        Funcionario func1 = new Funcionario("André", 2000.00);
        assertEquals(FaixaIrpf.SEGUNDA, func1.identificarFaixaIrpf());
    }
    
    /**
     * Caso de teste 8
     */
    @Test
    public void test08_ImpostoCalculadoComoSegundaFaixa() {
        Funcionario func1 = new Funcionario("André", 2000.00);
        assertEquals(7.20, func1.calcularIrpf(), 0.01);
    }
    
    /**
     * Caso de teste 9
     */
    @Test
    public void test09_CategorizadoComoSegundaFaixa() {
        Funcionario func1 = new Funcionario("André", 2826.65);
        assertEquals(FaixaIrpf.SEGUNDA, func1.identificarFaixaIrpf());
    }
    
    /**
     * Caso de teste 10
     */
    @Test
    public void test10_ImpostoCalculadoComoSegundaFaixa() {
        Funcionario func1 = new Funcionario("André", 2826.65);
        assertEquals(69.20, func1.calcularIrpf(), 0.01);
    }
    
    /**
     * Caso de teste 11
     */
    @Test
    public void test12_CategorizadoComoTerceiraFaixa() {
        Funcionario func1 = new Funcionario("André", 2826.66);
        assertEquals(FaixaIrpf.TERCEIRA, func1.identificarFaixaIrpf());
    }
    
    /**
     * Caso de teste 12
     */
    @Test
    public void test12_ImpostoCalculadoComoTerceiraFaixa() {
        Funcionario func1 = new Funcionario("André", 2826.66);
        assertEquals(69.20, func1.calcularIrpf(), 0.01);
    }
    
    /**
     * Caso de teste 13
     */
    @Test
    public void test13_CategorizadoComoTerceiraFaixa() {
        Funcionario func1 = new Funcionario("André", 3000.00);
        assertEquals(FaixaIrpf.TERCEIRA, func1.identificarFaixaIrpf());
    }
    
    /**
     * Caso de teste 14
     */
    @Test
    public void test14_ImpostoCalculadoComoTerceiraFaixa() {
        Funcionario func1 = new Funcionario("André", 3000.00);
        assertEquals(95.20, func1.calcularIrpf(), 0.01);
    }
    
    
    /**
     * Caso de teste 15
     */
    @Test
    public void test15_CategorizadoComoTerceiraFaixa() {
        Funcionario func1 = new Funcionario("André", 3751.05);
        assertEquals(FaixaIrpf.TERCEIRA, func1.identificarFaixaIrpf());
    }
    
    /**
     * Caso de teste 16
     */
    @Test
    public void test16_ImpostoCalculadoComoTerceiraFaixa() {
        Funcionario func1 = new Funcionario("André", 3751.05);
        assertEquals(207.86, func1.calcularIrpf(), 0.01);
    }
    
    /**
     * Caso de teste 17
     */
    @Test
    public void test17_CategorizadoComoQuartaFaixa() {
        Funcionario func1 = new Funcionario("André", 3751.06);
        assertEquals(FaixaIrpf.QUARTA, func1.identificarFaixaIrpf());
    }
    
    /**
     * Caso de teste 18
     */
    @Test
    public void test18_ImpostoCalculadoComoQuartaFaixa() {
        Funcionario func1 = new Funcionario("André", 3751.06);
        assertEquals(207.86, func1.calcularIrpf(), 0.01);
    }
    
    /**
     * Caso de teste 19
     */
    @Test
    public void test19_CategorizadoComoQuartaFaixa() {
        Funcionario func1 = new Funcionario("André", 4000.00);
        assertEquals(FaixaIrpf.QUARTA, func1.identificarFaixaIrpf());
    }
    
    /**
     * Caso de teste 20
     */
    @Test
    public void test20_ImpostoCalculadoComoQuartaFaixa() {
        Funcionario func1 = new Funcionario("André", 4000.00);
        assertEquals(263.87, func1.calcularIrpf(), 0.01);
    }
    
    /**
     * Caso de teste 21
     */
    @Test
    public void test21_CategorizadoComoQuartaFaixa() {
        Funcionario func1 = new Funcionario("André", 4664.68);
        assertEquals(FaixaIrpf.QUARTA, func1.identificarFaixaIrpf());
    }
    
    /**
     * Caso de teste 22
     */
    @Test
    public void test22_ImpostoCalculadoComoQuartaFaixa() {
        Funcionario func1 = new Funcionario("André", 4664.68);
        assertEquals(413.42, func1.calcularIrpf(), 0.01);
    }
    
    /**
     * Caso de teste 23
     */
    @Test
    public void test23_CategorizadoComoQuintaFaixa() {
        Funcionario func1 = new Funcionario("André", 4664.69);
        assertEquals(FaixaIrpf.QUINTA, func1.identificarFaixaIrpf());
    }
    
    /**
     * Caso de teste 24
     */
    @Test
    public void test24_ImpostoCalculadoComoQuintaFaixa() {
        Funcionario func1 = new Funcionario("André", 4664.69);
        assertEquals(413.42, func1.calcularIrpf(), 0.01);
    }
    
    /**
     * Caso de teste 25
     */
    @Test
    public void test25_CategorizadoComoQuintaFaixa() {
        Funcionario func1 = new Funcionario("André", 5000.00);
        assertEquals(FaixaIrpf.QUINTA, func1.identificarFaixaIrpf());
    }
    
    /**
     * Caso de teste 26
     */
    @Test
    public void test26_ImpostoCalculadoComoQuintaFaixa() {
        Funcionario func1 = new Funcionario("André", 5000.00);
        assertEquals(505.64, func1.calcularIrpf(), 0.01);
    }
    
    /**
     * Caso teste 27
     */
    @Test(expected = IllegalArgumentException.class)
    public void test27_RecusarSalarioNegativo() {
        Funcionario func1 = new Funcionario("André", -100);
    }
}
