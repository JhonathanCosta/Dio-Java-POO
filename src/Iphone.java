public class Iphone implements MusicaPlayer, AparelhoTelefonico, NavegadorInternet {
  
   
  
    public void play() {
        // Implementação para reproduzir música
        System.out.println("Reproduzindo música...");
    }

    @Override
    public void pause() {
        // Implementação para pausar música
        System.out.println("Pausando música...");
    }

    @Override
    public void fazerChamada(String numero) {
        // Implementação para fazer uma chamada
        System.out.println("Fazendo chamada para " + numero);
    }

    @Override
    public void encerrarChamada() {
        // Implementação para encerrar uma chamada
        System.out.println("Chamada encerrada");
    }

    @Override
    public void navegarInternet(String url) {
        // Implementação para abrir uma página da web
        System.out.println("Navegando na web para " + url);
    }

    @Override
    public void pesquisar(String termo) {
        // Implementação para realizar uma pesquisa na internet
        System.out.println("Pesquisando por: " + termo);
    }

    public static void main(String[] args) {
        Iphone meuiPhone = new Iphone();

        meuiPhone.play();
        meuiPhone.fazerChamada("99 9 999-999");
        meuiPhone.navegarInternet("https://www.example.com");
    }

}
