package POO_exerciciosClassesAbstratasEtc.Questao5;

import java.util.ArrayList;

public class RegistroRecebimentos implements Recebivel{
    
    public static ArrayList<Recebivel> registro = new ArrayList<>();

    public double totalizarReceita(){
        double valorReceita = 0;

        for (Recebivel i : registro){
            valorReceita += i.totalizarReceita();
        }

        return valorReceita;
    }

    public void exibirInfo(){
        
        for (Recebivel i : registro){
            i.exibirInfo();
            System.out.println("-----------------------");
        }
    }

}
