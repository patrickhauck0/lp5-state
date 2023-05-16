package state;

public class PersonagemEstadoCurando extends PersonagemEstado {
    private PersonagemEstadoCurando() {};
    private static PersonagemEstadoCurando instance = new PersonagemEstadoCurando();
    public static PersonagemEstadoCurando getInstance() {
        return instance;
    }

    public String getEstado() {
        return "Curando";
    }
}
