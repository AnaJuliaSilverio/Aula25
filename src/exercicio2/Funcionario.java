package exercicio2;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class Funcionario {
    private String nome;
    private String dataAdmissao;
    private double salario;
    static int identificador = 0;
    private int idFuncionario;

    public Funcionario() {
        Funcionario.identificador++;
        idFuncionario = Funcionario.identificador;
    }

    public int getIdFuncionario() {
        return idFuncionario;
    }

    public void setIdFuncionario(int idFuncionario) {
        this.idFuncionario = idFuncionario;
    }

    public static int getIdentificador() {
        return identificador;
    }

    public static void setIdentificador(int identificador) {
        Funcionario.identificador = identificador;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDataAdmissao() {
        return dataAdmissao;
    }

    public void setDataAdmissao(String dataAdmissao) {
        LocalDate dataDeHoje = LocalDate.now();
        DateTimeFormatter formatarData = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        //.isAfter,it does not take into account the chronology, or calendar system.
        if (LocalDate.parse(dataAdmissao,formatarData).isAfter(dataDeHoje)){
            System.out.println("Não é possivel adicionar uma data futura!");
        }else {
            this.dataAdmissao = dataAdmissao;
        }

    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        if (salario>=700){
            this.salario = salario;
        }else{
            System.out.println("Valor invalido!O salário deve ser maior que R$700,00");
        }
    }

    @Override
    public String toString() {
        return "Nome:" + nome +
                "\nData de Admissao:" + dataAdmissao +
                "\nSalario:R$" + salario+
                "\nIdentificador: "+idFuncionario+"\n";
    }
}
