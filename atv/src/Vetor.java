package br.com.caelum.ed.vetores;

import br.com.caelum.ed.Aluno;

public class Vetor {
    private Aluno[] alunos;
    private int tamanho;

    public Vetor() {
        this.alunos = new Aluno[100]; // Inicializa o vetor com capacidade para 100 alunos
        this.tamanho = 0; // Inicializa o tamanho como zero
    }

    public void adiciona(Aluno aluno) {
        this.alunos[this.tamanho] = aluno; // Adiciona o aluno na próxima posição disponível
        this.tamanho++; // Incrementa o tamanho do vetor
    }

    public boolean contem(Aluno aluno) {
        for (int i = 0; i < this.tamanho; i++) {
            if (aluno.equals(this.alunos[i])) { // Comparação de objetos deve ser feita com equals
                return true;
            }
        }
        return false;
    }
}
