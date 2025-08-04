package Udemy.Code;

public class Operadores {
    public static void main(String[] args) {
        float num_one = 10;
        float num_two = 20;
        float soma, subtracao, multiplicacao;
        double divisao = num_one / num_two;;
        soma = num_one + num_two;
        subtracao = num_one - num_two;
        multiplicacao = num_one * num_two;
        int resto;
        resto = 20 % 2;
        
        System.out.println("Soma: " + soma);
        System.out.println("Subtracao: " + subtracao);
        System.out.println("Multiplicacao: " + multiplicacao);
        System.out.println("Divisao: " + divisao);
        System.out.println("Resto da divisão 20 / 2: " + resto);

        boolean maior_ou_menor1 = 10 > 20;
        boolean maior_ou_menor2 = 10 < 20;
        boolean igualdade = 10 == 20;
        boolean diferenca = 10 != 20;

        System.out.println("\n\n10 > 20: " + maior_ou_menor1);
        System.out.println("10 < 20: " + maior_ou_menor2);
        System.out.println("10 == 20: " + igualdade);
        System.out.println("10 != 20: " + diferenca);
        
        int idade = 29;
        float salario = 3500F;
        boolean is_dentro_da_lei_maior_que_trinta = idade >= 30 && salario >= 4612;
        boolean is_dentro_da_lei_menor_que_trinta = idade < 30 && salario >= 3381;

        System.out.println("is_dentro_da_lei_maior_que_trinta: " + is_dentro_da_lei_maior_que_trinta);
        System.out.println("is_dentro_da_lei_menor_que_trinta: " + is_dentro_da_lei_menor_que_trinta);


        double valor_total_conta_corrente = 200;
        double valor_total_conta_poupanca = 10000;
        float valor_do_jogo = 5000F;
        boolean is_possivel_comprar = (valor_do_jogo < valor_total_conta_corrente) || (valor_do_jogo < valor_total_conta_poupanca);

        System.out.println("is_possivel_comprar: " + is_possivel_comprar);

        double bonus = 1800;
        bonus += 1000;
        bonus *= 2;
        System.out.println(bonus);









    }
    
}
