package model;

public class Loja {
	 public int andar;
	 public String nome;
	 public String descricao;
	 
	 public Loja () {
	 }

	 public Loja(int andar, String nome, String descricao) {
        this.andar = andar;
        this.nome = nome;
        this.descricao = descricao;
    }

    @Override
    public String toString() {
        return "Loja [Nome: " + nome + ", Andar: " + andar + ", Descrição: " + descricao + "]";
    }
    
    @Override
	public int hashCode() {
		return andar % 3;
	}
}
