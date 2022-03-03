package negocios;

public class Aluno extends Pessoa {

    private Curso curso;

    public Aluno(String nome, int idade, String cpf, Curso curso) {
        super(nome, idade, cpf);
        this.curso = curso;
    }

    public Aluno() {
    }

    @Override
    public String toString() {
        return "Aluno" +
                super.toString() +
                "Código do curso: " + curso.getCodigo() +
                "Nome do curso: " + curso.getNome();

    }

    public Curso getCurso() {
        return curso;
    }

    public void setCurso(Curso curso) {
        this.curso = curso;
    }
}


