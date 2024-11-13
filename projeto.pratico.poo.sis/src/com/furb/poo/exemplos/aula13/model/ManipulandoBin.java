/**
 * 
 */
package com.furb.poo.exemplos.aula13.model;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.RandomAccessFile;

/**
 * @author André Felipe Bürger (andre.burger@publicatecnologia.com.br)
 *
 */
public class ManipulandoBin {

	 private static final String FILE_PATH = "C:\\Temp\\pessoas.dat";

	    // Grava um novo objeto Pessoa no final do arquivo
	    public void gravarPessoa(PessoaBin pessoa) throws IOException {
	    	
	        try (RandomAccessFile raf = new RandomAccessFile(FILE_PATH, "rw");
	             ByteArrayOutputStream baos = new ByteArrayOutputStream();
	             ObjectOutputStream oos = new ObjectOutputStream(baos)) {

	            oos.writeObject(pessoa);
	            oos.flush();
	            byte[] data = baos.toByteArray();

	            raf.seek(raf.length());  // Move para o fim do arquivo
	            raf.writeInt(data.length);  // Grava o tamanho do objeto
	            raf.write(data);  // Grava o objeto serializado
	        }
	    }

	    // Atualiza uma Pessoa pelo ID
	    public void atualizarPessoa(int id, String novoNome, int novaIdade) throws IOException, ClassNotFoundException {
	    	
	        try (RandomAccessFile raf = new RandomAccessFile(FILE_PATH, "rw")) {
	            while (raf.getFilePointer() < raf.length()) {
	               
	            	long posicaoInicio = raf.getFilePointer();
	                int tamanhoObjeto = raf.readInt();
	                byte[] data = new byte[tamanhoObjeto];
	                
	                raf.readFully(data);

	                try (ObjectInputStream ois = new ObjectInputStream(new ByteArrayInputStream(data))) {
	                	PessoaBin pessoa = (PessoaBin) ois.readObject();

	                    if (pessoa.getId() == id) {  // Encontra a pessoa com o ID
	                        pessoa.setNome(novoNome);
	                        pessoa.setIdade(novaIdade);

	                        try (ByteArrayOutputStream baos = new ByteArrayOutputStream();
	                             ObjectOutputStream oos = new ObjectOutputStream(baos)) {

	                            oos.writeObject(pessoa);
	                            oos.flush();
	                            byte[] novosDados = baos.toByteArray();

	                            if (novosDados.length <= tamanhoObjeto) {  
	                                raf.seek(posicaoInicio + 4);  
	                                raf.write(novosDados);
	                            } else {
	                                System.out.println("Erro: Novo objeto excede o tamanho do espaço reservado.");
	                            }
	                        }
	                        return;
	                    }
	                }
	            }
	        }
	    }

	    // Exibe todas as Pessoas no arquivo
	    public void listarPessoas() throws IOException, ClassNotFoundException {
	        try (RandomAccessFile raf = new RandomAccessFile(FILE_PATH, "r")) {
	        	
	            while (raf.getFilePointer() < raf.length()) {
	            
	            	int tamanhoObjeto = raf.readInt();
	                byte[] data = new byte[tamanhoObjeto];
	                raf.readFully(data);

	                try (ObjectInputStream ois = new ObjectInputStream(new ByteArrayInputStream(data))) {
	                	PessoaBin pessoa = (PessoaBin) ois.readObject();
	                    System.out.println(pessoa);
	                }
	                
	            }
	        }
	    }

	    public static void main(String[] args) {
	        try {
	            ManipulandoBin arquivo = new ManipulandoBin();

	            // Adiciona algumas pessoas
	            arquivo.gravarPessoa(new PessoaBin(1, "Felipe", 30));
	            arquivo.gravarPessoa(new PessoaBin(2, "André", 34));

	            // Atualiza a pessoa com ID 1
	            arquivo.atualizarPessoa(1, "Felipe Atualizado", 31);

	            // Lista todas as pessoas
	            System.out.println("Lista de Pessoas:");
	            arquivo.listarPessoas();

	        } catch (IOException | ClassNotFoundException e) {
	            e.printStackTrace();
	        }
	    }
	}
