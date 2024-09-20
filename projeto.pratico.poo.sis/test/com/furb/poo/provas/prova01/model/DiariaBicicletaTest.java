/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package com.furb.poo.provas.prova01.model;

import org.junit.Assert;
import org.junit.Test;

/**
 *
 * @author André Felipe Bürger (afburger@furb.br)
 */
public class DiariaBicicletaTest {
    

    @Test
    public void testUm() {
        DiariaBicicleta diaria = new DiariaBicicleta(6, Convenio.CDL);
        Assert.assertEquals(45.60f, diaria.valorTotalPagar(), 0);
    }
    
    @Test
    public void testDois() {
        DiariaBicicleta diaria = new DiariaBicicleta(11, Convenio.CDL);
        Assert.assertEquals(73.15f, diaria.valorTotalPagar(), 0);
    }
    
    @Test
    public void testTres() {
        DiariaBicicleta diaria = new DiariaBicicleta(6, Convenio.SEM_CONVENIO);
        Assert.assertEquals(48f, diaria.valorTotalPagar(), 0);
    }
    
    @Test
    public void testQuatro() {
        DiariaBicicleta diaria = new DiariaBicicleta(6, Convenio.ESTUDANTE);
        Assert.assertEquals(24f, diaria.valorTotalPagar(), 0);
    }
    
    @Test
    public void testCinco() {
        DiariaBicicleta diaria = new DiariaBicicleta(2, Convenio.ESTUDANTE);
        Assert.assertEquals(10f, diaria.valorTotalPagar(), 0);
    }
}
