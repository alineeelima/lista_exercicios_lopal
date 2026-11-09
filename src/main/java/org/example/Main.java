package org.example;

import java.io.*;

public class Main {
    public static void main(String[] args) {
        int linux = 0;
        int windows = 0;
        try {
            BufferedReader leitor = new BufferedReader(new FileReader("C:/Users/53602007820/Downloads/ativos.csv"));
            BufferedWriter escritor = new BufferedWriter(new FileWriter("C:/Users/53602007820/Downloads/relatorio.csv"));
            BufferedWriter escrever = new BufferedWriter(new FileWriter("C:/Users/53602007820/Downloads/relatorio2.csv"));
            String linha = leitor.readLine();
            escritor.write(linha+", criticidade");
            escrever.write(linha+", criticidade");
            escrever.newLine();
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
                    status = ", On-Line";
                    windows += 1;
                }else if (so.contains("Linux")){
                    status = ", Em monitoramento";
                    linux += 1;
                }else{
                    status = "";
                }
                if (criticidade == "Alta"){
                    escrever.write(host + "," + ip + "," + so + ", " + criticidade + status);
                    escrever.newLine();
                }
                escritor.write(host+","+ip+","+so+","+criticidade+status);
                escritor.newLine();
            }
            leitor.close();
            escritor.close();
            escrever.close();
            System.out.println("O relatório foi gerado com sucesso!");
            System.out.println("O relatório2 foi gerado com sucesso!");
            escrever.newLine();
        }catch (Exception e){
            System.out.println("Erro: "+ e.getMessage());
        }
        System.out.println("A quantidade de dispositivos que utilizam o sistema operacional Linux é: "+linux);
        System.out.println("A quantidade de dispositivos que utilizam o sistema operacional Windows é: "+windows);
    }
}




