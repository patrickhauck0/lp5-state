package state;

public class Personagem {
    private String nome;
    private PersonagemEstado estado;

    public Personagem() {
        this.estado = PersonagemEstadoTurno.getInstance();
    }

    public void setEstado(PersonagemEstado estado) {
        this.estado = estado;
    }

    public boolean turno() {
        return estado.turno(this);
    }

    public boolean atacar() {
        return estado.atacar(this);
    }

    public boolean defender() {
        return estado.defender(this);
    }

    public boolean curar() {
        return estado.curar(this);
    }

    public boolean esperar() {
        return estado.esperar(this);
    }

    public String getNomeEstado() {
        return estado.getEstado();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public PersonagemEstado getEstado() {
        return estado;
    }
}