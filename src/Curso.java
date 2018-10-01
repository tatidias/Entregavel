import java.util.List;

public class Curso {
    private String nome;
    private Integer codigoDoCurso;
    private Integer quantidadeMaximaAlunos;
    private ProfessorAdjunto professorAdjunto;
    private ProfessorTitular professorTitular;
    private List<Aluno> listaAlunos;


    public Boolean adicionarUmAluno( Aluno umAluno) {
        if (listaAlunos.size() < quantidadeMaximaAlunos){
            listaAlunos.add(umAluno);
            return true;
        } else {
            return false;
        }

    }

    public void excluirUmAluno(Aluno umAluno){
        listaAlunos.remove(umAluno);
    }
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getCodigoDoCurso() {
        return codigoDoCurso;
    }

    public void setCodigoDoCurso(Integer codigoDoCurso) {
        this.codigoDoCurso = codigoDoCurso;
    }

    public Integer getQuantidadeMaximaAlunos() {
        return quantidadeMaximaAlunos;
    }

    public void setQuantidadeMaximaAlunos(Integer quantidadeMaximaAlunos) {
        this.quantidadeMaximaAlunos = quantidadeMaximaAlunos;
    }

    public ProfessorAdjunto getProfessorAdjunto() {
        return professorAdjunto;
    }

    public void setProfessorAdjunto(ProfessorAdjunto professorAdjunto) {
        this.professorAdjunto = professorAdjunto;
    }

    public ProfessorTitular getProfessorTitular() {
        return professorTitular;
    }

    public void setProfessorTitular(ProfessorTitular professorTitular) {
        this.professorTitular = professorTitular;
    }

    public List<Aluno> getListaAlunos() {
        return listaAlunos;
    }

    public void setListaAlunos(List<Aluno> listaAlunos) {
        this.listaAlunos = listaAlunos;
    }
}



