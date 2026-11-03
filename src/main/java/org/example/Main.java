package org.example;

import java.io.*;

public class Main {
    public static void main(String[] args) {

        String caminhoArquivo = "C:/Users/53602007820/Downloads/ativos.csv";

        File arquivo = new File(caminhoArquivo);

        if(arquivo.exists()){

            System.out.println("O arquivo existe. Iniciado a leitura...");

            try(BufferedReader arquivoBuffer = new BufferedReader(new FileReader(arquivo))){

                String linha;

                while((linha = arquivoBuffer.readLine())!= null){
                    String[] campos =linha.split(",");
                    String host = campos[0];
                    for(String campo:campos){
                        System.out.println(host);
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











