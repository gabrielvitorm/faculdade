public class Professor extends Pessoa{

    private double salario, precoHora;
    private int horaTrabalhada;

    public Professor(){}

    public void setPrecoHora(double precoHora){
        this.precoHora = precoHora;
    }

    public void setHoraTrabalhada(int horaTrabalhada){
        this.horaTrabalhada = horaTrabalhada;
    }

    public void setSalario(double salario){
        this.salario = salario;
    }

    public double getSalario() {
        return salario;
    }

    public void calcularSalario(){
        salario = horaTrabalhada*precoHora;
    }

    public void exibirDetalhesProfessor(){
        System.out.printf("Matrícula: %d\nNome: %s\nIdade: %d\nSalário: R$%.2f\n",matricula, nome, idade, salario);
    }

    @Override
    public String toString() {
        return "Professor{" +
                "salario=" + salario +
                ", precoHora=" + precoHora +
                ", horaTrabalhada=" + horaTrabalhada +
                ", nome='" + nome + '\'' +
                ", idade=" + idade +
                ", matricula=" + matricula +
                '}';
    }
}
