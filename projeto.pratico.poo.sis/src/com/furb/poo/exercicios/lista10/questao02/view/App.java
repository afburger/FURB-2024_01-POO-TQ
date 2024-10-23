
package com.furb.poo.exercicios.lista10.questao02.view;

import com.furb.poo.exercicios.lista10.questao02.model.Empresa;
import com.furb.poo.exercicios.lista10.questao02.model.Funcionario;
import com.furb.poo.exercicios.lista10.questao02.model.Programador;
import com.furb.poo.exercicios.lista10.questao02.model.Venda;
import com.furb.poo.exercicios.lista10.questao02.model.Vendedor;
import java.text.DecimalFormat;

/**
 * 
 * @author André Felipe Bürger (afburger@furb.br)
 */
public class App {
    public static void main(String[] args) {
                
        Empresa empresa = new Empresa("Pudim S/A");
        
        Vendedor vendedor = new Vendedor("Luiz", 1000, 10);
        vendedor.incluirVenda(new Venda(200));
        vendedor.incluirVenda(new Venda(100));
        
        empresa.incluirFuncionario(vendedor);
        
        vendedor = new Vendedor("Paula", 1200, 7);
        vendedor.incluirVenda(new Venda(500));
        vendedor.incluirVenda(new Venda(350));
        vendedor.incluirVenda(new Venda(280));
        empresa.incluirFuncionario(vendedor);
        
        Programador programador = new Programador("Julio", 1000);
        programador.incluirLinguagem("C");
        programador.incluirLinguagem("Java");
        empresa.incluirFuncionario(programador);
        
        programador = new Programador("Ana",1000);
        programador.incluirLinguagem("Java");
        programador.incluirLinguagem("C#");
        empresa.incluirFuncionario(programador);
        
        programador = new Programador("Anderson",1200);
        programador.incluirLinguagem("Phyton");
        empresa.incluirFuncionario(programador);
        
        Funcionario funcionario = new Funcionario("José", 1000);
        empresa.incluirFuncionario(funcionario);
        
        funcionario = new Funcionario("Maria", 1400);
        empresa.incluirFuncionario(funcionario);
        
        DecimalFormat df = new DecimalFormat("R$ 0.00");
        System.out.println(" ********** CUSTO TOTAL COM SALÁRIOS ******** \n "+df.format(empresa.calcularCustosSalarios()));
        
        System.out.println(" ********** RELAÇÃO DE FUNCIONÁRIOS ******** ");
        
        for(Funcionario f : empresa.getFuncionarios()){
            System.out.println(" Nome: "+f.getNome() + "  Salário: "+df.format(f.calcularSalario()));
        }
        
        
        System.out.println(" ********** RELAÇÃO DE VENDEDORES ******** ");
        
        for(Funcionario f : empresa.getFuncionarios()){
            if (f instanceof Vendedor){
                Vendedor v = (Vendedor)f;
                System.out.println(" Nome: "+v.getNome() + "  % Comissão: "+v.getPercentualComissao());
            }
            
        }
        
        System.out.println(" ********** RELAÇÃO DE PROGRAMADORES ******** ");
        
        for(Funcionario f : empresa.getFuncionarios()){
            if (f instanceof Programador){
                Programador p = (Programador)f;
                System.out.println(" Nome: "+p.getNome() + "  Linguagens: "+p.getLinguagens());
            }
        }
        
    }
    
}
