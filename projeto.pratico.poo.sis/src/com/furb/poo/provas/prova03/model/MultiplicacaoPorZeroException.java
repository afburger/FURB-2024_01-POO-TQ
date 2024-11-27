package com.furb.poo.provas.prova03.model;

import java.io.IOException;

/**
 * Exceção lançada quando uma um valor for inválido para a multiplicação.
 * @author André Felipe Bürger (afburger@furb.br)
 */
public class MultiplicacaoPorZeroException extends RuntimeException {

    public MultiplicacaoPorZeroException() {
        super("O número deve ser diferente de zero.");
    }
    
}
