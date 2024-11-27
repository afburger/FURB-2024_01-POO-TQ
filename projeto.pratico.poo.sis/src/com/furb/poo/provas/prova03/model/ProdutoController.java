package com.furb.poo.provas.prova03.model;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Classe responsável por fazer as funções com um {@code Produto}
 * 
 * @author André Felipe Bürger (afburger@furb.br)
 */
public class ProdutoController {

    private final static double ZERO_DOUBLE = 0.0;
    private final static int ZERO_INT = 0;
    
    public final static String FILE_PATH = "C:\\Temp\\produtos.csv";
    
    public Double calcularMultiplicacao(Double valor, int quantidade) {
        if (quantidade == ZERO_INT || valor == ZERO_DOUBLE) {
            throw new MultiplicacaoPorZeroException();
        }
        return valor * quantidade;
    }
    
    public void salvarProdutos(List<Produto> produtos) throws IOException {
        PrintWriter pw = null;

        try {
            FileWriter fw = new FileWriter(FILE_PATH, false);
            pw = new PrintWriter(fw);
            
            for (Produto produto : produtos) {
                pw.println(produto.persistir());
            }

        } finally {
            if (pw != null) {
                pw.close();
            }
        }
    }
    
    public List<Produto> carregarDados(String caminho) throws FileNotFoundException, IOException, NumberFormatException {
        List<Produto> produtos = new ArrayList<>();

        Scanner sc = new Scanner(new File(caminho));

        String linha;

        while (sc.hasNext()) {
            linha = sc.nextLine();
            String[] dados = linha.split(",");
            String nome = dados[0];
            Double preco = Double.parseDouble(dados[1]);
            int quantidade = Integer.parseInt(dados[2]);
            Double valorTotal = Double.parseDouble(dados[3]);

            Produto produto = new Produto();
            produto.setNome(nome);
            produto.setPreco(preco);
            produto.setQuantidade(quantidade);
            produto.setValorTotal(valorTotal);
            
            produtos.add(produto);
        }

        return produtos;
    }
}
