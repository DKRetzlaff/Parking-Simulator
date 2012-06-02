
public class DesalocaVaga extends Evento{


    public boolean desestaciona(Estacionamento a, int n){
        boolean c;

       c = a.getVaga(n);

       if(c == false)
           return false;
       else
           a.setVaga(n);
    return true;
    }

}
