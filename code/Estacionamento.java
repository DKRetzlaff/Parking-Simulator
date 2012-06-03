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
     * verifica qual vaga esta diponivel
     * @return a vaga disponivel ou , caso nao haja nenhuma disponivel retorna o tamanho do estacionamento + 1;
     */
    public int buscaVaga()
    {
        int i;

        for (i = 0; i < numeroTotalVagas; i++)
        {
            if (vagas[i] == false)
            {
                return i;
            }
        }
        i++
        return i;
    }

}
