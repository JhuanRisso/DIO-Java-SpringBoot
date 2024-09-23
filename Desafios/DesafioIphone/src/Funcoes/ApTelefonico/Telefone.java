package Funcoes.ApTelefonico;

public class Telefone implements AparelhoTelefonico{
    public void ligar(String numero) {
        System.out.println("Ligando para numero X");
    }

    public void atender() {
        System.out.println("Atendendo");
    }

    public void iniciarCorreioVoz() {
        System.out.println("Correio de Voz");
    }
}
