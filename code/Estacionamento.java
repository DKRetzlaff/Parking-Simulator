public class Estacionamento 
{

    // vetor boolean de vagas do estacionamento
    private boolean vagas[];
    private static int numeroTotalVagas;
    /**
     * Construtor Default
     */
    public Estacionamento() 
    {
        vagas = new boolean[10];
        numeroTotalVagas = 10;
    }


    /**
     * Construtor com parametro
     * cria um estacionamento com o tamanhoTotalVagas estipulado
     */
    public Estacionamento(int tamanhoTotalVagas) 
    {
        vagas = new boolean[tamanhoTotalVagas];
        numeroTotalVagas = tamanhoTotalVagas;
    }


    /**
     * getVaga
     * 
     * retorna o boolean que esta na posicao informada do vetor de vagas
     */
    public boolean getVaga(int posicao){
    
        return this.vagas[posicao];
    }

    /*
     * Altera o boolean na posicao informada do vetor vagas
     */
    public void setVaga(int posicao){

        if(this.vagas[posicao] == false)
            this.vagas[posicao] = true;
        else
            this.vagas[posicao] = false;
        
    }

    /**
     * verifica quantas vagas estao diponiveis
     * @return numero de vagas disponiveis
     */
    public int vagaSobrando()
    {
        int i, contadorVagasLivres = 0;

        for (i = 0; i < numeroTotalVagas; i++)
        {
            if (vagas[i] == false)
            {
                contadorVagasLivres++;
            }
        }
        return contadorVagasLivres;
    }

}
