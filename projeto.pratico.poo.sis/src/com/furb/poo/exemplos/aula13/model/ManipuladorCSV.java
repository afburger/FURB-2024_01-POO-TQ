/**
 * 
 */
package com.furb.poo.exemplos.aula13.model;

/**
 * @author André Felipe Bürger (afburger@furb.br)
 *
 */
import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ManipuladorCSV {

	private static final String FILE_PATH = "C:\\Temp\\pessoas.csv";

	// Adiciona uma nova pessoa ao arquivo CSV
	public void adicionarPessoa(PessoaCSV pessoa) throws IOException {
		
//		 try (FileWriter fw = new FileWriter(FILE_PATH, true); 
//				 PrintWriter pw = new PrintWriter(fw)) {
//			 
//	            pw.println(pessoa.toString());
//	            
//	        }
		
		PrintWriter pw = null;
		
		try {
			FileWriter fw = new FileWriter(FILE_PATH, true); 
			pw = new PrintWriter(fw);
			pw.println(pessoa.toString());
			
		} finally {
			pw.close();
		}
	}

	// Lê todas as pessoas do arquivo CSV
	public List<PessoaCSV> lerPessoas() throws IOException {
		
            List<PessoaCSV> pessoas = new ArrayList<>();

            Scanner sc = new Scanner(new File(FILE_PATH));

            String linha;

            while (sc.hasNext()) {
                linha = sc.nextLine();
                String[] dados = linha.split(",");
                int id = Integer.parseInt(dados[0]);
                String nome = dados[1];
                int idade = Integer.parseInt(dados[2]);
                pessoas.add(new PessoaCSV(id, nome, idade));
            }
			
            return pessoas;
	}

	// Atualiza uma pessoa pelo ID no CSV
	public void atualizarPessoa(int id, String novoNome, int novaIdade) throws IOException {
		
		List<PessoaCSV> pessoas = lerPessoas();
		
		try (PrintWriter pw = new PrintWriter(new FileWriter(FILE_PATH))) {
		
			for (PessoaCSV pessoa : pessoas) {

                            if (pessoa.getId() == id) {
                                pessoa.setNome(novoNome);
                                pessoa.setIdade(novaIdade);
                            }

                        pw.println(pessoa.toString());

                    }
		}
	}

	
	// Exibe todas as pessoas
	public void listarPessoas() throws IOException {
		
		List<PessoaCSV> pessoas = lerPessoas();
		
		for (PessoaCSV pessoa : pessoas) {
			System.out.println(pessoa);
		}
		
	}
	
	public static void main(String[] args) {
		try {
			ManipuladorCSV manipulador = new ManipuladorCSV();

			// Adiciona algumas pessoas ao CSV
			manipulador.adicionarPessoa(new PessoaCSV(1, "João", 30));
			manipulador.adicionarPessoa(new PessoaCSV(2, "André", 25));

			// Atualiza a pessoa com ID 1
			manipulador.atualizarPessoa(2, "André Felipe", 37);

			// Lista todas as pessoas
			System.out.println("Lista de Pessoas:");
			manipulador.listarPessoas();
			
			manipulador.adicionarPessoa(new PessoaCSV(6, "Pedro", 35));

		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
