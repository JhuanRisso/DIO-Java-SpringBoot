package Funcoes.NavInternet;

public class Browser implements NavegadorInternet {
    public void exibirPagina(String url) {
        System.out.println("Entrando na pagina X");
    }

    public void adicionarNovaAba() {
        System.out.println("Adicionou nova aba");
    }

    public void atualizarPagina() {
        System.out.println("Atualizou pagina");
    }
}