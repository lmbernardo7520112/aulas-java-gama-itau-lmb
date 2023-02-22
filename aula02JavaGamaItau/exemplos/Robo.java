package aula02JavaGamaItau.exemplos;

public class Robo {
    private int x;
    private int y;
    private int maxX;
    private int maxY;

    public Robo(int maxX, int maxY) {
        this.x = 0;
        this.y = 0;
        this.maxX = maxX;
        this.maxY = maxY;
    }

    public void mover(char direcao) {
        switch (direcao) {
            case 'N':
                if (this.y < this.maxY) {
                    this.y++;
                }
                break;
            case 'S':
                if (this.y > 0) {
                    this.y--;
                }
                break;
            case 'L':
                if (this.x < this.maxX) {
                    this.x++;
                }
                break;
            case 'O':
                if (this.x > 0) {
                    this.x--;
                }
                break;
            default:
                System.out.println("Direção inválida");
                break;
        }
    }

    public int getX() {
        return this.x;
    }

    public int getY() {
        return this.y;
    }
}