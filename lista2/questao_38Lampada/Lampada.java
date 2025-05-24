package lista2.questao_38Lampada;

public class Lampada {
    private boolean estadoDaLampada;
    private Contador contadorAcesa;

    public Lampada() {
        estadoDaLampada = false;
        contadorAcesa = new Contador();
    }

    public void acende() {
        if (!estadoDaLampada) {
            estadoDaLampada = true;
            contadorAcesa.incrementar();
            mostraEstado();
        } else {
            System.out.println("Lampada já Ligada.");
        }
    }

    public void apaga() {
        estadoDaLampada = false;
        mostraEstado();
    }

    public void mostraEstado() {
        if (estadoDaLampada == true) {
            System.out.println("A lâmpada está ligada!");
        } else {
            System.out.println("A lâmpada está desligada!");
        }

    }

    public boolean estaLigada() {
        return estadoDaLampada;
    }

    public void mostrarTotalDeVezesAcesa() {
        System.out.println("A lâmpada foi acesa " + contadorAcesa.getValor() + " vezes.");
    }

}
