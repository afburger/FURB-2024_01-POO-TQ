/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.furb.poo.exercicios.lista08.model;

import java.util.ArrayList;

/**
 *
 */
public class Turma {
    
    private String disciplina;
    
    private Professor professor;
    private ArrayList<Aluno> alunos = new ArrayList<>();
    private Turno turno;

    public String getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(String disciplina) {
        this.disciplina = disciplina;
    }

    public Professor getProfessor() {
        return professor;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }

    public ArrayList<Aluno> getAlunos() {
        return alunos;
    }

    public Turno getTurno() {
        return turno;
    }

    public void setTurno(Turno turno) {
        this.turno = turno;
    }
    
    public void incluirAluno(Aluno aluno){
        alunos.add(aluno);
    }
    
    public void removerAluno(Aluno aluno){
        alunos.remove(aluno);
    }
    
    public Aluno obterAlunoMelhorNotaEnem(){
        if (getAlunos().size() == 0){
            return null;
        }else{
            Aluno alunoMelhorNota = alunos.get(0);
            for (Aluno a : getAlunos()){
                if (a.getNotaEnem() > alunoMelhorNota.getNotaEnem()){
                    alunoMelhorNota = a;
                }
            }
            return alunoMelhorNota;
        }
        
        
    }
    
    
    
    
}
