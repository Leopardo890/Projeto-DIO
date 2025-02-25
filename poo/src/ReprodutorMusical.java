public interface ReprodutorMusical {
    
    default void tocar(){
        System.out.println("Tocando musica");
    };

    default void pausar(){
        System.out.println("Musica pausada");
    }

    default void selecionarMusica(String musica){
        System.out.println("Musica selecionada: " + musica);
    }

}
