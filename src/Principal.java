public class Principal {
    public static void main(String[] args) {
 DigitalHouseManager digitalHouseManager = new DigitalHouseManager();
 digitalHouseManager.registrarProfessorTitular("Tatiana","Dias", 123, "UX");
 digitalHouseManager.registrarProfessorTitular("Michael","Jackson", 456, "Mobile" );
 digitalHouseManager.registrarProfessorAdjunto("Elisangela", "Miranda", 789, 300);
 digitalHouseManager.registrarProfessorAdjunto("Cintia", "Alves", 345, 400);

 digitalHouseManager.registrarCurso("Full Stack", 20001, 3);
 digitalHouseManager.registrarCurso("Android", 20002, 2);

 digitalHouseManager.alocarProfessores(2001, 123,456);
 digitalHouseManager.alocarProfessores(2002, 456, 345);
 digitalHouseManager.alocarProfessores(3000, 200,400);


digitalHouseManager.registrarAluno("Carlos", "Maia", 001);
digitalHouseManager.registrarAluno("Sergio", "Leandro", 002);
digitalHouseManager.registrarAluno("Pedro", "Tavares", 003);
digitalHouseManager.registrarAluno("Amanda", "Guedes", 004);
digitalHouseManager.registrarAluno("Cristiano", "Arruda", 005);
digitalHouseManager.registrarAluno("Fernando", "Trindade", 006);
digitalHouseManager.registrarAluno("Anderson", "Silva", 007);

// aqui seria legal que o metodo registrar aluno devolvesse um objeto do tipo Aluno
     // Aluno aluno1 = digitalHouseManager.registrarAluno("Carlos", "Maia", 001);
     // para que, ao matricular, pudessemos usar o proprio objeto para recuperar o código. O mesmo vale pro curso.
     // digitalHouseManager.matricularAluno(aluno1.getCodigo() , curso1.getCodigo());
digitalHouseManager.matricularAluno(001,2001);
digitalHouseManager.matricularAluno(002, 2001);
digitalHouseManager.matricularAluno(003, 2002);
digitalHouseManager.matricularAluno(001, 2002);
digitalHouseManager.matricularAluno(004, 2002);
digitalHouseManager.matricularAluno(005, 2002);
digitalHouseManager.matricularAluno(006, 2002);


digitalHouseManager.excluirCurso(2001);


    }
}
