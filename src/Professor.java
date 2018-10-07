
// Esta classe poderia ser abstrata, já que não deveria ser instanciada
public class Professor {

    private String nome;
    private String sobrenome;
    private Integer tempoDeCasa;
    private Integer codigoDoProfessor;


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public Integer getTempoDeCasa() {
        return tempoDeCasa;
    }

    public void setTempoDeCasa(Integer tempoDeCasa) {
        this.tempoDeCasa = tempoDeCasa;
    }

    public Integer getCodigoDoProfessor() {
        return codigoDoProfessor;
    }

    public void setCodigoDoProfessor(Integer codigoDoProfessor) {
        this.codigoDoProfessor = codigoDoProfessor;
    }
}
