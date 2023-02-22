package aula02JavaGamaItau.exemplos;

public class Ebook {
    private String titulo;
    private String autor;
    private int totalPaginas;
    private int paginaAtual;
  
    public Ebook(String titulo, String autor, int totalPaginas) {
      this.titulo = titulo;
      this.autor = autor;
      this.totalPaginas = totalPaginas;
      this.paginaAtual = 1;
    }
  
    public void avancarPagina() {
      if (paginaAtual < totalPaginas) {
        paginaAtual++;
      }
    }
  
    public void retrocederPagina() {
      if (paginaAtual > 1) {
        paginaAtual--;
      }
    }
  
    public void irParaPagina(int pagina) {
      if (pagina >= 1 && pagina <= totalPaginas) {
        paginaAtual = pagina;
      }
    }
  
    public void exibirPagina() {
      System.out.println("Página atual: " + paginaAtual);
    }
  
    public void mostrarCapa() {
      System.out.println("Título: " + titulo);
      System.out.println("Autor: " + autor);
      System.out.println("Total de páginas: " + totalPaginas);
    }
  }
  