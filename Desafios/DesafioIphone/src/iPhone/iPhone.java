package iPhone;

import Funcoes.ApTelefonico.Telefone;
import Funcoes.NavInternet.Browser;
import Funcoes.RepMusical.Musica;
import java.util.Scanner;

public class iPhone {
    public static void main(String[] args) {
        Telefone telefone = new Telefone();
        Browser browser = new Browser();
        Musica musica = new Musica();

        String aplicativo;
        String opcao;

        System.out.println("Qual aplicativo deseja usar? [Telefone] [Browser] [Musica]");

        Scanner scanner = new Scanner(System.in);
        aplicativo = scanner.nextLine();

        switch (aplicativo) {
            case "telefone":
                System.out.println("O que deseja fazer? [ligar] [atender] [correio de voz?]");
                Scanner opTelefone = new Scanner(System.in);
                opcao = opTelefone.nextLine();

                switch (opcao) {
                    case "ligar":
                         telefone.ligar(opcao);
                     break;
                    case "atender":
                        telefone.atender();
                    break;
                    case "correio":
                        telefone.iniciarCorreioVoz();
                    break;
                }
            break;
            case "browser":
                System.out.println("O que deseja fazer? [iniciar pagina] [nova aba] [atualizar]");
                Scanner opBeowser = new Scanner(System.in);
                opcao = opBeowser.nextLine();

                switch (opcao) {
                    case "iniciar pagina":
                         browser.exibirPagina(opcao);
                     break;
                    case "nova aba":
                        browser.adicionarNovaAba();
                    break;
                    case "atualizar":
                        browser.atualizarPagina();
                    break;
                }
            break;
            case "musica":
                System.out.println("O que deseja fazer? [tocar] [pausar] [selecionar]");
                Scanner opMusica = new Scanner(System.in);
                opcao = opMusica.nextLine();

                switch (opcao) {
                    case "tocar":
                         musica.tocar();
                     break;
                    case "pausar":
                    musica.pausar();
                    break;
                    case "selecionar":
                    musica.selecionarMusica(opcao);
                    break;
                }
            break;
        }
    }
}
