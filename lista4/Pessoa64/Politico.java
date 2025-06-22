package lista4.Pessoa64;


public class Politico extends Pessoa{
    private String partido;

    public Politico(String nome, int idade, String partido){
        super(nome, idade);
        this.partido = partido;
    }
    
 
    @Override
    public String toString() {
            return super.toString() + " - Político: Partido: " + this.partido;

    }

}
