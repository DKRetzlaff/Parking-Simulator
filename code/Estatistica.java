public class Estatistica
{
	public int numeroVagas;
	public float duracaoSimulacao;
	public int numeroTotalRequisicaoVagas;
	public int numeroFalhasEmVagasOcupadas;	//numero de vagas que naum poderam ser ocupadas por estarem todas ocupadas
	
	public Estatistica()
	{
		numeroVagas = 0;
		duracaoSimulacao = 0;
		numeroTotalRequisicaoVagas = 0;
		numeroFalhasEmVagasOcupadas = 0;
	}
	
	public Estatistica(int numeroVagas, float duracaoSimulacao, int numeroTotalRequisicaoVagas, int numeroFalhasEmVagasOcupadas)
	{
		this.numeroVagas = numeroVagas;
		this.duracaoSimulacao = duracaoSimulacao;
		this.numeroTotalRequisicaoVagas = numeroTotalRequisicaoVagas;
		this.numeroFalhasEmVagasOcupadas = numeroFalhasEmVagasOcupadas;
	}
	
	
}
