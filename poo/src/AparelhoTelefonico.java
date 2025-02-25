public interface AparelhoTelefonico {
    
    default void ligar(String numero){
        System.out.println("Ligando para o numero: " + numero);
    }

    default void atender(){
        System.out.println("Atendendo o telefone");
    }

    default void iniciarCorreioVoz(){
        System.out.println("Chamada perdida, iniciando correio de voz");
    }

}
