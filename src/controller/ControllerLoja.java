package controller;

import br.gui.listagenerica.Lista;
import model.Loja;

public class ControllerLoja {
	Lista[] tabelaHashLoja;

	public ControllerLoja() {
		tabelaHashLoja = new Lista[3];
		inicializarTabelaHash();
	}

	
	private void inicializarTabelaHash() {
		int tamanho = tabelaHashLoja.length;
		for (int i = 0; i < tamanho; i++) {
			tabelaHashLoja[i] = new Lista();
		}
	}
	
	public void inserir(Loja loja) throws Exception{
		int posicao = loja.hashCode();
		tabelaHashLoja[posicao].addFirst(loja);
    }
	
	public void mostrarBusca(String lojaConsulta) throws Exception {
		int[] valores = buscar(lojaConsulta);
    	Loja loja = (Loja) tabelaHashLoja[valores[0]].get(valores[1]);
    	System.out.println(loja.toString());
    }
	
	public void excluir(String lojaRemove) throws Exception {
		int[] valores = buscar(lojaRemove);
        tabelaHashLoja[valores[0]].remove(valores[1]);
    }
	
	private int[] buscar(String lojaConsulta) throws Exception {
    	for (int i = 0; i < tabelaHashLoja.length; i++) {
            int tamanho = tabelaHashLoja[i].size();
            for (int j = 0; j < tamanho; j++) {
                Loja loja = (Loja) tabelaHashLoja[i].get(j);
                if (loja.nome.equalsIgnoreCase(lojaConsulta)) {
                	return new int[]{i, j};
                }
            }
        }
        throw new Exception("Loja não encontrada");
    }
	
	public void carregaLoja() throws Exception{

        // Andar Térreo
        inserir(new Loja(0, "celulares e smartphones", "Artigos para telefonia móvel"));
        inserir(new Loja(0, "tv e vídeo", "Artigos para televisores"));
        inserir(new Loja(0, "consoles e games", "Artigos para videogames"));
        inserir(new Loja(0, "áudio", "Artigos de som"));
        inserir(new Loja(0, "telefonia fixa", "Artigos para telefonia"));
        inserir(new Loja(0, "informática", "Computadores e laptops corporativos"));
        inserir(new Loja(0, "acessórios e periféricos", "Hardwares"));
        inserir(new Loja(0, "pc gamer", "Computadores e laptops gamers"));
                            
        // 1° Andar         
        inserir(new Loja(1, "eletrodomésticos", "Artigos eletrodomésticos"));
        inserir(new Loja(1, "eletroportáteis", "Artigos eletroportáteis"));
        inserir(new Loja(1, "ar e ventilação", "Ventiladores e ar condicionado"));
        inserir(new Loja(1, "móveis e decoração", "Móveis"));
        inserir(new Loja(1, "casa e construção", "Materiais para construção"));
        inserir(new Loja(1, "cama, mesa e banho", "Artigos para cama, mesa e banho"));
                            
        // 2° andar         
        inserir(new Loja(2, "livros", "Livraria"));
        inserir(new Loja(2, "instrumentos musicais", "Instrumentos musicais e acessórios"));
        inserir(new Loja(2, "música", "Discos"));
        inserir(new Loja(2, "filmes e séries", "DVD e Blu-ray"));
        inserir(new Loja(2, "mercado", "Itens de supermercado"));
        inserir(new Loja(2, "automotivo", "Peças e acessórios para automóveis"));
        inserir(new Loja(2, "brinquedos", "Itens infantis"));
        inserir(new Loja(2, "bebês", "Itens para a primeira infância"));
        inserir(new Loja(2, "gift cards", "Cartões presente"));
        inserir(new Loja(2, "pet shop", "Comida e acessórios para pet"));
        inserir(new Loja(2, "papelaria", "Itens de papelaria"));
        
	}
	
}

