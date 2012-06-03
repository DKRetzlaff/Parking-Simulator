public class Estacionamento {

    // vetor boolean de vagas do estacionamento
    private boolean vagas[];

    /**
     * Construtor Default
     */
    public Estacionamento() {
        vagas = new boolean[10];
    }


    /**
     * Construtor com parametro
     * @param n -> representa o numero de vagas do estacionamento
     */
    public Estacionamento(int n) {
        vagas = new boolean[n];
}


    /**
     * getVaga
     * @param n
     * @return retorna a vaga (V - F) na posicao n
     */
    public boolean getVaga(int n){
    
    return this.vagas[n];
    }

    /*
     * Altera o valor do vetor vagas na posição x
     * @param n
     */
    public void setVaga(int x){

        if(this.vagas[x] == false)
            this.vagas[x] = true;
        else
            this.vagas[x] = false;
        
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
