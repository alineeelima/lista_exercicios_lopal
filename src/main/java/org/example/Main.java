package org.example;

import java.io.*;

public class Main {
    public static void main(String[] args) {
        try {
            BufferedReader leitor = new BufferedReader(new FileReader("C:/Users/53602007820/Downloads/ativos.csv"));
            BufferedWriter escritor = new BufferedWriter(new FileWriter("C:/Users/53602007820/Downloads/relatorio.csv"));
            String linha = leitor.readLine();
            escritor.write(linha+", criticidade");
            escritor.newLine();
            while ((linha = leitor.readLine())!= null){
                String[] dados = linha.split(",");
                String host = dados[0];
                String ip = dados[1];
                String so = dados[2];
                String criticidade;
                String status;

                if (so.contains("Linux")){
                    criticidade = "Alta";
                }else{
                    criticidade = "Baixa";
                }
                if (so.contains("Windows")){
                    status = "On-Line";
                }else if (so.contains("Linux")){
                    status = "Em monitoramento";
                }else{
                    status = "";
                }

                escritor.write(host + "," + ip + "," + so + ", " + criticidade + "," + status);
                escritor.newLine();
            }
            leitor.close();
            escritor.close();
            System.out.println("O relatório foi gerado com sucesso!");
        }catch (Exception e){
            System.out.println("Erro: "+ e.getMessage());
        }
    }
}



