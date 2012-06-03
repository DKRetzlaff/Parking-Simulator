import java.util.Random

public class AlocaVaga extends Evento{
    private double hora;
    private Random aleatorio;	
    private int n;
	
    public AlocaVaga(){
	n = buscaVaga();
    }

    public void execucao(){
	if(n > 0 && n <= vagas){
            setVaga(n, false);
	}
    }
    
    public Evento gerarProximo(){
        aleatorio = new Random();
        hora = aleatorio.nextDouble();
	Evento e = new DesalocaVaga(n, hora);
        return e;
    }
}
