public class App {
    public static void main(String[] args) throws Exception {
        Contato a = new Contato();

        Contato b = new Contato("Clodoado", 1);

        a.setId(1);
        a.endereco = "AvParalela";
        a.nome = "Josiscleison";
        a.telefone = 98989898;

        b.setId(2);
        b.endereco = "Vilas";
        b.telefone = 87878787;

        System.out.println(a.endereco + "\n" + a.nome + "\n" + a.telefone + "\n" + a.getId());
        System.out.println(b.endereco + "\n" + b.nome + "\n" + b.telefone + "\n" + b.getId());
    }
}
