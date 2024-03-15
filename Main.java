import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<Aluno> lista = new ArrayList<>();

        Aluno a1 = new Aluno();
        Aluno a2 = new Aluno();
        Aluno a3 = new Aluno();
        Aluno a4 = new Aluno();
        Aluno a5 = new Aluno();
        Aluno a6 = new Aluno();
        Aluno a7 = new Aluno();
        Aluno a8 = new Aluno();
        Aluno a9 = new Aluno();
        Aluno a10 = new Aluno();
        Aluno a11 = new Aluno();
        Aluno a12 = new Aluno();
        Aluno a13 = new Aluno();
        Aluno a14 = new Aluno();
        Aluno a15 = new Aluno();


        a1.setNome("Glevson");
        a2.setNome("Francisco");
        a3.setNome("Maria");
        a4.setNome("João");
        a5.setNome("Teste");
        a6.setNome("Tiago");
        a7.setNome("José");
        a8.setNome("Sávio");
        a9.setNome("Melo");
        a10.setNome("Lucélia");
        a11.setNome("Lourenço");
        a12.setNome("Sileana");
        a13.setNome("Ana");
        a14.setNome("Elis");
        a15.setNome("Josefa");


        System.out.println("\nAlunos: " + a2.getNome());
        System.out.println("Alunos: " + a1.getNome());


        lista.add(a1);
        lista.add(a2);
        lista.add(a3);
        lista.add(a4);
        lista.add(a5);
        lista.add(a6);
        lista.add(a7);
        lista.add(a8);
        lista.add(a9);
        lista.add(a10);
        lista.add(a11);
        lista.add(a12);
        lista.add(a13);
        lista.add(a14);
        lista.add(a15);

        System.out.println(" ");

        System.out.println("Total de alunos: " + lista.size());

        System.out.println(lista);

        System.out.println(lista.contains(a5));

        lista.remove(1);
        lista.remove(3);
        System.out.println(" ");

        System.out.println("Lista com alunos removidos: " + lista);

        Aluno a16 = new Aluno();
        Aluno a17 = new Aluno();
        a16.setNome(">>Manoel<<");
        a17.setNome(">>Lira<<");

        lista.add(1, a16);
        lista.add(3, a17);
        System.out.println(" ");
        System.out.println("Lista com alunos novos: " + lista);

    }
}
