import javax.xml.crypto.Data;

public class Matricula {
 private Aluno aluno;
 private Curso codigoDoCurso;
 private Data data;

 public Aluno getAluno() {
  return aluno;
 }

 public void setAluno(Aluno aluno) {
  this.aluno = aluno;
 }

 public Curso getCodigoDoCurso() {
  return codigoDoCurso;
 }

 public void setCodigoDoCurso(Curso codigoDoCurso) {
  this.codigoDoCurso = codigoDoCurso;
 }

 public Data getData() {
  return data;
 }

 public void setData(Data data) {
  this.data = data;
 }
}


