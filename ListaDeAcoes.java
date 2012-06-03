import java.util.ArrayList;

public class ListaDeAcoes {
    protected ArrayList<Evento> acoes;

    public ListaDeAcoes() {
        acoes = new ArrayList<Evento>();
    }
    
    /**
     * Insere no final da lista a acao
     * @param Acao acao
     */
    public void setAcao(Evento acao) {
        acoes.add(acao);
    }

    public void setAcao(int posicao, Evento acao){
        acoes.add(posicao, acao);
    }

    public Evento getAcao() {
	return acoes.remove(0);
    }

    public Evento getAcao(int posicao) {
        return acoes.remove(posicao);
    }

    public boolean isEmpty(){
        int size;

        size = this.acoes.size();
        if (size == 0){
            return true;
        }
        return false;
    }
}