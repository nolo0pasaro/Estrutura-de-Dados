
class Aluno {
    private String nome;
    private int idade;

    public Aluno(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }


    @Override
    public String toString() {
        return "Aluno{" +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                '}';
    }
}

class Vetor {
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

class TesteDeTempoDoContem {
    public static void main(String[] args) {
        Vetor vetor = new Vetor();
        long inicio = System.currentTimeMillis();

        for (int i = 1; i <= 30000; i++) { // Alteração da condição aqui
            Aluno aluno = new Aluno("Aluno" + i, i);
            vetor.adiciona(aluno);
            if (!vetor.contem(aluno)) {
                System.out.println("Erro: aluno " + aluno + " não foi adicionado.");
            }
        }

        for (int i = 1; i <= 30000; i++) { // Alteração da condição aqui também
            Aluno aluno = new Aluno("Aluno" + (i + 30000), i + 30000);
            if (vetor.contem(aluno)) {
                System.out.println("Erro: aluno " + aluno + " foi adicionado.");
            }
        }



        long fim = System.currentTimeMillis();
        double tempo = (fim - inicio) / 1000.0;
        System.out.println("Tempo = " + tempo);
    }
}
