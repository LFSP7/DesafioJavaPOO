package AparelhoApple;

public class Iphone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet {
	//ReprodutorMusical
	public void tocar() {
        System.out.println("Música tocando!");

    }
	
	public void pausar() {
        System.out.println("Música pausada!");

    }
	
	public void selecionarMusica() {
        System.out.println("Música selecionada!");

    }
	
	//AparelhoTelefonico
	public void ligar() {
        System.out.println("Ligando!");
    }
	
	public void atender() {
        System.out.println("Atendendo chamada!");

    }
	
	public void iniciarCorreioVoz() {
        System.out.println("Iniciando Correio de Voz!");

    }
	
	//NavegadorInternet
	public void exibirPagina() {
        System.out.println("Exibindo Página!");

    }
	
	public void adicionarNovaAba() {
        System.out.println("Nova aba adicionada!");

    }
	
	public void atualizarPagina() {
        System.out.println("Página atualizada!");

    }
	
	public static void main(String[] args) {
        Iphone iphone = new Iphone();

        iphone.ligar();
        iphone.atender();
        iphone.iniciarCorreioVoz();
        iphone.exibirPagina();
        iphone.adicionarNovaAba();
        iphone.atualizarPagina();
        iphone.tocar();
        iphone.pausar();
        iphone.selecionarMusica();
    }
	
}
