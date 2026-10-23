package org.example;

import java.io.*;

public class Main {
    public static void main(String[] args) {
        String caminhoArquivo = "C://Users//53602007820.SESISENAI.003//Downloads//controle_estoque(Sheet1) (1).csv/";
        File arquivo = new File(caminhoArquivo);
        if(arquivo.exists()){
            System.out.println("O arquivo existe. Iniciado a leitura...");
            try(BufferedReader arquivoBuffer = new BufferedReader(new FileReader(arquivo))){
                String linha;
                while((linha = arquivoBuffer.readLine())!= null){
                    String[] campos =linha.split(";");
                    for(String campo:campos){
                        System.out.println(campo + "|");
                    }
                }
                arquivoBuffer.close();
            }catch(IOException erro){
                System.out.println("Erro na leitura do arquivo"+erro.getMessage());
            }
        }else{
            System.out.println("O arquivo não existe.");
        }
    }
}











