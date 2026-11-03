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
                System.out.println("Os hosts que tem o sistema operacional Linux  são: ");
                while((linha = arquivoBuffer.readLine())!= null){
                    String[] campos = linha.split(",");
                    String sistema = campos[2];
                    if (sistema.equalsIgnoreCase("linux")) {
                        String host = campos[0];
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




