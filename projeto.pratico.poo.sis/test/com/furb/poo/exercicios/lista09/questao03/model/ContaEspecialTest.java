package com.furb.poo.exercicios.lista09.questao03.model;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 * 
 * @author André Felipe Bürger (afburger@furb.br)
 */
public class ContaEspecialTest {
    
    /**
     *Caso Teste 1
     */
    @Test
    public void testSacarGeraMovimentoCreditoDebitoContaBancaria() {
      ContaEspecial conta = new ContaEspecial();
      conta.depositar(1000);
      conta.sacar(250);
      
      assertEquals(" Não registrou todos os movimentos ", 2, conta.getMovimentos().size());
      /*pegando o primeiro objeto movimento do arraylist movimentos da conta*/
      Movimento movimento1 = conta.getMovimentos().get(0);
      assertEquals("Tipo Movimento do 1º movimento",TipoMovimento.CREDITO, movimento1.getTipoMovimento());
      assertEquals("Valor do 1º movimento",1000, movimento1.getValor(),0.00);
      
      /*pegando o segundo objeto movimento do arraylist movimentos da conta*/
      Movimento movimento2 = conta.getMovimentos().get(1);
      assertEquals("Tipo Movimento do 2º movimento",TipoMovimento.DEBITO, movimento2.getTipoMovimento());
      assertEquals("Valor do 2º movimento",250, movimento2.getValor(),0.00);
      
    }
    
}
