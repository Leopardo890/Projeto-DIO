public class Iphone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet {
    
    private String meuNumero;
    private String meuIp;

    public Iphone(String meuNumero){
        this.meuNumero = meuNumero;
    }

    @Override
    public void atender() {
        // TODO Auto-generated method stub
        System.out.println("Atendendo pelo Iphone");
    }

    @Override
    public void ligar(String numero) {
        // TODO Auto-generated method stub
        System.out.println("Ligando pelo Iphone para o numero: " + numero);
    }

}
