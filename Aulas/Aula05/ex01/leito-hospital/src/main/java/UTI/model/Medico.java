package UTI.model;

public class Medico {
  private int id;
  private String nome;
  private String especializacao;

  public Medico() {

  }

  public Medico(int id, String nome, String especializacao) {
    this.id = id;
    this.nome = nome;
    this.especializacao = especializacao;
  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public String getEspecializacao() {
    return especializacao;
  }

  public void setEspecializacao(String especializacao) {
    this.especializacao = especializacao;
  }

}
