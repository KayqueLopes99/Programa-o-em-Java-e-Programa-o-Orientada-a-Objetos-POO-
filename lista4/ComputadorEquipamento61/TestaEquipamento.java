package lista4.ComputadorEquipamento61;

public class TestaEquipamento {
    public static void main(String[] args){
        Equipamento equipamento = new Equipamento( "Impressora", "HP");
        System.out.println(equipamento);

        equipamento.setNome("Mouse");
        equipamento.setMarca("Logitech");
        System.out.println(equipamento);

        Computador computador = new Computador("Computador ", "dell", 16, "Windows 10");
        System.out.println(computador);

        computador.setMemoriaRam(32);
        computador.setSistemaOperacional("Windows 11");
        System.out.println(computador);
   
    }
}
