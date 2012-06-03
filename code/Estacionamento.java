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
     */
    public Estacionamento(int numeroTotalVagas) 
    {
        vagas = new boolean[numeroTotalVagas];
        this.numeroTotalVagas = numeroTotalVagas;
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
     * @param n -> numero de vagas total
     * @return numero de vagas disponiveis
     */
    public int vagaSobrando(int n){
        int i, cont = 0;

        for (i = 0; i < n; i++){
            if (vagas[i] == false)
                cont++;
        }
        
     return cont;
    }

}
