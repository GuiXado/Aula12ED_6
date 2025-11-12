package view;

import javax.swing.JOptionPane;

import br.gui.listagenerica.Lista;
import controller.ControllerLoja;
import model.Loja;

public class Principal {

	public static void main(String[] args) {
		 try {
			 ControllerLoja cl = new ControllerLoja();
			 cl.carregaLoja();
	
			 String menu = "1 - Inserir Loja\n"
			 		+ "2 - Consultar Loja\n"
			 		+ "3 - Remover Loja\n"
			 		+ "9 - Sair";
			 int opc;
			 do {
				 opc = Integer.parseInt(JOptionPane.showInputDialog(menu));
				 switch(opc) {
				 	case 1:
				 		Loja l = new Loja();
				 		l.andar = Integer.parseInt(JOptionPane.showInputDialog("Digite o andar: (0 - para térreo)"));
				 		l.nome = JOptionPane.showInputDialog("Digite o nome: ");
				 		l.descricao = JOptionPane.showInputDialog("Digite a descrição: ");
				 		cl.inserir(l);
				 		break;
				 	case 2:
				 		cl.mostrarBusca(JOptionPane.showInputDialog("Digite o nome da loja para consulta: "));
						break;
				 	case 3:
				 		String lojaR = JOptionPane.showInputDialog("Digite o nome da loja que deseja remover: ");
				 		cl.excluir(lojaR);
				 		JOptionPane.showMessageDialog(null,"Loja Removida!");
				 		break;
				 	case 9:
				 		break;
				 	default:
				 		JOptionPane.showMessageDialog(null, "Inválido!");
				 }
				 
			 } while (opc != 9);
		 } catch (Exception e) {
			 System.err.println(e.getMessage());
		 }
		 
	}

}

