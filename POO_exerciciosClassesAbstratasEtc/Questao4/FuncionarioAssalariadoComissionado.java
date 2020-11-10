package POO_exerciciosClassesAbstratasEtc.Questao4;

public class FuncionarioAssalariadoComissionado extends Funcionario{
    private float salarioSemanalFixo;
    private float porcentagemVendas;
    private float valorTotalVendas;

    public FuncionarioAssalariadoComissionado(float salarioSemanalFixo, float porcentagemVendas, float valorTotalVendas){
        super();
        this.salarioSemanalFixo = salarioSemanalFixo;
        this.porcentagemVendas = porcentagemVendas;
        this.valorTotalVendas = valorTotalVendas;
        this.ajustarSalario();
    }

    public float calcularSalario(){
        float valorComissaoVendas = (this.porcentagemVendas / 100) * this.valorTotalVendas;
        float salario = this.salarioSemanalFixo + valorComissaoVendas;
        return salario;
    }

    // ajuste no salario
    public void ajustarSalario(){
        this.salarioSemanalFixo = this.salarioSemanalFixo * 1.1f;
    }

}
