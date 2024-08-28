package com.furb.poo.exercicios.lista03;

/**
 *
 * @author André Felipe Bürger (afburger@furb.br)
 */
public class Funcionario {

    private String nome;
    private double salario;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
    
    /**
    * Método que calcular o imposto de renda do funcionário
    * com base no salário e na lista de classificação de 
    * imposto de renda abaixo:
    *    Faixa Faixa de Salário Alíquota
    * 
    *    1ª Faixa Até R$ 1.903,98 Isento \n
    *    2ª Faixa De R$ 1.903,99 à R$ 2.826,65 7,5% \n
    *    3ª Faixa De R$ 2.826,66 à R$ 3.751,05 15,0% \n
    *    4ª Faixa De R$ 3.751,06 à R$ 4.664,68 22,5% \n
    *    5ª Faixa A partir de R$ 4.664,69 27,5% \n
    * 
    * @return Valor do imposto de renda a pagar pelo funcionário 
    */
    public double calcularIrpf() {
        double imposto = 0;
        double diferenca = 0;
        
        if (salario > 1903.98) {
           // Faixa 2
           if (salario <= 2826.65) {
               diferenca = salario - 1903.98;
               imposto = diferenca * (7.5/100);
           } else if (salario <= 3751.05) { // Faixa 3
               // Calcular da faixa 2
               diferenca = 2826.65 - 1903.98;
               imposto = diferenca * (7.5/100);
               
               // Calcular da faixa 3
               diferenca = salario - 2826.65;
               imposto += diferenca * (15.0/100);
           } else if (salario <= 4664.68) {
                // Calcular da faixa 2
               diferenca = 2826.65 - 1903.98;
               imposto = diferenca * (7.5/100);
               
               // Calcular da faixa 3
               diferenca = 3751.05 - 2826.65;
               imposto += diferenca * (15.0/100);
               
               // Calcular da faixa 4
               diferenca = salario - 3751.05;
               imposto += diferenca * (22.5/100);
           } else {
                // Calcular da faixa 2
               diferenca = 2826.65 - 1903.98;
               imposto = diferenca * (7.5/100);
               
               // Calcular da faixa 3
               diferenca = 3751.05 - 2826.65;
               imposto += diferenca * (15.0/100);
               
               // Calcular da faixa 4
               diferenca = 4664.68 - 3751.05;
               imposto += diferenca * (22.5/100);
               
               diferenca = salario - 4664.68;
               imposto += diferenca * (27.5/100);
           }
        }
        return imposto;
    }
    
}
