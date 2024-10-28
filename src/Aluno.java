public class Aluno extends Pessoa {

    String aprovacao;
    double media;
    private double nota1, nota2, nota3;

    public Aluno(){}

    public void setNota1(double nota1){
        this.nota1 = nota1;
    }

    public double getNota1(){
        return nota1;
    }

    public double getNota2() {
        return nota2;
    }

    public void setNota2(double nota2) {
        this.nota2 = nota2;
    }

    public double getNota3() {
        return nota3;
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

    public void exibirDetalhesAluno(){
        System.out.printf("Matrícula: %d\nAluno: %s\nIdade: %d\nNota 1: %.2f\nNota 2: %.2f\nNota 3: %.2f\nMéia: %.2f\nSituação: %s\n",matricula, nome, idade, nota1, nota2, nota3, media, aprovacao);
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
}


