```
interfaceDiagram
    interface ReprodutorMusical {
        default tocar()
        default pausar()
        default selecionarMusica(String musica)
    }

    interface AparelhoTelefonico {
        default ligar(String numero)
        default atender()
        default iniciarCorreioVoz()
    }

    interface NavegadorInternet {
        default exibirPagina(String url)
        default adicionarNovaAba()
        default atualizarPagina()
    }

    class iPhone {
        private String meuNumero;

        public atender()
        public ligar(String numero)
    }

    iPhone --> ReprodutorMusical
    iPhone --> AparelhoTelefonico
    iPhone --> NavegadorInternet
```
