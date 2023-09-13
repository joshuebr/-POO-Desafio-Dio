public class iPhone {
    private String modelo;
    private int armazenamento;

    public iPhone(String modelo, int armazenamento) {
        this.modelo = modelo;
        this.armazenamento = armazenamento;
    }

    public void ligar() {
        System.out.println("iPhone ligado.");
    }

    public void atenderChamada() {
        System.out.println("Chamada atendida.");
    }

    public void iniciarCorreioVoz() {
        System.out.println("Correio de voz iniciado.");
    }

    public void tocarMusica() {
        System.out.println("Música sendo tocada.");
    }

    public void pausarMusica() {
        System.out.println("Música pausada.");
    }

    public void selecionarMusica() {
        System.out.println("Música selecionada.");
    }

    public void exibirPagina() {
        System.out.println("Página sendo exibida.");
    }

    public void adicionarNovaAba() {
        System.out.println("Nova aba adicionada.");
    }

    public void atualizarPagina() {
        System.out.println("Página atualizada.");
    }

    public static void main(String[] args) {
        iPhone meuiPhone = new iPhone("iPhone 12", 256);

        meuiPhone.ligar();
        meuiPhone.atenderChamada();
        meuiPhone.iniciarCorreioVoz();

        meuiPhone.tocarMusica();
        meuiPhone.pausarMusica();
        meuiPhone.selecionarMusica();

        meuiPhone.exibirPagina();
        meuiPhone.adicionarNovaAba();
        meuiPhone.atualizarPagina();
    }
}
