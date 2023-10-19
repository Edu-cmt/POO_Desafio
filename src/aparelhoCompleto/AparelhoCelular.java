package aparelhoCompleto;

import apps.reprodutorM.ReprodutorMusical;
import equipamento.AparelhoTelefonico2;
import apps.navegador.*;


public class AparelhoCelular implements ReprodutorMusical, NavegadorDeInternet, AparelhoTelefonico2{
	public void ligar() {
		System.out.println("Ligando para...");
		
	}

	public void atender() {
		System.out.println("Atendendo chamada...");
		
	}

	public void iniciarCorrerioVoz() {
		System.out.println("O correio de voz foi iniciado!");
		
	}
	
	public void exibirPagina() {
		System.out.println("Exibindo pagina...");
		
	}
	public void adicionarNovaAba() {
		System.out.println("Nova aba de navegação sendo adicionada!");
		
	}

	public void atualizarPagina() {
		System.out.println("Atualizando a pagina...");
		
	}

	public void tocar() {
		System.out.println("Reproduzindo música {}...");
		
	}
	
	public void pausar() {
		System.out.println("Mídia pausada!");
		
	}

	public void selecionarMusica() {
		System.out.println("Selecionando 'Como nossos pais - Elis Regina'...");
		
	}

}
