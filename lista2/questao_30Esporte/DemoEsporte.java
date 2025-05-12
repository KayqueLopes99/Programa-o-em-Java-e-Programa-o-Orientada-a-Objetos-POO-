package lista2.questao_30Esporte;

public class DemoEsporte {
    public static void main(String[] args) {
        Esporte esporte1 = new Esporte("Flamengo", 15, 500, "Futebol");
        esporte1.imprimeEsporte();
        esporte1.saberRanking();
        esporte1.atualizarRanking(650);
    }
    
}

