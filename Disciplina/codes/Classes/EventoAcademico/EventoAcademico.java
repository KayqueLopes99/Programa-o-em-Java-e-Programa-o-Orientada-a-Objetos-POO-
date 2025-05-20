package Disciplina.codes.Classes.EventoAcademico;

public class EventoAcademico {
    private String nomeDoEvento;
    private String localEvento;
    private int numeroDeParticipantes;

    EventoAcademico(String nomeDoEvento, String localEvento, int numeroDeParticipantes) {

        // Atributo da classe - <Motivo / diferenciar os nome e busca >
        this.nomeDoEvento = (nomeDoEvento.isEmpty() ? "Nome - nao informado": nomeDoEvento);
        this.localEvento = (localEvento.isEmpty() ? "Local - nao informado": localEvento);
        this.numeroDeParticipantes = (numeroDeParticipantes > 0 ? numeroDeParticipantes : 1);
    }

    public void mostraEvento(){
        System.out.println("Nome do evento: " + nomeDoEvento);
        System.out.println("Local: " + localEvento);
        System.out.println("Participantes: " + numeroDeParticipantes);
        

    }






}
