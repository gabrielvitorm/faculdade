public class Coordenador extends Pessoa{

    public Coordenador(String nome, int idade){
        super(nome,idade);
    }
    public Coordenador(){}

    @Override
    public String toString() {
        return "Coordenador{" +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                ", matricula=" + matricula +
                '}';
    }
}
