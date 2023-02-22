package aula02JavaGamaItau.exemplos;

public class Placar {
    private String time1;
    private String time2;
    private int golsTime1;
    private int golsTime2;

    // Construtor padrão
    public Placar() {
        this.time1 = "Time da casa";
        this.time2 = "Visitante";
        //this.golsTime1 = 0;
        //this.golsTime2 = 0;
    }

    public Placar(String time1, String time2) {
        this.time1 = time1;
        this.time2 = time2;
    }

     // Construtor que define os times e o placar
     public Placar(String time1, String time2, int golsTime1, int golsTime2) {
        this.time1 = time1;
        this.time2 = time2;
        this.golsTime1 = golsTime1;
        this.golsTime2 = golsTime2;
    }
    


    public void getTime1(String time1) {
        this.time1 = time1;
    }

    public void setTime1(String time1) {
        this.time1 = time1;
    }

    public String getTime2() {
        return time2;
    }

    public void setTime2(String time2) {
        this.time2 = time2;
    }

    public int getGolsTime1() {
        return golsTime1;
        }

    public void setGolsTime1(int golsTime1) {
        this.golsTime1 = golsTime1;
    }

    public int getGolsTime2() {
        return golsTime2;
    }

    public void setGolsTime2(int golsTime2) {
        this.golsTime2 = golsTime2;
    }


    public void exibirPlacar() {
        System.out.println(time1 + " " + golsTime1 + " X " + golsTime2 + " " + time2);
    }
}
