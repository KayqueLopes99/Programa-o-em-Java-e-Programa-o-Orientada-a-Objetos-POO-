package lista3.questao_4CalculaProduto;

public class CalculaProduto {

    public int produto(int... numeros){

        if (numeros.length == 0){
            return 1;
        }
        int resultadoProduto = 1;

        for (int numero : numeros) {
            resultadoProduto *= numero;
        }

        return resultadoProduto;

    }
}
