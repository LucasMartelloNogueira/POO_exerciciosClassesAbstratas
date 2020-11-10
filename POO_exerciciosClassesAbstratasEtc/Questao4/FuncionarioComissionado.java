package POO_exerciciosClassesAbstratasEtc.Questao4;

public class FuncionarioComissionado extends Funcionario{
    private float porcentagemVendas;
    private float valorTotalVendas;

    public FuncionarioComissionado(float porcentagemVendas, float valorTotalVendas){
        super();
        this.porcentagemVendas = porcentagemVendas;
        this.valorTotalVendas = valorTotalVendas;
    }
    
    public float calcularSalario(){
        float salario = (this.porcentagemVendas / 100) * this.valorTotalVendas;
        return salario;
    }
}
