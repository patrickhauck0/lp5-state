package state;

public class PersonagemEstadoEsperando extends PersonagemEstado{
    private PersonagemEstadoEsperando() {};
    private static PersonagemEstadoEsperando instance = new PersonagemEstadoEsperando();
    public static PersonagemEstadoEsperando getInstance() {
        return instance;
    }

    public String getEstado() {
        return "Esperando";
    }
}
