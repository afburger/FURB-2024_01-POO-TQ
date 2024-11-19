package com.furb.poo.exercicios.lista12.questao02.model;

import java.util.Scanner;

/**
 *
 * @author André Felipe Bürger (afburger@furb.br)
 */
public class Teclado {
    private Scanner scanner;
    
    public Teclado(){
        scanner = new Scanner(System.in);
    }
    
    public int lerInt(){
        boolean erro = false; 
        int valor = 0;
        do{
          try{    
            valor = Integer.parseInt(scanner.nextLine());
            erro = false;
          }
          catch(NumberFormatException e){
              System.out.println("Valor digitado incorreto. Digite um valor Inteiro.");
              erro = true;
          }  
        }while(erro);
        
        return valor;
    }
    
    public double lerDouble(){
        boolean erro = false; 
        double valor = 0;
        do{
          try{    
            valor = Double.parseDouble(scanner.nextLine());
            erro = false;
          }
          catch(NumberFormatException e){
              System.out.println("Valor digitado incorreto. Digite um valor Double.");
              erro = true;
          }  
        }while(erro);
        
        return valor;
    }
    
    public boolean lerBoolean(){
        boolean retorno = false;
        boolean erro = false;
        do{
            erro = false;  
            String valor = scanner.nextLine();
         
            if (valor.equalsIgnoreCase("sim") || 
                valor.equalsIgnoreCase("verdadeiro") ||
                valor.equalsIgnoreCase("positivo") ||
                valor.equalsIgnoreCase("s")){
                retorno = true;
            }else if (valor.equalsIgnoreCase("nao") || 
                      valor.equalsIgnoreCase("falso") ||
                      valor.equalsIgnoreCase("negativo") ||
                      valor.equalsIgnoreCase("n")){
                retorno = false;
            }else{
                System.out.println("Valor incorreto. Digite novamente.");
                erro = true;
            }
        }while(erro);
        
        return retorno;
    }
    
    public String lerString(){
        return scanner.nextLine();
    }
}
