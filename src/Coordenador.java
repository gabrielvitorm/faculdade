public class Coordenador extends Pessoa implements Remuneravel{

    public Coordenador(String nome, int idade){
        super(nome,idade);
    }
    public Coordenador(){}
    public CARGO cargo;

    @Override
    public String toString() {
        return "Coordenador{" +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                ", matricula=" + matricula +
                '}';
    }

    @Override
    public void quemSouEu(){
        System.out.println("Sou o Coordenador");
    }

    @Override
    public void minhaAtividade(){
        System.out.println("Coordenar");
    }

    @Override
    public void aplicarBonus() {

    }

    @Override
    public void calcularSalario(){

    }
}
