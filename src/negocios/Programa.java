package negocios;

import dados.RepositorioAlunosArray;

public class Programa {

    public static void main(String[] args) {

        Curso engenhariaQuimica = new Curso("Engenharia Química");

        Aluno aluno1 = new Aluno("Camila", 26, "14314673", engenhariaQuimica);
        Aluno aluno2 = new Aluno("Juliana", 27, "10723699402", engenhariaQuimica);
        Professor professor1 = new Professor("Zé Geraldo", 65, "001", 20000.0);

        RepositorioAlunosArray repositorio = new RepositorioAlunosArray(10);

        repositorio.inserirPessoa(aluno1);
        repositorio.inserirPessoa(aluno2);

//        System.out.println(repositorio.procurarAluno("14314673").getNome());
//        System.out.println(repositorio.procurarAluno("10723699402").getNome());
        repositorio.verPessoa();
//        repositorio.removerAluno("10723699402");
//        repositorio.verAlunos();

        System.out.println(aluno2.toString());
        System.out.println(aluno1.toString());
        System.out.println(professor1.toString());


    }


}

