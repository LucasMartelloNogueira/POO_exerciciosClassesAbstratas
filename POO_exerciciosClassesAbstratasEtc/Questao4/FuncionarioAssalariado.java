package POO_exerciciosClassesAbstratasEtc.Questao4;

public class FuncionarioAssalariado extends Funcionario{
    private float salarioSemanalFixo;

    public FuncionarioAssalariado(float salarioSemanalFixo){
        super();
        this.salarioSemanalFixo = salarioSemanalFixo;
    }

    public float calcularSalario(){
        float salario = salarioSemanalFixo;
        return salario;
    }
}
