package com.furb.poo.exercicios.lista09.questao01.model;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 * 
 * @author André Felipe Bürger (afburger@furb.br)
 */
public class ContaEspecialTest {
    
    /**
     * Caso 1
     */
    @Test
    public void testPermiteSacarValorSuperiorSaldo() {
        ContaEspecial cEspecial = new ContaEspecial();
        cEspecial.setLimiteCredito(100);
        cEspecial.depositar(20);
        cEspecial.sacar(50);
        
        assertEquals(-30, cEspecial.getSaldo(), 0.00); 
    }
    
    /**
     * Caso 2
     */
    @Test
    public void testPermiteSacarValorSuperiorSaldoInferiorLimite() {
        ContaEspecial cEspecial = new ContaEspecial();
        cEspecial.setLimiteCredito(100);
        cEspecial.depositar(20);
        cEspecial.sacar(120);
        
        assertEquals(-100, cEspecial.getSaldo(), 0.00); 
    }
    
    /**
     * Caso 3
     */
    @Test(expected = IllegalArgumentException.class)
    public void testImpedeSacarValorSuperiorSaldoSuperiorLimite() {
        ContaEspecial cEspecial = new ContaEspecial();
        cEspecial.setLimiteCredito(100);
        cEspecial.depositar(20);
        cEspecial.sacar(120.01);
    }
    
}
