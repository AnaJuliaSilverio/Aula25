package exercicio1;
public class Azul{
    static int cor;
    public int tonalidade;
    public static String NOME = "Azul";
    public Azul(int tonalidade) {
        this.tonalidade=tonalidade;
    }
    public int getTonalidade() {return tonalidade;}
    public void setTonalidade(int tonalidade) {
        TornarTonalidadeMaisEscura(tonalidade);
    }
    public void tornarMaisEscuro() {
        if (Azul.cor<15){
            Azul.cor++;
        }else System.out.println("COR MÁXIMA");
    }
    void calcularTonalidade() {
        if (Azul.cor>0 && Azul.cor<5){
            System.out.println("Tonalidade nível: claro");
        }
        if (Azul.cor>5 && Azul.cor<10){
            System.out.println("Tonalidade nível: médio");
        }
        if (Azul.cor>10 && Azul.cor<15){
            System.out.println("Tonalidade nível: escuro");
        }
    }
    private void TornarTonalidadeMaisEscura(int valor) {
        this.tonalidade = valor;
    }

    public void mostrarInfoCor(){
        System.out.println("Cor: "+cor+"."+tonalidade);
        calcularTonalidade();
    }
}
