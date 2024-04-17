public class Vetor {
    private Aluno[] alunos = new Aluno[100];

    private int totalDealunos = 0;

    public void Adiciona (Aluno aluno){
        this.alunos[this.totalDealunos]= aluno;
        this.totalDealunos++;
    }

    public int getTotalDealunos(){
        return totalDealunos;
    }

    public void adicionaPosicao(int posicao, Aluno aluno){


    }

    public void Alunopega (int posicao){
        //implementar
    }

    public void remove(int posicao){
        //implementar
    }

    public  boolean contem(Aluno aluno){
        for(int i=0; i<alunos.length; i++){
            if(aluno==alunos[i]) {
                return true;
            }
        }
        return false;
    }

    public int tamanho (){
        return this.totalDealunos;
    }

    public String toString() {
        if(this.totalDealunos==0){
            return "[]";
        }

        StringBuilder builder = new StringBuilder();
        builder.append("[");
        for (int i = 0; i < this.totalDealunos- 1; i++) {
            builder.append(this.alunos[i]);
            builder.append(", ");
        }
        builder.append(this.alunos[this.totalDealunos- 1]);
        builder.append("]");

        return builder.toString();
    }

}
