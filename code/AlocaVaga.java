public class AlocaVaga extends Evento{
	
    public AlocaVaga(double data, double duracao){
	this.data = data;
	this.duracao = duracao;
    }

    public void execucao(){
	Estatistica.incCont();
	Estatistica.incDuracao(this.duracao);
    }
    
    public Evento gerarProximo(){
	Evento e = new DesalocaVaga(this.getData() + this.getDuracao());
	return e;
    }
}