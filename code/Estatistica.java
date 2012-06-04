public class Estatistica{

private static int cont;
private static double tempoTotal;

    public Estatistica(){
        cont = 0;
        tempoTotal = 0;
    }

    public static void incCont(){
        cont++;
    }

    public static void incDuracao(int duracao){
        tempoTotal += duracao;
    }

    public void geraRelatorio(){
        System.out.printf("Tempo médio de carro na vaga: %f", tempoTotal / cont);

    }
}