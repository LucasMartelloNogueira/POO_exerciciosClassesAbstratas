package POO_exerciciosClassesAbstratasEtc.Questao4;

public class FuncionarioHoraExtra extends Funcionario{
    private float salarioSemanalFixo;
    private float salarioPorHora;
    private float horasExtrasTrabalhadas;

    public FuncionarioHoraExtra(float salarioSemanalFixo, float salarioPorHora, float horasExtrasTrabalhadas){
        super();
        this.salarioSemanalFixo = salarioSemanalFixo;
        this.salarioPorHora = salarioPorHora;
        this.horasExtrasTrabalhadas = horasExtrasTrabalhadas;
    }

    public float calcularSalario(){
        float valorHorasExtras = this.salarioPorHora * this.horasExtrasTrabalhadas;
        float salario = this.salarioSemanalFixo + valorHorasExtras;
        return salario;
    }
}
