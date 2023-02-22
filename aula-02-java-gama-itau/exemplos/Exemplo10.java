package exemplos;

public class Exemplo10 {
    
        public static void main(String[] args) {
            Proprietario proprietario = new Proprietario("João", "9999-8888");
            Animal animal = new Animal("Rex", "Vira-lata", 2015, proprietario);
    
            System.out.println("Animal: " + animal.getNome());
            System.out.println("Raça: " + animal.getRaca());
            System.out.println("Ano de Nascimento: " + animal.getAnoNascimento());
            System.out.println("Proprietário: " + animal.getProprietario().getNome());
            System.out.println("Telefone do Proprietário: " + animal.getProprietario().getTelefone());
            proprietario.setTelefona("(12) 9999-9996");
            System.out.println("Novo telefone do Proprietário: " + proprietario.getTelefone());
        }
    
}
