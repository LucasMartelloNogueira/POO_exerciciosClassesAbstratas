package POO_exerciciosClassesAbstratasEtc.Questao4;

import java.util.ArrayList;

abstract class Funcionario {

    public static ArrayList<Funcionario> listaFuncionarios = new ArrayList<Funcionario>();

    public static float calcularFolhaDepagamento(){
        float folhaDePagamento = 0.0f;
        
        for (Funcionario i : listaFuncionarios){
            folhaDePagamento += i.salarioTotal;
        }
        return folhaDePagamento;
    }

    private float salarioTotal;

    public Funcionario(){
        this.calcularSalario();
        listaFuncionarios.add(this);
    }

    public abstract float calcularSalario();

    public float getSalarioTotal(){
        return this.salarioTotal;
    }

    public void ajustarSalario(){

    }

}
