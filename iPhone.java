package ProjetoiPhone;

public class iPhone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet {
    private String modelo;
    private int armazenamento;

    public iPhone(String modelo, int armazenamento) {
        this.modelo = modelo;
        this.armazenamento = armazenamento;
    }

    @Override
    public void ligar() {
        System.out.println("Chamada iniciada.");
    }

    @Override
    public void atenderChamada() {
        System.out.println("Chamada atendida.");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Correio de voz iniciado.");
    }

    @Override
    public void tocarMusica() {
        System.out.println("Música sendo tocada.");
    }

    @Override
    public void pausarMusica() {
        System.out.println("Música pausada.");
    }

    @Override
    public void selecionarMusica() {
        System.out.println("Música selecionada.");
    }

    @Override
    public void exibirPagina() {
        System.out.println("Página sendo exibida.");
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Nova aba adicionada.");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Página atualizada.");
    }
}
