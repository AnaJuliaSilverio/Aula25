package exercicio1;
public class Main {
    public static void main(String[] args) {
       Azul azul = new Azul(6);
       azul.setTonalidade(5);
       azul.calcularTonalidade();
       azul.tornarMaisEscuro();

       azul.mostrarInfoCor();

    }
}