public abstract class Pessoa {

    protected String nome;
    protected int idade, matricula;

    public Pessoa (String nome, int idade){
        this.nome = nome;
        this.idade = idade;
    }
    public Pessoa(){}

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public String getNome(){
        return nome;
    }

    public void setIdade(int idade){
        this.idade = idade;
    }

    public int getIdade(){
        return idade;
    }

    @Override
    public String toString() {
        return "Pessoa{" +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                ", matricula=" + matricula +
                '}';
    }

    public abstract void quemSouEu();
    public abstract void minhaAtividade();
}
