public class Estacionamento {

    // vetor boolean de vagas do estacionamento
    private boolean vagas[];
    private int numVagas;

    /**
     * Construtor Default
     */
    private Estacionamento() {
		int i;
		numVagas = 10;
        vagas = new boolean[10];
        for(i = 0; i < 10; i++){
			vagas[i] = true;
		}
    }


    /**
     * Construtor com parametro
     * @param n -> representa o numero de vagas do estacionamento
     */
    private Estacionamento(int n) {
		numVagas = n;
        vagas = new boolean[n];
        for(i = 0; i < n; i++){
			vagas[i] = true;
		}
	}

    /**
     * altera o valor do vetor vagas na posicao n
     * @param n
     */
    public void setVaga(int n, boolean val){
        this.vagas[n] = val;        
    }

    /**
     * verifica quantas vagas estao diponiveis
     * @param n -> numero de vagas total
     * @return numero de vagas disponiveis
     */
    public int buscaVaga(){
        int i;

        for (i = 0; i < numVagas; i++){
            if (vagas[i] == true)
                return i;
            else
				return -1;
        }
        
     return cont;
    }

}
