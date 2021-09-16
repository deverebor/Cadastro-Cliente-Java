public class App {
    public static void main(String[] args) throws Exception {
        Contato a = new Contato();

        Contato b = new Contato("Clodoado", 1);

        System.out.println(
                "Id: " + a.getId() + "\nNome: " + a.nome + "\nEndereço: " + a.endereco + "\nTelefone: " + a.telefone);
        System.out.println("\n-------------------------------------------------------------------\n");
        System.out.println(
                "Id: " + b.getId() + "\nNome: " + b.nome + "\nEndereço: " + b.endereco + "\nTelefone: " + b.telefone);
    }
}
