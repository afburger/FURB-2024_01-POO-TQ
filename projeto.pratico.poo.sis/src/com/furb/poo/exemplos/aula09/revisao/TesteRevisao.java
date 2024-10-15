package com.furb.poo.exemplos.aula09.revisao;

/**
 *
 * @author André Felipe Bürger (afburger@furb.br)
 */
public class TesteRevisao {
    public static void main(String[] args) {
        // Criando objetos das subclasses
        Gerente gerente = new Gerente("Gerente Um", 8000);
        Desenvolvedor desenvolvedor = new Desenvolvedor("Dev Dois", 5000);
        Funcionario funcionario = new Funcionario("Estagiário", 5000);
            
        
        // Chamando o método que NÃO é sobrescrito (compartilhado)
        System.out.println("Detalhes do Gerente:");
        gerente.exibirDetalhes();  // Saída: Nome: Gerente Um, Salário: 8000

        System.out.println("\nDetalhes do Desenvolvedor:");
        desenvolvedor.exibirDetalhes();  // Saída: Nome: Dev Dois, Salário: 5000
        
        System.out.println("\nDetalhes do Funcionario:");
        funcionario.exibirDetalhes();  // Saída: Nome: Estagiário, Salário: 5000

        // Chamando o método sobrescrito para cálculo de bônus
        System.out.println("\nCálculo de bônus:");
        gerente.calcularBonus(); // Saída: O bônus do gerente é: 1600
        desenvolvedor.calcularBonus(); // Saída: O bônus do desenvolvedor é: 2500
        funcionario.calcularBonus(); // Saída: O bônus do desenvolvedor é: 500
    }
}
