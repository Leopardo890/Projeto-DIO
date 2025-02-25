public class main {
    

    public static void main(String[] args) {
        
        Iphone meuCelular = new Iphone("12313123");

        meuCelular.selecionarMusica("Ed Shearom");
        meuCelular.tocar();
        meuCelular.pausar();

        meuCelular.adicionarNovaAba();
        meuCelular.exibirPagina("www.isabela.com");
        meuCelular.atualizarPagina();

        meuCelular.ligar("839283910");
        meuCelular.iniciarCorreioVoz();
        meuCelular.atender();

    }
}
