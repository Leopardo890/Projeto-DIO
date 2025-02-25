public interface NavegadorInternet {
    
    default void exibirPagina(String url){
        System.out.println("Exibindo pagina de url: " + url);
    }

    default void adicionarNovaAba(){
        System.out.println("Voce abriu uma nova aba");
    }

    default void atualizarPagina(){
        System.out.println("pagina foi atualizada");
    }

}
