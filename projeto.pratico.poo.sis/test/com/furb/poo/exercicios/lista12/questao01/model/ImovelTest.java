package com.furb.poo.exercicios.lista12.questao01.model;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author André Felipe Bürger (afburger@furb.br)
 */
public class ImovelTest {
    
    /**
     * Caso 1
     *   Certificar-se que seja recusada área negativa
     *   Criar um imóvel e definir que a área é -5 m2
     *   Exceção IllegalArgumentException lançada*/
    @Test(expected = IllegalArgumentException.class)
    public void testRecusarAreaNegativa() {
        Imovel imovel = new Imovel();
        imovel.setArea(-5);
    }
    
    /**
     * Caso 2
     *   Descrição: Certificar-se que seja recusado calcular o IPTU de imóvel sem que seja especificada a área
     *   Entrada: Criar um imóvel residencial no bairro Centro, cujo coeficiente é 1. Sem especificar a área, solicitar o cálculo do IPTU.
     *   Saída Esperada: Exceção IllegalArgumentException lançada*/
    @Test(expected = IllegalArgumentException.class)
    public void testRecusarCalcularIptuImovelSemAreaDefinida() {
        Bairro bairro = new Bairro();
        bairro.setNome("Centro");
        bairro.setCoeficienteIptu(1);
        
        Imovel imovel = new Imovel();
        imovel.setFinalidade(Finalidade.RESIDENCIAL);
        
        imovel.setBairro(bairro);
        
        imovel.calcularIptu();
    }
    
    /**
     * Caso 3
     *   Descrição: Certificar-se que seja recusado calcular o IPTU de imóvel sem que seja especificada a finalidade do imóvel
     *   Entrada: Criar um imóvel no bairro Centro, cujo coeficiente é 1. Sem informar a finalidade, definir a área como 250 m2
     *   Saída esperada: Exceção IllegalArgumentException lançada*/
    @Test(expected = IllegalArgumentException.class)
    public void testRecusarCalcularIptuImovelSemFinalidadeDefinida() {
        Bairro bairro = new Bairro();
        bairro.setNome("Centro");
        bairro.setCoeficienteIptu(1);
        
        Imovel imovel = new Imovel();
        imovel.setBairro(bairro);
        imovel.setArea(250);
        
        imovel.calcularIptu();
    }
    
    /**
     * Caso 4
     *   Descrição: Certificar-se que seja recusado calcular o IPTU de imóvel sem que seja especificado o bairro
     *   Entrada: Criar um imóvel sem bairro, cuja finalidade seja residencial e área igual à 400 m2.
     *   Saída esperada: Exceção IllegalArgumentException lançada*/
    @Test(expected = IllegalArgumentException.class)
    public void testRecusarCalcularIptuImovelSemBairroDefinido() {
        
        Imovel imovel = new Imovel();
        imovel.setFinalidade(Finalidade.RESIDENCIAL);
        imovel.setArea(400);
        
        imovel.calcularIptu();
    }
    
    
    /**
     * Caso 5
     *   Descrição: Calcular o imposto para imóveis residenciais 
     *   Entrada: Criar um imóvel cujo bairro tem coeficiente de IPTU igual à 1. 
     *            Estabelecer que a área do imóvel é de 400 m2e finalidade residencial.
     *   Saída esperada: O cálculo do IPTU deve resultar em R$ 400,00*/
    
    @Test
    public void testCalcularImpostoImoveisResidenciais() {
        Bairro bairro = new Bairro();
        bairro.setCoeficienteIptu(1);
        
        Imovel imovel = new Imovel();
        imovel.setArea(400);
        imovel.setFinalidade(Finalidade.RESIDENCIAL);
        imovel.setBairro(bairro);
        
        assertEquals(400.00, imovel.calcularIptu(), 0.00); 
    }
    
    /**
     * Caso 6
     *   Descrição: Calcular o imposto para imóveis comerciais de até 100 m2 
     *   Entrada: Criar um imóvel cujo bairro tem coeficiente de IPTU igual à 1. 
     *            Estabelecer que a área do imóvel é de 80 m2 e finalidade comercial. 
     *   Saída esperada: O cálculo do IPTU deve resultar em R$ 500,00*/
    
    @Test
    public void testCalcularImpostoImoveisComerciaisAte100MetrosArea() {
        Bairro bairro = new Bairro();
        bairro.setCoeficienteIptu(1);
        
        Imovel imovel = new Imovel();
        imovel.setArea(80);
        imovel.setFinalidade(Finalidade.COMERCIAL);
        imovel.setBairro(bairro);
        
        assertEquals(500.00, imovel.calcularIptu(), 0.00); 
    }
    
    /**
     * Caso 7
     *   Descrição: Calcular o imposto para imóveis comerciais entre 100 e 400m2
     *   Entrada: Criar um imóvel cujo bairro tem coeficiente de IPTU igual à 1. 
     *            Estabelecer que a área do imóvel é de 250 m2 e finalidade comercial. 
     *   Saída esperada: O cálculo do IPTU deve resultar em R$ 1.000,00 */
    
    @Test
    public void testCalcularImpostoImoveisComerciaisEntre100e400MetrosArea() {
        Bairro bairro = new Bairro();
        bairro.setCoeficienteIptu(1);
        
        Imovel imovel = new Imovel();
        imovel.setArea(250);
        imovel.setFinalidade(Finalidade.COMERCIAL);
        imovel.setBairro(bairro);
        
        assertEquals(1000.00, imovel.calcularIptu(), 0.00); 
    }
    
    /**
     * Caso 8
     *   Descrição: Calcular o imposto para imóveis comerciais acima de 400 m2
     *   Entrada: Criar um imóvel cujo bairro tem coeficiente de IPTU igual à 1.
     *            Estabelecer que a área do imóvel é de 500 m2 e finalidade comercial. 
     *   Saída esperada: O cálculo do IPTU deve resultar em R$ 1.275,00 */
    
    @Test
    public void testCalcularImpostoImoveisComerciaisAcimaDe400MetrosArea() {
        Bairro bairro = new Bairro();
        bairro.setCoeficienteIptu(1);
        
        Imovel imovel = new Imovel();
        imovel.setArea(500);
        imovel.setFinalidade(Finalidade.COMERCIAL);
        imovel.setBairro(bairro);
        
        assertEquals(1275.00, imovel.calcularIptu(), 0.00); 
    }
    
    /**
     * Caso 9
     *   Descrição: Calcular o imposto para imóveis industriais de até 2 mil m2
     *   Entrada: Criar um imóvel cujo bairro tem coeficiente de IPTU igual à 1.
     *            Estabelecer que a área do imóvel é de 2 mil m2 e finalidade industrial. 
     *   Saída esperada: O cálculo do IPTU deve resultar em R$ 1.000,00 */
    
    @Test
    public void testCalcularImpostoImoveisIndustriaisAte2MilMetrosArea() {
        Bairro bairro = new Bairro();
        bairro.setCoeficienteIptu(1);
        
        Imovel imovel = new Imovel();
        imovel.setArea(2000);
        imovel.setFinalidade(Finalidade.INDUSTRIAL);
        imovel.setBairro(bairro);
        
        assertEquals(1000.00, imovel.calcularIptu(), 0.00); 
    }
    
    /**
     * Caso 10
     *   Descrição: Calcular o imposto para imóveis industriais acima de 2 mil m2
     *   Entrada: Criar um imóvel cujo bairro tem coeficiente de IPTU igual à 1.
     *            Estabelecer que a área do imóvel é de 3 mil m2 e finalidade industrial. 
     *   Saída esperada: O cálculo do IPTU deve resultar em R$ 1.650,00 */
    
    @Test
    public void testCalcularImpostoImoveisIndustriaisAcima2MilMetrosArea() {
        Bairro bairro = new Bairro();
        bairro.setCoeficienteIptu(1);
        
        Imovel imovel = new Imovel();
        imovel.setArea(3000);
        imovel.setFinalidade(Finalidade.INDUSTRIAL);
        imovel.setBairro(bairro);
        
        assertEquals(1650.00, imovel.calcularIptu(), 0.01); 
    }
    
    /**
     * Caso 11
     *   Descrição: Calcular o imposto para imóveis em bairro cujo coeficiente de cálculo de IPTU é 2,5.
     *   Entrada: Criar um imóvel cujo bairro tem coeficiente de IPTU igual à 2,5.
     *            Estabelecer que a área do imóvel é de 500 mil m2 e finalidade residencial. 
     *   Saída esperada: O cálculo do IPTU deve resultar em R$ 1.250,00 */
    
    @Test
    public void testCalcularImpostoImoveisCoeficienteIptuBairro2_5() {
        Bairro bairro = new Bairro();
        bairro.setCoeficienteIptu(2.5);
        
        Imovel imovel = new Imovel();
        imovel.setArea(500000);
        imovel.setFinalidade(Finalidade.RESIDENCIAL);
        imovel.setBairro(bairro);
        
        assertEquals(1250000.0, imovel.calcularIptu(), 0.01); 
    }
    
}
