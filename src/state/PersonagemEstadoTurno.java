package state;

public class PersonagemEstadoTurno extends PersonagemEstado{
    private PersonagemEstadoTurno() {};
    private static PersonagemEstadoTurno instance = new PersonagemEstadoTurno();
    public static PersonagemEstadoTurno getInstance() {
        return instance;
    }

    public String getEstado () {
        return "Seu turno";
    }

    public boolean atacar(Personagem personagem) {
        personagem.setEstado(PersonagemEstadoAtacando.getInstance());
        return true;
    }

    public boolean defender(Personagem personagem) {
        personagem.setEstado(PersonagemEstadoDefendendo.getInstance());
        return true;
    }

    public boolean curar(Personagem personagem) {
        personagem.setEstado(PersonagemEstadoCurando.getInstance());
        return true;
    }

    public boolean esperar(Personagem personagem) {
        personagem.setEstado(PersonagemEstadoEsperando.getInstance());
        return true;
    }
}
