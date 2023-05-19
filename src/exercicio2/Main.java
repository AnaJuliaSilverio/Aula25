package exercicio2;

public class Main {
    public static void main(String[] args) {

        Funcionario funcionario1 = new Funcionario();
        Funcionario funcionario2 = new Funcionario();
        Funcionario funcionario3 = new Funcionario();

        funcionario1.setNome("Ana");
        funcionario1.setDataAdmissao("19/05/2023");
        funcionario1.setSalario(1200);

        funcionario2.setNome("Samuel");
        funcionario2.setDataAdmissao("15/05/2021");
        funcionario2.setSalario(2400);

        funcionario3.setNome("Heitor");
        funcionario3.setDataAdmissao("18/04/2024");
        funcionario3.setSalario(500);

        System.out.println(funcionario1.toString());
        System.out.println(funcionario2.toString());
        System.out.println(funcionario3.toString());


    }
}
