package com.furb.poo.exercicios.lista05.model;

/**
 * Representa um ponto no plano cartesiano
 *
 * @author André Felipe Bürger (afburger@furb.br)
 */
public class Ponto {

    private int x;
    private int y;

    /**
     * Cria um ponto com as coordenadas x=0 e y=0
     */
    public Ponto() {
    }

    /**
     * Cria um ponto com as coordenadas x e y predefinidas
     *
     * @param x valor da coordenada X
     * @param y valor coordenada Y
     */
    public Ponto(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    /**
     * Verifica em qual quadrante do plano cartesiano o ponto
     * se encontra
     *
     * @return Retorna o quadrante do plano cartesiano
     */
    public Quadrante identificarQuadrante() {
        if (estaIncidindoSobreX() && estaIncidindoSobreY()) {//NENHUM
            return Quadrante.NENHUM;
        } else if (getX() > 0) {
            if (getY() > 0) {
                return Quadrante.PRIMEIRO;
            } else {
                return Quadrante.QUARTO;
            }
        } else {// o x é < 0
            if (getY() > 0) {
                return Quadrante.SEGUNDO;
            } else {
                return Quadrante.TERCEIRO;
            }
        }
    }

    public boolean estaIncidindoSobreX() {
        return getX() == 0;
    }

    public boolean estaIncidindoSobreY() {
        return getY() == 0;
    }

    public double calcularDistancia(Ponto outroPonto) {
        return calcularDistancia(this, outroPonto);
    }

    public static double calcularDistancia(Ponto p1, Ponto p2) {
        double distancia = Math.sqrt(
            Math.pow((p2.getX() - p1.getX()), 2) 
            + 
            Math.pow((p2.getY() - p1.getY()), 2)
        );
        return distancia;
    }

}
