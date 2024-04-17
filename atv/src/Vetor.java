package br.com.caelum.ed.vetores;

import br.com.caelum.ed.Aluno;

public class Vetor {
    private Aluno[] alunos;
    private int tamanho;

    public Vetor() {
        this.alunos = new Aluno[100]; 
        this.tamanho = 0; 
    }

    public void adiciona(Aluno aluno) {
        this.alunos[this.tamanho] = aluno; 
        this.tamanho++; 
    }

    public boolean contem(Aluno aluno) {
        for (int i = 0; i < this.tamanho; i++) {
            if (aluno.equals(this.alunos[i])) { 
                return true;
            }
        }
        return false;
    }
}
