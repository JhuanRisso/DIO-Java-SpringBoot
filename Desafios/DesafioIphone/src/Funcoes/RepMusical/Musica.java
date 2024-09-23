package Funcoes.RepMusical;

public class Musica implements ReprodutorMusical {
    public void tocar() {
        System.out.println("Tocando Musica");
    }

    public void pausar() {
        System.out.println("Pausando Musica");
    }

    public void selecionarMusica(String musica) {
        System.out.println("Selecionando Musica");
    }
}