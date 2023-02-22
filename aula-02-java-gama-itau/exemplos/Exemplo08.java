package exemplos;

public class Exemplo08 {

        public static void main(String[] args) {
          Ebook ebook = new Ebook("Título do livro", "Autor do livro", 100);
          
          ebook.mostrarCapa();
          ebook.exibirPagina();
          
          ebook.avancarPagina();
          ebook.exibirPagina();
          
          ebook.irParaPagina(50);
          ebook.exibirPagina();
          
          ebook.retrocederPagina();
          ebook.exibirPagina();

          
        }
}

