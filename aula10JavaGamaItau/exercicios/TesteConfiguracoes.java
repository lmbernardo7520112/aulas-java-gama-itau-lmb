package aula10JavaGamaItau.exercicios;

public class TesteConfiguracoes {

    public static void main(String[] args) {

        // Teste de criação de configurações sem arquivo existente
        Configuracoes configSemArquivo = new Configuracoes();
        System.out.println("Nome do perfil: " + configSemArquivo.getNomePerfil());
        System.out.println("Modo de exibição: " + configSemArquivo.getModoExibicao());
        System.out.println("Padrão de idioma: " + configSemArquivo.getPadraoIdioma());

        // Teste de criação de configurações com arquivo existente
        Configuracoes configComArquivo = new Configuracoes();
        System.out.println("Nome do perfil: " + configComArquivo.getNomePerfil());
        System.out.println("Modo de exibição: " + configComArquivo.getModoExibicao());
        System.out.println("Padrão de idioma: " + configComArquivo.getPadraoIdioma());
    }
}

