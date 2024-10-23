package com.furb.poo.exemplos.aula10.interfacee.model;

import java.util.ArrayList;

/**
 *
 * @author André Felipe Bürger (afburger@furb.br)
 */
public class TestePolimorfismoSemInterface {

    public static void main(String[] args) {
        ArrayList<Object> pagamentos = new ArrayList<>();
        
        pagamentos.add(new ContaAgua(200));
        pagamentos.add(new ContaLuz(175));
        pagamentos.add(new PrevidenciaPrivada(1500));
        pagamentos.add(new MensalidadeEstudo(1475));
        
        double totalPagamentos = 0.0;
        
        for (Object pagamento : pagamentos) {
            
            if (pagamento instanceof ContaAgua) {
                totalPagamentos += ((ContaAgua) pagamento).calcularValorPagar();
            }
            
            if (pagamento instanceof ContaLuz) {
                totalPagamentos += ((ContaLuz) pagamento).calcularValorPagar();
            }
            
            if (pagamento instanceof PrevidenciaPrivada) {
                totalPagamentos += ((PrevidenciaPrivada) pagamento).calcularValorPagar();
            }
            
            if (pagamento instanceof MensalidadeEstudo) {
                totalPagamentos += ((MensalidadeEstudo) pagamento).calcularValorPagar();
            }
        }
        
        System.out.println("Total de pagamentos: " + totalPagamentos);
    }
    
}
