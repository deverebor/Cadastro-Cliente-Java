public class App {
    public static void main(String[] args) throws Exception {
        Contato a = new Contato();

        Contato b = new Contato("Geisielle", 1);

        a.nome = "Lucas";
        a.end = "Casto Branco";
        a.tel = 87654321;

        b.end = "Cidade Baixa";
        b.tel = 12345678;

        System.out.println("Id: " + a.getId() + "\nNome: " + a.nome + "\nEndereço: " + a.end + "\nTelefone: " + a.tel);
        System.out.println("\n-------------------------------------------------------------------\n");
        System.out.println("Id: " + b.getId() + "\nNome: " + b.nome + "\nEndereço: " + b.end + "\nTelefone: " + b.tel);
    }
}
