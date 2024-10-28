import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Aluno c = new Aluno();
        Professor p = new Professor();
        Coordenador co = new Coordenador("Marcelo", 45);
        Disciplina d = new Disciplina();

        System.out.println("Programa de Gestão de Faculdade");

        int x,r;
        do {
            System.out.println("Escolha uma das opções abaixo\n1 - Cadastrar Aluno\n2 - Cadastrar professor\n3 - Ver Cadastro Coordenador\n4 - Ver Cadastro do Aluno\n5 - Ver cadastro do Professor\n6 - Cadastrar Disciplina\n7 - Ver dados da Disciplina");
            x = sc.nextInt();
            switch (x){
                case 1:
                    System.out.println("Digite o número de matrícula do aluno:");
                    c.setMatricula(sc.nextInt());
                    System.out.println("Digite o nome do Aluno:");
                    c.setNome(sc.next());
                    System.out.println("Digite a idade do Aluno:");
                    c.setIdade(sc.nextInt());
                    System.out.println("Digite a 1° Nota");
                    c.setNota1(sc.nextDouble());
                    System.out.println("Digite a 2° Nota");
                    c.setNota2(sc.nextDouble());
                    System.out.println("Digite a 3° Nota");
                    c.setNota3(sc.nextDouble());
                    break;
                case 2:
                    System.out.println("Digite o número de matrícula do professor:");
                    p.setMatricula(sc.nextInt());
                    System.out.println("Digite o nome do Professor:");
                    p.setNome(sc.next());
                    System.out.println("Digite a idade do Professor:");
                    p.setIdade(sc.nextInt());
                    System.out.println("Digite o preço da hora do professor:");
                    p.setPrecoHora(sc.nextDouble());
                    System.out.println("Digite a quantidade de horas trabalhadas:");
                    p.setHoraTrabalhada(sc.nextInt());
                    break;
                case 3:
                    System.out.println("Cargo: " +CARGO.Coordenador);
                    System.out.println("Nome: " +co.getNome());
                    System.out.println("Idade: " +co.getIdade());
                    break;
                case 4:
                    c.calcularMedia();
                    c.verificarAprovação();
                    System.out.println("Informações do Aluno:");
                    System.out.println(c);
                    break;
                case 5:
                    p.calcularSalario();
                    System.out.println("Informações do Professor");
                    System.out.println("Cargo: " +CARGO.Professor);
                    System.out.println(p);
                    break;
                case 6:
                    System.out.println("Digite o nome da disciplina:");
                    d.setNome(sc.next());
                    System.out.println("Digite o turno da disciplina:");
                    d.setTurno(sc.next());
                    System.out.println("Digite a carga horária da disciplina:");
                    d.setCargaHoraria(sc.nextInt());
                    d.ministrarDisciplina(p);
                    d.cadastrarAluno(c);
                    break;
                case 7:
                    System.out.println("Dados da disciplina:");
                    c.calcularMedia();
                    c.verificarAprovação();
                    p.calcularSalario();
                    System.out.println(d);
                    break;
                default:
                    System.out.println("Opção Inválida!");
            }System.out.println("Digite 0 para acessar o menu");
            r = sc.nextInt();
        }while (r==0);
    }
}