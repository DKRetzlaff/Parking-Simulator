import java.util.Random

public class DesalocaVaga extends Evento{
	
	private Random aleatorio;

    public DesalocaVaga(double data, double duracao){
        this.data = data;
        this.duracao = duracao;
    }

    public void execucao(){
    }
    
    public Evento gerarProximo(){
		double hora;
		aleatorio = new Random();
		hora = aleatorio.nextDouble(120);
        Evento e = new AlocaVaga(this.getData(), random);
        return e;
    }
}
