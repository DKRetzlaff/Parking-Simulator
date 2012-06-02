/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package simulador;

/**
 *
 * @author guilherme
 */
public class DesalocaVaga extends Evento{
    public static void main(int n){
        Desaloca(n);
    }
    public static void Desaloca(int n){
        Vaga.vagas[n]=false;
    }
    public void Desaloca(){
        
    }
}
