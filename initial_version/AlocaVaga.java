/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package simulador;

/**
 *
 * @author guilherme
 */
public class AlocaVaga extends Evento {
    
    public static void main(int n){
        
        Aloca(n);

    }
    public static void Aloca(int n){
     //   Vaga vaga= new Vaga();
        Vaga.vagas[n]=true;//n vai receber BuscaVaga()
    }                       //vagas[n] é a vaga que foi criada da classe estacionamento quando
                            // fica true significa que ela esta ocupada
    public void Aloca(){    //caso nao tenha valor nao faz nada pois nao tem a vaga

    }
}
