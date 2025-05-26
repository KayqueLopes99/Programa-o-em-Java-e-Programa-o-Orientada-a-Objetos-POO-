package lista1;
public class questao_17Cidades {
    public static void main(String[] args) {
       double PopulacaoCidadeA = 7000;
       double PopulacaoCidadeB = 20000;
       int contadorAnos = 0;

       while (true) {
        PopulacaoCidadeA += (PopulacaoCidadeA * 0.035);
        PopulacaoCidadeB += (PopulacaoCidadeB * 0.01);
        contadorAnos++;

        if(PopulacaoCidadeA >= PopulacaoCidadeB){
            System.out.println("Anos necessários: " + contadorAnos);
            break;
}   }   }   }