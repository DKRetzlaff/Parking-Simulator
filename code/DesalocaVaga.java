public class DesalocaVaga extends Evento
{

    //Método utilizado para desestacionar um veiculo que se encontra na posição x;
    public boolean desestaciona(Estacionamento veiculo, int x)
    {
        boolean flagAux;
        
        
        flagAux = veiculo.getVaga(x);

        if(flagAux == false)
        {
            return false;
        }
        else
        {
            veiculo.setVaga(x);
            return true;
        }
    
    }

}
