package testagem;

import aparelhoCompleto.AparelhoCelular;

public class Main {

	public static void main(String[] args) {
		AparelhoCelular cell = new AparelhoCelular();
		
		cell.tocar();
		cell.pausar();
		cell.selecionarMusica();
		System.out.println("--------------------------------");
		cell.exibirPagina();
		cell.adicionarNovaAba();
		cell.atualizarPagina();
		System.out.println("--------------------------------");
		cell.atender();
		cell.ligar();
		cell.iniciarCorrerioVoz();
	}

}
