public class Contato {

  private int id;
  public int count;
  public int tel;
  public String nome;
  public String ende;

  Contato() {
    this.setId(id);
    this.nome = "Lucas Souza";
    this.tel = 87654321;
    this.ende = "Av Parelela";

  }

  Contato(String nome) {
    this.setId(id);
    this.nome = nome;
    this.tel = 12345678;
    this.ende = "São Marcos";
  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    count++;
    this.id = count;
  }

  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public String getEnde() {
    return ende;
  }

  public void setEnde(String ende) {
    this.ende = ende;
  }

  public int getTel() {
    return tel;

  }

  public void setTel(int tel) {
    this.tel = tel;

  }

  public String listaContatos() {

    return ("Id: " + getId() + "\nNome: " + nome + "\nEndereço: " + ende + "\nTelefone: " + tel);
  }

}