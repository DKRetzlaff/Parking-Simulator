import java.util.Random;

public class DesalocaVaga extends Evento{

private Random aleatorio;

    public DesalocaVaga(double data, double duracao){
        this.data = data;
        this.duracao = duracao;
    }

    @Override
    public void execucao(){
    }
    
    @Override
    public Evento gerarProximo(){
        double hora;
            aleatorio = new Random();
            hora = aleatorio.nextDouble();
        Evento e = new AlocaVaga(this.getData(), hora);
        return e;
    }
}