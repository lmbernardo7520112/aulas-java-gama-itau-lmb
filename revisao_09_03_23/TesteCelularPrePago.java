public class TesteCelularPrePago {
    public static void main(String[] args) {
        CelularPrePago celular1 = new CelularPrePago("987654321");

        System.out.println(celular1.imprimir());

        celular1.recarregar(20);
        System.out.println(celular1.imprimir());

        celular1.fazerLigacao();
        System.out.println(celular1.imprimir());

        celular1.recarregar(-5);
        System.out.println(celular1.imprimir());

        CelularPrePago celular2 = new CelularPrePago("Fulano de Tal", "123456789", 50);

        System.out.println(celular2.imprimir());

        celular2.fazerLigacao();
        celular2.fazerLigacao();
        celular2.fazerLigacao();
        celular2.recarregar(30);
        celular2.fazerLigacao();

        System.out.println(celular2.imprimir());
    }
}
