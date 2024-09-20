package com.furb.poo.provas.prova01.model;

/**
 * O enum {@code Convenio} representa os diferentes tipos de convênios aplicáveis, como CDL, NSC, Estudante, 
 * ou a ausência de convênio (Sem convênio).
 * 
 * <p>Cada convênio possui uma denominação associada que descreve o nome do convênio de forma legível. Esse enum 
 * contém métodos para acessar e representar essa denominação.
 * 
 * <p>Os convênios disponíveis são:
 * <ul>
 *   <li>{@link #CDL}</li>
 *   <li>{@link #NSC}</li>
 *   <li>{@link #ESTUDANTE}</li>
 *   <li>{@link #SEM_CONVENIO}</li>
 * </ul>
 * 
 * @author André Felipe Bürger (afburger@furb.br)
 */
public enum Convenio {

    /** Representa o convênio CDL. */
    CDL("CDL"),

    /** Representa o convênio NSC. */
    NSC("NSC"),

    /** Representa o convênio para estudantes. */
    ESTUDANTE("Estudante"),

    /** Representa a ausência de convênio. */
    SEM_CONVENIO("Sem convênio");

    private final String denominacao;

    /**
     * Construtor do enum {@code Convenio}, que associa uma denominação a cada constante.
     * 
     * @param denominacao A denominação textual do convênio.
     */
    private Convenio(String denominacao) {
        this.denominacao = denominacao;
    }

    /**
     * Retorna a denominação do convênio.
     * 
     * @return A denominação textual do convênio.
     */
    public String getDenominacao() {
        return denominacao;
    }

    /**
     * Retorna a representação textual do convênio, que corresponde à sua denominação.
     * 
     * @return A denominação do convênio.
     */
    @Override
    public String toString() {
        return getDenominacao();
    }
}

