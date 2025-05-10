package Disciplina.codes;

public class Aula_09Principal {
    public static void main(String[] args) {
        Aula_09ClassData data = new Aula_09ClassData();

        data.inicializaData(22, 12, 2004);

        if (data.dataEhValida()){
            data.mostraData();
            
        }else{
            System.out.println("Erro!");
        }
    
    }
    
}
