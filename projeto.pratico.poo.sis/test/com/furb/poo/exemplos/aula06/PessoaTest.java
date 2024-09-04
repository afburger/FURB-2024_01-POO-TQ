/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package com.furb.poo.exemplos.aula06;

import com.furb.poo.exercicios.lista05.model.Ponto;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.FixMethodOrder;
import org.junit.runners.MethodSorters;

/**
 *
 * @author André Felipe Bürger (afburger@furb.br)
 */
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class PessoaTest {
    
    public PessoaTest() {
    }

    @Test
    public void testACalculoIMC() {
        Pessoa p = new Pessoa();
        p.setAltura(2.0);
        p.setPeso(90.0);
        
        assertEquals(22.5, p.calcularImc(), 0);
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testBExceptionAltura() {
        Pessoa p = new Pessoa();
        p.setAltura(-5);
    }
    
    @Test
    public void testCSobreX() {
        Ponto ponto = new Ponto(1, 0);
        
        assertTrue(ponto.estaIncidindoSobreY());
        
    }
    
}
