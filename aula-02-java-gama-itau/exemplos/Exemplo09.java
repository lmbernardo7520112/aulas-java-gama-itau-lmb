package exemplos;

public class Exemplo09 {
   
        public static void main(String[] args) {
            Robo robo = new Robo(10, 10);
            robo.mover('N');
            robo.mover('N');
            robo.mover('L');
            robo.mover('L');
            System.out.println("Posição final: (" + robo.getX() + ", " + robo.getY() + ")");
        }
}

