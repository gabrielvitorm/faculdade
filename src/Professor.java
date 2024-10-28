public final class Professor extends Pessoa implements Remuneravel{

    private double salario, precoHora;
    private int horaTrabalhada;
    public CARGO cargo;

    public Professor(){}

    public void setPrecoHora(double precoHora){
        this.precoHora = precoHora;
    }

    public void setHoraTrabalhada(int horaTrabalhada){
        this.horaTrabalhada = horaTrabalhada;
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

    @Override
    public void aplicarBonus() {

    }

    @Override
    public void calcularSalario(){
        salario = horaTrabalhada*precoHora;
    }
}
