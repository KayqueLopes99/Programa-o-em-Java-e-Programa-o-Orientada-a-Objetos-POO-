package lista4.ComputadorEquipamento61;

public class Computador extends Equipamento{
    private int memoriaRam;
    private String sistemaOperacional;

    public Computador(String nome, String modelo, int memoriaRam, String sistemaOperacional){
    super(nome, modelo);
    this.memoriaRam = memoriaRam;
    this.sistemaOperacional = sistemaOperacional;
        
    }

    public int getMemoriaRam() {
        return memoriaRam;
    }

    public String getSistemaOperacional() {
        return sistemaOperacional;
    }


    public void setMemoriaRam(int memoriaRam) {
        this.memoriaRam = memoriaRam;
    }

    public void setSistemaOperacional(String sistemaOperacional){
        this.sistemaOperacional = sistemaOperacional;
    }



    @Override // Não tem ;
    public String toString() {

        return super.toString() + " Memória Ram: " + this.memoriaRam + " Sistema Operacional: " + this.sistemaOperacional;
    }
    
}
