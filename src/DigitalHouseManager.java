
import java.util.ArrayList;
import java.util.List;

public class DigitalHouseManager {
    private List<Aluno> listaAlunos = new ArrayList<>();
    private List<Professor> listaProfessores = new ArrayList<>();
    private List<Curso> listaCursos = new ArrayList<>();
    private List<Matricula> listaMatriculas = new ArrayList<>();


    public void registrarCurso(String nome, Integer codigoCurso, Integer quantidadeMAximaDeAlunos) {
        Curso curso = new Curso();
        curso.setNome(nome);
        curso.setCodigoDoCurso(codigoCurso);
        curso.setQuantidadeMaximaAlunos(quantidadeMAximaDeAlunos);
        listaCursos.add(curso);
        System.out.println("O curso " + curso.getNome() +" sera iniciado em Janeiro de 2019. Matricule-se ja!!!");
        System.out.println("-------------------------------");

    }

    public void excluirCurso(Integer codigoCurso) {
        for (Curso curso : listaCursos) {
            if (curso.getCodigoDoCurso() == codigoCurso) {
                listaCursos.remove(curso);
                System.out.println("O curso" + curso.getNome() + " foi excluido da grade DH para 2019");

            }


        }

    }

    public void registrarProfessorTitular(String nome, String sobrenome, Integer codigoDoProfessor, String
            especialidade) {
        Professor titular = new ProfessorTitular();
        titular.setNome(nome);
        titular.setSobrenome(sobrenome);
        titular.setCodigoDoProfessor(codigoDoProfessor);
        ((ProfessorTitular) titular).setEspecialidade(especialidade);
        System.out.println("O(A) Professor(a) titular " + titular.getNome()+"," +" "+ titular.getSobrenome()+ " Especialista em "  +((ProfessorTitular) titular).getEspecialidade() + " será docente na DH em 2019.");
        System.out.println("-------------------------------");
    }

    public void registrarProfessorAdjunto(String nome, String sobrenome, Integer codigoDoProfessor, Integer quantidadeHorasMonitoria) {
        Professor adjunto = new ProfessorAdjunto();
        adjunto.setNome(nome);
        adjunto.setSobrenome(sobrenome);
        adjunto.setCodigoDoProfessor(codigoDoProfessor);
        ((ProfessorAdjunto) adjunto).setQuantidadeHorasMonitoria(quantidadeHorasMonitoria);
        // Apenas por questão de consistencia, aqui faltou "O(A) professor(a) adjunto(a)"
        System.out.println("Professor adjunto: " + adjunto.getNome() + " " + adjunto.getSobrenome() +", " + "fara parte do quadro de professores do DH.");
        System.out.println("-------------------------------");

    }



    public void excluirProfessor(Integer codigoDoProfessor) {
        for (Professor professor : listaProfessores) {
            if (professor.getCodigoDoProfessor() == codigoDoProfessor) {
                listaProfessores.remove(professor);
            }
        }
    }

    public void registrarAluno(String nome, String sobrenome, Integer codigoAluno){
        Aluno aluno = new Aluno();
        aluno.setNome(nome);
        aluno.setSobrenome(sobrenome);
        aluno.setCodigoDoAluno(codigoAluno);
        System.out.println("O(A) aluno(a) " + aluno.getNome() +" " + aluno.getSobrenome() + " foi matriculado na escola para este semestre");
        System.out.println("-------------------------------");
    }


    public void matricularAluno(Integer codigoAluno, Integer codigoDoCurso){
        // Aqui faltou usar a lógica de verificação se o curso está cheio.
        // Esta lógica já foi implementada na classe Curso, método adicionarUmAluno, porém não foi usado
        // Também evite essa quantidade de aninhamento for -> if -> for -> if/else
        // crie métodos auxiliares para isso, como um método que busca o curso pelo código (lá teria um for -> if)
        for (Aluno aluno: listaAlunos){
            if(aluno.getCodigoDoAluno() == codigoAluno){
                for(Curso curso: listaCursos){
                    if(curso.getCodigoDoCurso().equals(codigoDoCurso)){
                        Matricula matricula = new Matricula();
                        listaMatriculas.add(matricula);
                        System.out.println("A matricula foi realizada");
                    } else{
                        System.out.println("Nao foi possivel realizar a matricula porque nao ha vagas");

                    }
                }
            }
        }




    }

    public void alocarProfessores(Integer codigoDoCurso, Integer codigoDoProfessorTitular, Integer codigoDoProfessorAdjunto){
        ProfessorTitular professorTitular = null;
        ProfessorAdjunto professorAdjunto = null;

        for(Professor professor : listaProfessores){
            if(professor.getCodigoDoProfessor() == codigoDoProfessorTitular){
                // Bom uso do casting, porém faltou um try and catch pra garantir que não vai dar Exception
                professorTitular = (ProfessorTitular) professor;
            }
            if(professor.getCodigoDoProfessor() == codigoDoProfessorAdjunto){
                professorAdjunto = (ProfessorAdjunto) professor;
            }

        }

        // Aqui poderia usar o método que citei acima, um buscarCursoPorCodigo (com um for -> if)
        // evitando repetir a logica
        for (Curso curso: listaCursos){
            if (curso.getCodigoDoCurso() == codigoDoCurso){
                try{
                    curso.setProfessorAdjunto(professorAdjunto);
                }catch (NullPointerException e) {
                    System.out.println("Professor Adjunto nao encontrado)");
                }
                try {
                    curso.setProfessorTitular(professorTitular);
                }catch (NullPointerException e){
                    System.out.println("Professor Titular nao encontrado");
                }
            }
        }


    }

}


