package POO_exerciciosClassesAbstratasEtc.Questao2e3;

public class Escola extends Edificio{
    
    Escola(int numeroDePessoas, float gastoDeEnergia, float emissaoCarbonoPorKwh){
        super(numeroDePessoas, gastoDeEnergia, emissaoCarbonoPorKwh);
        this.setTipoDeEdificio("Escola");
    }

}
