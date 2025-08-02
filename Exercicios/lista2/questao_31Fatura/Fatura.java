package lista2.questao_31Fatura;

/*
  Crie uma classe chamada F atura para que uma loja de suprimentos de informática a
utilize para representar uma fatura de um item vendido. Uma Fatura deve incluir as seguintes informações sobre o item vendido: o número de identificação, a descrição, a
quantidade comprada e o preço unitário. 

Se a quantidade não for positiva, ela deve ser
configurada como 0. Se o preço por item não for positivo, ele deve ser configurado como
0.0. Forneça também um método chamado calculaT otal que calcula e retorna o valor de
fatura (isto é, multiplica a quantidade pelo preço por item). Escreva um aplicativo de teste
que demonstre as capacidades da classe criada.

 */
public class Fatura {
    private int numeroIdentificacao;
    private String descricao;
    private int quantidadeComprada;
    private double precoUnitario;

    public Fatura(int numeroIdentificacao, String descricao, int quantidadeComprada, double precoUnitario) {
    
        this.numeroIdentificacao = numeroIdentificacao;
        this.descricao = descricao;
        this.quantidadeComprada = (quantidadeComprada > 0) ? quantidadeComprada : 0;
        this.precoUnitario = (precoUnitario > 0) ? precoUnitario : 0.0;
    }

    public void imprimeFatura() {
        System.out.println("Número de identificação: " + numeroIdentificacao);
        System.out.println("Descrição: " + descricao);
        System.out.println("Quantidade comprada: " + quantidadeComprada);
        System.out.println("Preço unitário: " + precoUnitario);
        System.out.println("Total da fatura: "+ calculaTotal());

    }

    public double calculaTotal(){
        return quantidadeComprada * precoUnitario;
    }

}
