public class Aluno extends Pessoa {

    String aprovacao;
    double media;
    private double nota1, nota2, nota3;

    public Aluno(){}

    public void setNota1(double nota1){
        this.nota1 = nota1;
    }

    public void setNota2(double nota2) {
        this.nota2 = nota2;
    }

    public void setNota3(double nota3) {
        this.nota3 = nota3;
    }

    public void calcularMedia(){
        media = (nota1+nota2+nota3)/3;
    }

    public void verificarAprovação(){
        if (media >= 7){
            aprovacao = "Aprovado!";
        }else if(media > 5 && media<6.9){
            aprovacao = "Recuperação!";
        }else {
            aprovacao = "Reprovado!";
        }
    }

    @Override
    public String toString() {
        return "Aluno{" +
                "aprovacao='" + aprovacao + '\'' +
                ", media=" + media +
                ", nota1=" + nota1 +
                ", nota2=" + nota2 +
                ", nota3=" + nota3 +
                ", nome='" + nome + '\'' +
                ", idade=" + idade +
                ", matricula=" + matricula +
                '}';
    }
    @Override
    public void quemSouEu() {
        System.out.println("Sou o aluno");
    }
    @Override
    public void minhaAtividade() {
        System.out.println("Estudar");
    }
}


