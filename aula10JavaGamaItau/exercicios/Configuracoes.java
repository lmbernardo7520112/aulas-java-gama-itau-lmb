package aula10JavaGamaItau.exercicios;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import java.io.FileWriter;

public class Configuracoes {

    
        
    

    private String nomePerfil;
    private String modoExibicao;
    private String padraoIdioma;

    public Configuracoes() {
        // Verifica se o arquivo de configuração existe
        File arquivoConfig = new File("config.txt");
        if (arquivoConfig.exists()) {
            // Se o arquivo existe, lê as configurações gravadas
            try {
                Scanner scanner = new Scanner(arquivoConfig);
                nomePerfil = scanner.nextLine();
                modoExibicao = scanner.nextLine();
                padraoIdioma = scanner.nextLine();
                scanner.close();
                // Exibe as opções gravadas na tela
                System.out.println("Nome do perfil: " + nomePerfil);
                System.out.println("Modo de exibição: " + modoExibicao);
                System.out.println("Padrão de idioma: " + padraoIdioma);
            } catch (IOException e) {
                e.printStackTrace();
            }
        } else {
            // Se o arquivo não existe, pergunta ao usuário as opções e grava no arquivo
            Scanner scanner = new Scanner(System.in);
            System.out.print("Digite o nome do perfil: ");
            nomePerfil = scanner.nextLine();
            System.out.print("Digite o modo de exibição (claro/escuro): ");
            modoExibicao = scanner.nextLine();
            System.out.print("Digite o padrão de idioma (BR/US): ");
            padraoIdioma = scanner.nextLine();
            scanner.close();
            try {
                FileWriter writer = new FileWriter(arquivoConfig);
                writer.write(nomePerfil + "\n");
                writer.write(modoExibicao + "\n");
                writer.write(padraoIdioma + "\n");
                writer.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    // Métodos getter para acessar as configurações
    public String getNomePerfil() {
        return nomePerfil;
    }

    public String getModoExibicao() {
        return modoExibicao;
    }

    public String getPadraoIdioma() {
        return padraoIdioma;
    }
}

