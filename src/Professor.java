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

    public void calcularSalario(){
        salario = horaTrabalhada*precoHora;
    }

    @Override
    public String toString() {
        return "Professor{" +
                "Salario" + salario +
                ", Preço da Horas" + precoHora +
                ", Horas Trabalhadas" + horaTrabalhada +
                ", nome='" + nome + '\'' +
                ", idade=" + idade +
                ", matricula=" + matricula +
                '}';
    }

    @Override
    public void quemSouEu(){
        System.out.println("Sou Professor");
    }

    @Override
    public void minhaAtividade(){
        System.out.println("Ensinar");
    }
}
