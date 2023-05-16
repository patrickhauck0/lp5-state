package state;

public abstract class PersonagemEstado {
    public abstract String getEstado();

    public boolean turno(Personagem personagem) {
        return false;
    }

    public boolean atacar(Personagem personagem) {
        return false;
    }

    public boolean defender(Personagem personagem) {
        return false;
    }

    public boolean curar(Personagem personagem) {
        return false;
    }

    public boolean esperar(Personagem personagem) {
        return false;
    }
}
