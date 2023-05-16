package state;

public class PersonagemEstadoDefendendo extends PersonagemEstado{
    private PersonagemEstadoDefendendo() {};
    private static PersonagemEstadoDefendendo instance = new PersonagemEstadoDefendendo();
    public static PersonagemEstadoDefendendo getInstance() {
        return instance;
    }

    public String getEstado() {
        return "Defendendo";
    }
}
