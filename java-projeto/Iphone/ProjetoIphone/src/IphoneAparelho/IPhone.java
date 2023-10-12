package IphoneAparelho;

public class IPhone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet {


    @Override
    public void ligar(String numero) {
        System.out.println("Ligando");
    }

    @Override
    public void atender(String numero) {
        System.out.println("Atendendo numero");
    }

    @Override
    public void iniciarCorreioVoz(String mensagem, String destinatario) {
        System.out.println("Iniciando correio de voz");
    }

    @Override
    public void exibirPagina(String url) {
        System.out.println("Exibindo pagina");
    }

    @Override
    public void adicionarNovaAba(String url) {
        System.out.println("Adicionado nova aba");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Atualizando Pagina");
    }

    @Override
    public void tocar() {
        System.out.println("Tocando Musica");
    }

    @Override
    public void pausar() {
        System.out.println("Pausando Musica");
    }

    @Override
    public void selecionarMusica() {
        System.out.println("Selecionando Musica");
    }
}
