package POO_exerciciosClassesAbstratasEtc.Questao2e3;

public class Casa extends Edificio {
   
    Casa(int numeroDePessoas, float gastoDeEnergia, float emissaoCarbonoPorKwh){
        super(numeroDePessoas, gastoDeEnergia, emissaoCarbonoPorKwh);
        this.setTipoDeEdificio("Casa");
    }

}
