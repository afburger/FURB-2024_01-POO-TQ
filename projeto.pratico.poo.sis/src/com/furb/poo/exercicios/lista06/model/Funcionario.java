package com.furb.poo.exercicios.lista06.model;

/**
 *
 * @author André Felipe Bürger (afburger@furb.br)
 */
public class Funcionario {

    private String nome;
    private double salario;

    public Funcionario(String nome, double salario) {
       this.nome = nome;
       this.salario = salario;
    }

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
        if (salario <= 0 ) {
            throw new IllegalArgumentException("Salário deve ser maior que Zero");
        }
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
//    public double calcularIrpf() {
//        double imposto = 0;
//        double diferenca = 0;
//        
//        if (salario > 1903.98) {
//           // Faixa 2
//           if (salario <= 2826.65) {
//               diferenca = salario - 1903.98;
//               imposto = diferenca * (7.5/100);
//           } else if (salario <= 3751.05) { // Faixa 3
//               // Calcular da faixa 2
//               diferenca = 2826.65 - 1903.98;
//               imposto = diferenca * (7.5/100);
//               
//               // Calcular da faixa 3
//               diferenca = salario - 2826.65;
//               imposto += diferenca * (15.0/100);
//           } else if (salario <= 4664.68) {
//                // Calcular da faixa 2
//               diferenca = 2826.65 - 1903.98;
//               imposto = diferenca * (7.5/100);
//               
//               // Calcular da faixa 3
//               diferenca = 3751.05 - 2826.65;
//               imposto += diferenca * (15.0/100);
//               
//               // Calcular da faixa 4
//               diferenca = salario - 3751.05;
//               imposto += diferenca * (22.5/100);
//           } else {
//                // Calcular da faixa 2
//               diferenca = 2826.65 - 1903.98;
//               imposto = diferenca * (7.5/100);
//               
//               // Calcular da faixa 3
//               diferenca = 3751.05 - 2826.65;
//               imposto += diferenca * (15.0/100);
//               
//               // Calcular da faixa 4
//               diferenca = 4664.68 - 3751.05;
//               imposto += diferenca * (22.5/100);
//               
//               diferenca = salario - 4664.68;
//               imposto += diferenca * (27.5/100);
//           }
//        }
//        return imposto;
//    }
    
    public double calcularIrpf() {
        double imposto = 0;
        double diferenca = 0;
        
        FaixaIrpf faixaIdentificada = identificarFaixaIrpf();
        
        if (!FaixaIrpf.PRIMEIRA.equals(faixaIdentificada)) {
           // Faixa 2
           if (FaixaIrpf.SEGUNDA.equals(faixaIdentificada)) {
               diferenca = salario - 1903.98;
               imposto = diferenca * (7.5/100);
           } else if (FaixaIrpf.TERCEIRA.equals(faixaIdentificada)) { // Faixa 3
               // Calcular da faixa 2
               diferenca = 2826.65 - 1903.98;
               imposto = diferenca * (7.5/100);
               
               // Calcular da faixa 3
               diferenca = salario - 2826.65;
               imposto += diferenca * (15.0/100);
           } else if (FaixaIrpf.QUARTA.equals(faixaIdentificada)) {
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
    
    public FaixaIrpf identificarFaixaIrpf() {
        if (salario <= 1903.98) {
            return FaixaIrpf.PRIMEIRA;
        } else if (salario <= 2826.65) {
            return FaixaIrpf.SEGUNDA;
        } else if (salario <= 3751.05) {
            return FaixaIrpf.TERCEIRA;
        } else if (salario <= 4664.68) {
            return FaixaIrpf.QUARTA;
        } else {
            return FaixaIrpf.QUINTA;
        }
    }
    
}
