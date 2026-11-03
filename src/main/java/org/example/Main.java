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
                System.out.println("Os IPs dos dispositivos que utilizam o sistema operacional Windows são: ");
                while((linha = arquivoBuffer.readLine())!= null){
                    String[] campos = linha.split(",");
                    String sistema = campos[2];
                    if (sistema.equalsIgnoreCase("windows")) {
                        String ip = campos[1];
                        System.out.println(ip);
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


