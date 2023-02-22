package exemplos;

public class Exemplo11 {
    
        public static void main(String[] args) {
            Placar p1 = new Placar();
            Placar p2 = new Placar("Corinthians", "Palmeiras");
            Placar p3 = new Placar("São Paulo", "Santos", 1, 2);
            
            System.out.println(p1.toString()); // Time 1 0 x 0 Time 2
            System.out.println(p2.toString()); // Corinthians 0 x 0 Palmeiras
            System.out.println(p3.toString()); // São Paulo 2 x 1 Santos
        }
    
}
