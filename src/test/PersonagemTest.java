package test;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import state.*;

import static org.junit.jupiter.api.Assertions.*;

class PersonagemTest {
    Personagem personagem;

    @BeforeEach
    public void setUp() {
        personagem = new Personagem();
    }

    // Personagem no Turno

    @Test
    public void naoDeveComecarTurnoComPersonagemNoTurno() {
        personagem.setEstado(PersonagemEstadoTurno.getInstance());
        assertFalse(personagem.turno());
    }

    @Test
    public void deveAtacarNoTurnoDoPersonagem() {
        personagem.setEstado(PersonagemEstadoAtacando.getInstance());
        assertFalse(personagem.atacar());
        assertEquals(PersonagemEstadoAtacando.getInstance(), personagem.getEstado());
    }

    @Test
    public void deveDefenderNoTurnoDoPersonagem() {
        personagem.setEstado(PersonagemEstadoDefendendo.getInstance());
        assertFalse(personagem.defender());
        assertEquals(PersonagemEstadoDefendendo.getInstance(), personagem.getEstado());
    }

    @Test
    public void deveCurarNoTurnoDoPersonagem() {
        personagem.setEstado(PersonagemEstadoCurando.getInstance());
        assertFalse(personagem.curar());
        assertEquals(PersonagemEstadoCurando.getInstance(), personagem.getEstado());
    }

    @Test
    public void deveEsperarNoTurnoDoPersonagem() {
        personagem.setEstado(PersonagemEstadoEsperando.getInstance());
        assertFalse(personagem.esperar());
        assertEquals(PersonagemEstadoEsperando.getInstance(), personagem.getEstado());
    }

    // Personagem Atacando

    @Test
    public void naoDeveComecarTurnoComPersonagemAtacando() {
        personagem.setEstado(PersonagemEstadoTurno.getInstance());
        assertFalse(personagem.turno());
    }

    @Test
    public void naoDeveAtacarComPersonagemAtacando() {
        personagem.setEstado(PersonagemEstadoAtacando.getInstance());
        assertFalse(personagem.atacar());
    }

    @Test
    public void naoDeveDefenderComPersonagemAtacando() {
        personagem.setEstado(PersonagemEstadoDefendendo.getInstance());
        assertFalse(personagem.defender());
    }

    @Test
    public void naoDeveCurarComPersonagemAtacando() {
        personagem.setEstado(PersonagemEstadoCurando.getInstance());
        assertFalse(personagem.curar());
    }

    @Test
    public void naoDeveEsperarComPersonagemAtacando() {
        personagem.setEstado(PersonagemEstadoEsperando.getInstance());
        assertFalse(personagem.esperar());
    }

    // Personagem Defendendo

    @Test
    public void naoDeveComecarTurnoComPersonagemDefendendo() {
        personagem.setEstado(PersonagemEstadoTurno.getInstance());
        assertFalse(personagem.turno());
    }

    @Test
    public void naoDeveAtacarComPersonagemDefendendo() {
        personagem.setEstado(PersonagemEstadoAtacando.getInstance());
        assertFalse(personagem.atacar());
    }

    @Test
    public void naoDeveDefenderComPersonagemDefendendo() {
        personagem.setEstado(PersonagemEstadoDefendendo.getInstance());
        assertFalse(personagem.defender());
    }

    @Test
    public void naoDeveCurarComPersonagemDefendendo() {
        personagem.setEstado(PersonagemEstadoCurando.getInstance());
        assertFalse(personagem.curar());
    }

    @Test
    public void naoDeveEsperarComPersonagemDefendendo() {
        personagem.setEstado(PersonagemEstadoEsperando.getInstance());
        assertFalse(personagem.esperar());
    }

    // Personagem Curando

    @Test
    public void naoDeveComecarTurnoComPersonagemCurando() {
        personagem.setEstado(PersonagemEstadoTurno.getInstance());
        assertFalse(personagem.turno());
    }

    @Test
    public void naoDeveAtacarComPersonagemCurando() {
        personagem.setEstado(PersonagemEstadoAtacando.getInstance());
        assertFalse(personagem.atacar());
    }

    @Test
    public void naoDeveDefenderComPersonagemCurando() {
        personagem.setEstado(PersonagemEstadoDefendendo.getInstance());
        assertFalse(personagem.defender());
    }

    @Test
    public void naoDeveCurarComPersonagemCurando() {
        personagem.setEstado(PersonagemEstadoCurando.getInstance());
        assertFalse(personagem.curar());
    }

    @Test
    public void naoDeveEsperarComPersonagemCurando() {
        personagem.setEstado(PersonagemEstadoEsperando.getInstance());
        assertFalse(personagem.esperar());
    }

    // Personagem Esperando

    @Test
    public void naoDeveComecarTurnoComPersonagemEsperando() {
        personagem.setEstado(PersonagemEstadoTurno.getInstance());
        assertFalse(personagem.turno());
    }

    @Test
    public void naoDeveAtacarComPersonagemEsperando() {
        personagem.setEstado(PersonagemEstadoAtacando.getInstance());
        assertFalse(personagem.atacar());
    }

    @Test
    public void naoDeveDefenderComPersonagemEsperando() {
        personagem.setEstado(PersonagemEstadoDefendendo.getInstance());
        assertFalse(personagem.defender());
    }

    @Test
    public void naoDeveCurarComPersonagemEsperando() {
        personagem.setEstado(PersonagemEstadoCurando.getInstance());
        assertFalse(personagem.curar());
    }

    @Test
    public void naoDeveEsperarComPersonagemEsperando() {
        personagem.setEstado(PersonagemEstadoEsperando.getInstance());
        assertFalse(personagem.esperar());
    }
}