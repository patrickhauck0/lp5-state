package state;

public class PersonagemEstadoAtacando extends PersonagemEstado {
    private PersonagemEstadoAtacando() {};

    private static PersonagemEstadoAtacando instance = new PersonagemEstadoAtacando();

    public static PersonagemEstadoAtacando getInstance() {
        return instance;
    }

    public String getEstado() {
        return "Atacando";
    }
}
