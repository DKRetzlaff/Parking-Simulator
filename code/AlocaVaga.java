public class AlocaVaga extends Evento{
	
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
		
    }
}
