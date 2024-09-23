package Funcoes.Multifuncional;

import Funcoes.ApTelefonico.AparelhoTelefonico;
import Funcoes.NavInternet.NavegadorInternet;
import Funcoes.RepMusical.ReprodutorMusical;

public class EquipamentoMultifuncional implements AparelhoTelefonico, NavegadorInternet, ReprodutorMusical {
    public void ligar(String numero) {
        System.out.println("Ligando para numero X");
    }

    public void atender() {
        System.out.println("Atendendo");
    }

    public void iniciarCorreioVoz() {
        System.out.println("Correio de Voz");
    }

    public void exibirPagina(String url) {
        System.out.println("Exibindo Pagina");
    }

    public void adicionarNovaAba() {
        System.out.println("Adicionando Pagina");
    }

    public void atualizarPagina() {
        System.out.println("Atualizando Pagina");
    }

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
